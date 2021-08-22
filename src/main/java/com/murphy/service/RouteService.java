package com.murphy.service;

import com.github.pagehelper.PageInfo;
import com.murphy.domain.Route;

/**
 * Route - Service层
 *
 * @author murphy
 * @since 2021/8/22 11:27 上午
 */
public interface RouteService {

    /**
     * 分页查询
     * @param route
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<Route> findPage(Route route, Integer pageNum, Integer pageSize);

    /**
     * 添加
     * @param route
     * @return
     */
    public int add(Route route);

    /**
     * 查询
     * @param id
     * @return
     */
    public Route findById(Integer id);

    /**
     * 更新
     * @param route
     * @return
     */
    public int update(Route route);

    /**
     * 删除
     * @param id
     * @return
     */
    public int delete(Integer id);
}
