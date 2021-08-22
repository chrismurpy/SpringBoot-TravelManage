package com.murphy.service;

import com.murphy.domain.RouteImg;

import java.util.List;

/**
 * 详细线路图片 - Service
 *
 * @author murphy
 * @since 2021/8/22 3:03 下午
 */
public interface RouteImgService {

    /**
     * 处理线路图片
     * @param rid：线路ID - 根据线路ID删除原图
     * @param routeImgs：要添加的新图列表
     */
    public void saveImg(Integer rid, List<RouteImg> routeImgs);

}
