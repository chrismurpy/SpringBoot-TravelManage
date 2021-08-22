package com.murphy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 旅行线路 - 实体类
 *
 * @author murphy
 * @since 2021/8/20 4:08 下午
 */
@Data
@TableName("tab_route")
public class Route implements Serializable {
    /**
     * 线路ID
     */
    @TableId(type = IdType.AUTO)
    private Integer rid;
    /**
     * 线路名
     */
    private String rname;
    /**
     * 价格
     */
    private Double price;
    /**
     * 线路介绍
     */
    private String routeIntroduce;
    /**
     * 是否上架 - 0：未上架 / 1：上架
     */
    private String rflag;
    /**
     * 上架时间
     */
    private String rdate;
    /**
     * 是否主题旅游 - 0：不是 / 1：是
     */
    private String isThemeTour;
    /**
     * 收藏数量
     */
    private Integer count;
    /**
     * 所属分类
     */
    private Integer cid;
    /**
     * 缩略图
     */
    private String rimage;
    /**
     * 所属商家
     */
    private Integer sid;
    /**
     * 抓取数据来源的ID
     */
    private String sourceId;

    /**
     * 所属分类，用resultMap的association处理
     */
    @TableField(exist = false)
    private Category category;
    /**
     * 所属商家，用resultMap的association处理
     */
    @TableField(exist = false)
    private Seller seller;
    /**
     * 商品详情图片列表，关联属性，Mybatis-Plus不能查，需要配置resultMap使用collection处理
     */
    @TableField(exist = false)
    private List<RouteImg> routeImgList;
}
