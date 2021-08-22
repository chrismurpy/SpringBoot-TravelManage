package com.murphy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.murphy.domain.RouteImg;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 线路图片 - Dao
 *
 * @author murphy
 * @since 2021/8/22 11:24 上午
 */
public interface RouteImgDao extends BaseMapper<RouteImg> {

    @Select("select * from tab_route_img where rid = #{rid}")
    List<RouteImg> findByRid(Integer id);

    int insertImg(RouteImg routeImg);
}
