package com.murphy.controller;

import com.murphy.domain.Category;
import com.murphy.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * 线路分类 - Controller
 *
 * @author murphy
 * @since 2021/8/20 1:31 下午
 */
@Controller
@RequestMapping("/admin/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    /**
     * 查询所有分类
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String find(Model model) {
        List<Category> list = categoryService.find();
        model.addAttribute("list", list);
        return "category/list";
    }

    /**
     * 跳转到新增页面
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd() {
        return "category/add";
    }

    /**
     * 新增
     * @param category
     * @return
     */
    @RequestMapping("/add")
    public String add(Category category) {
        categoryService.add(category);
        return "redirect:/admin/category/list";
    }

    /**
     * 跳转到修改页面
     * @return
     */
    @RequestMapping("/toUpdate/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model) {
        Category category = categoryService.findById(id);
        model.addAttribute("category", category);
        return "category/update";
    }

    /**
     * 修改
     * @param category
     * @return
     */
    @RequestMapping("/update")
    public String update(Category category) {
        categoryService.update(category);
        return "redirect:/admin/category/list";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        categoryService.delete(id);
        return "redirect:/admin/category/list";
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public String batchDelete(@RequestParam("ids") Integer[] ids) {
        for (Integer id : ids) {
            categoryService.delete(id);
        }
        return "redirect:/admin/category/list";
    }
}
