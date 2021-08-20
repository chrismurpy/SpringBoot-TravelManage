package com.murphy.service;

import com.github.pagehelper.PageInfo;
import com.murphy.domain.Seller;

import java.util.List;

/**
 * 商家管理 - Service接口
 *
 * @author murphy
 * @since 2021/8/20 12:13 下午
 */
public interface SellerService {

    /**
     * 分页查询
     * @param seller
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<Seller> findPage(Seller seller, int pageNum, int pageSize);

    /**
     * 查询
     * @param seller
     * @return
     */
    public List<Seller> find(Seller seller);

    /**
     * 添加
     * @param seller
     * @return
     */
    public int add(Seller seller);

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    public Seller findById(Integer id);

    /**
     * 修改
     * @param seller
     * @return
     */
    public int update(Seller seller);

    /**
     * 删除
     * @param id
     * @return
     */
    public int delete(Integer id);
}
