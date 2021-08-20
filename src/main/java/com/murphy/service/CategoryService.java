package com.murphy.service;

import com.murphy.domain.Category;

import java.util.List;

/**
 * 线路分类 - Service接口
 *
 * @author murphy
 * @since 2021/8/20 12:36 下午
 */
public interface CategoryService {

    /**
     * 查询
     * @return
     */
    public List<Category> find();

    /**
     * 添加
     * @param category
     * @return
     */
    public int add(Category category);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Category findById(Integer id);

    /**
     * 修改
     * @param category
     * @return
     */
    public int update(Category category);

    /**
     * 删除
     * @param id
     * @return
     */
    public int delete(Integer id);
}
