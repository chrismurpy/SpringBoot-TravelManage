package com.murphy.controller;

import com.github.pagehelper.PageInfo;
import com.murphy.domain.User;
import com.murphy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * 用户管理 - Controller
 *
 * @author murphy
 * @since 2021/8/17 9:15 下午
 */
@Controller
@RequestMapping("/admin/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 分页查询
     * @param user
     * @param pageNum
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/page")
    public String page(User user,
                       @RequestParam(defaultValue = "1") Integer pageNum,
                       @RequestParam(defaultValue = "5") Integer pageSize,
                       Model model) {
        PageInfo<User> page = userService.findPage(user, pageNum, pageSize);
        model.addAttribute("page", page);
        return "/user/list";
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd() {
        return "/user/add";
    }

    /**
     * 添加
     * @param user
     * @return
     */
    @RequestMapping("/add")
    public String add(User user) {
        userService.add(user);
        return "redirect:/admin/user/page";
    }

    /**
     * 跳转到修改页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/toUpdate/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "/user/update";
    }

    /**
     * 修改
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public String update(User user) {
        userService.update(user);
        return "redirect:/admin/user/page";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        userService.delete(id);
        return "redirect:/admin/user/page";
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public String batchDelete(@RequestParam("ids") Integer[] ids) {
        for (Integer id : ids) {
            userService.delete(id);
        }
        return "redirect:/admin/user/page";
    }
}
