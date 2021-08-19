package com.murphy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.murphy.domain.User;

import java.util.List;

/**
 * 用户管理 - 增删改查
 *
 * @author murphy
 * @since 2021/8/17 6:22 下午
 */
public interface UserDao extends BaseMapper<User> {
    /**
     * 模糊查询
     * @param user
     * @return
     */
    public List<User> selectByNameAndEmail(User user);
}
