package com.murphy.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.murphy.dao.CategoryDao;
import com.murphy.domain.Category;
import com.murphy.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * CategoryServiceImpl - Service实现
 *
 * @author murphy
 * @since 2021/8/20 12:39 下午
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryDao categoryDao;

    /**
     * 查询
     *
     * @return
     */
    @Override
    public List<Category> find() {
        return categoryDao.selectByOrder();
    }

    /**
     * 添加
     *
     * @param category
     * @return
     */
    @Override
    public int add(Category category) {
        return categoryDao.insert(category);
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public Category findById(Integer id) {
        return categoryDao.selectById(id);
    }

    /**
     * 修改
     *
     * @param category
     * @return
     */
    @Override
    public int update(Category category) {
        return categoryDao.updateById(category);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int delete(Integer id) {
        return categoryDao.deleteById(id);
    }
}
