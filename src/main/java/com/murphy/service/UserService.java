package com.murphy.service;

import com.github.pagehelper.PageInfo;
import com.murphy.domain.User;

import java.util.List;

/**
 * 用户管理 - Service
 *
 * @author murphy
 * @since 2021/8/17 8:59 下午
 */
public interface UserService {

    /**
     * 分页查询
     * @param condition
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<User> findPage(User condition, int pageNum, int pageSize);

    /**
     * 查询
     * @param condition
     * @return
     */
    public List<User> find(User condition);

    /**
     * 添加
     * @param user
     * @return
     */
    public int add(User user);

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    public User findById(Integer id);

    /**
     * 修改
     * @param user
     * @return
     */
    public int update(User user);

    /**
     * 删除
     * @param id
     * @return
     */
    public int delete(Integer id);
}
