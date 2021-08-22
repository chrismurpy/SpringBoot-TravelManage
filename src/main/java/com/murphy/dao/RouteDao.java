package com.murphy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.murphy.domain.Route;

import java.util.List;

/**
 * 旅游线路 - Dao
 *
 * @author murphy
 * @since 2021/8/20 4:32 下午
 */
public interface RouteDao extends BaseMapper<Route> {

    /**
     * 分页查询
     * @param route
     * @return
     */
    public List<Route> find(Route route);

    /**
     * 根据ID查询线路
     * @param id
     * @return
     */
    public Route findById(Integer id);
}
