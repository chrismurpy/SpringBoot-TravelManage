package com.murphy.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.murphy.dao.RouteImgDao;
import com.murphy.domain.RouteImg;
import com.murphy.service.RouteImgService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 详细线路图片 - Service实现类
 *
 * @author murphy
 * @since 2021/8/22 3:04 下午
 */
@Service
public class RouteImgServiceImpl implements RouteImgService {

    @Resource
    private RouteImgDao routeImgDao;

    /**
     * 处理线路图片
     *
     * @param rid
     * @param routeImgs
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void saveImg(Integer rid, List<RouteImg> routeImgs) {
        routeImgDao.delete(Wrappers.<RouteImg>query().eq("rid", rid));
        for (RouteImg routeImg : routeImgs) {
            routeImgDao.insertImg(routeImg);
        }
    }
}
