package com.murphy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.murphy.domain.Seller;
import com.murphy.domain.User;

import java.util.List;

/**
 * 商家管理 - Dao
 *
 * @author murphy
 * @since 2021/8/20 12:01 下午
 */
public interface SellerDao extends BaseMapper<Seller> {

    /**
     * 模糊查询
     * @param seller
     * @return
     */
    public List<Seller> selectByNameAndAddress(Seller seller);
}
