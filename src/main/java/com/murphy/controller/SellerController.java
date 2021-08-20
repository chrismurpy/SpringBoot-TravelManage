package com.murphy.controller;

import com.github.pagehelper.PageInfo;
import com.murphy.domain.Seller;
import com.murphy.service.SellerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * 旅游公司 - Controller
 *
 * @author murphy
 * @since 2021/8/20 12:22 下午
 */
@Controller
@RequestMapping("/admin/seller")
public class SellerController {

    @Resource
    private SellerService sellerService;

    /**
     * 分页查询
     * @param seller
     * @param pageNum
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/page")
    public String page(Seller seller,
                       @RequestParam(defaultValue = "1") Integer pageNum,
                       @RequestParam(defaultValue = "5") Integer pageSize,
                       Model model) {
        PageInfo<Seller> page = sellerService.findPage(seller, pageNum, pageSize);
        model.addAttribute("page", page);

        return "seller/list";
    }

    /**
     * 跳转到新增页面
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd() {
        return "seller/add";
    }

    /**
     * 新增
     * @param seller
     * @return
     */
    @RequestMapping("/add")
    public String add(Seller seller) {
        sellerService.add(seller);
        return "redirect:/admin/seller/page";
    }

    /**
     * 跳转到修改页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/toUpdate/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model) {
        Seller seller = sellerService.findById(id);
        model.addAttribute("seller", seller);
        return "seller/update";
    }

    /**
     * 修改
     * @param seller
     * @return
     */
    @RequestMapping("/update")
    public String update(Seller seller) {
        sellerService.update(seller);
        return "redirect:/admin/seller/page";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        sellerService.delete(id);
        return "redirect:/admin/seller/page";
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public String batchDelete(@RequestParam("ids") Integer[] ids) {
        for (Integer id : ids) {
            sellerService.delete(id);
        }
        return "redirect:/admin/seller/page";
    }
}
