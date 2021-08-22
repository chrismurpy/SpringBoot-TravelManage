package com.murphy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.murphy.dao.RouteDao;
import com.murphy.domain.Route;
import com.murphy.service.RouteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 旅行线路 - Service实现类
 *
 * @author murphy
 * @since 2021/8/22 11:30 上午
 */
@Service
public class RouteServiceImpl implements RouteService {

    @Resource
    private RouteDao routeDao;

    /**
     * 分页查询
     *
     * @param route
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Route> findPage(Route route, Integer pageNum, Integer pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> {
            routeDao.find(route);
        });
    }

    /**
     * 添加
     *
     * @param route
     * @return
     */
    @Override
    public int add(Route route) {
        return routeDao.insert(route);
    }

    /**
     * 查询
     *
     * @param id
     * @return
     */
    @Override
    public Route findById(Integer id) {
        return routeDao.findById(id);
    }

    /**
     * 更新
     *
     * @param route
     * @return
     */
    @Override
    public int update(Route route) {
        return routeDao.updateById(route);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int delete(Integer id) {
        return routeDao.deleteById(id);
    }
}
