package com.murphy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 线路的图片列表 - 实体类
 *
 * @author murphy
 * @since 2021/8/20 4:27 下午
 */
@Data
@TableName("tab_route_img")
public class RouteImg implements Serializable {

    /**
     * 商品图片ID
     */
    @TableId(type = IdType.AUTO)
    private Integer rgid;
    /**
     * 旅游商品ID
     */
    private Integer rid;
    /**
     * 详情商品大图
     */
    private String bigPic;
    /**
     * 详情商品小图
     */
    private String smallPic;
}
