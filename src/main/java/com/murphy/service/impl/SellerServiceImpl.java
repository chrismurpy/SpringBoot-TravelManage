package com.murphy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.murphy.dao.SellerDao;
import com.murphy.domain.Seller;
import com.murphy.service.SellerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * SellerServiceImpl - Service实现
 *
 * @author murphy
 * @since 2021/8/20 12:18 下午
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Resource
    private SellerDao sellerDao;

    /**
     * 分页查询
     *
     * @param seller
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Seller> findPage(Seller seller, int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> {
            sellerDao.selectByNameAndAddress(seller);
        });
    }

    /**
     * 查询
     *
     * @param seller
     * @return
     */
    @Override
    public List<Seller> find(Seller seller) {
        return sellerDao.selectList(Wrappers.query());
    }

    /**
     * 添加
     *
     * @param seller
     * @return
     */
    @Override
    public int add(Seller seller) {
        return sellerDao.insert(seller);
    }

    /**
     * 根据ID查询用户
     *
     * @param id
     * @return
     */
    @Override
    public Seller findById(Integer id) {
        return sellerDao.selectById(id);
    }

    /**
     * 修改
     *
     * @param seller
     * @return
     */
    @Override
    public int update(Seller seller) {
        return sellerDao.updateById(seller);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int delete(Integer id) {
        return sellerDao.deleteById(id);
    }
}
