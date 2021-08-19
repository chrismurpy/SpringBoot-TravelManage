package com.murphy.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.murphy.dao.UserDao;
import com.murphy.domain.User;
import com.murphy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * UserServiceImpl - Service实现
 *
 * @author murphy
 * @since 2021/8/17 9:07 下午
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    /**
     * 分页查询
     *
     * @param user
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<User> findPage(User user, int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> {
            userDao.selectByNameAndEmail(user);
        });
    }

    /**
     * 查询
     *
     * @param condition
     * @return
     */
    @Override
    public List<User> find(User condition) {
        return userDao.selectList(Wrappers.query());
    }

    /**
     * 添加
     *
     * @param user
     * @return
     */
    @Override
    public int add(User user) {
        return userDao.insert(user);
    }

    /**
     * 根据ID查询用户
     *
     * @param id
     * @return
     */
    @Override
    public User findById(Integer id) {
        return userDao.selectById(id);
    }

    /**
     * 修改
     *
     * @param user
     * @return
     */
    @Override
    public int update(User user) {
        return userDao.updateById(user);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int delete(Integer id) {
        return userDao.deleteById(id);
    }
}
