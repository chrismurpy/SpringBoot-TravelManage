package com.murphy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 旅游公司 - 商家实体类
 *
 * @author murphy
 * @since 2021/8/20 11:59 上午
 */
@Data
@TableName("tab_seller")
public class Seller implements Serializable {

    /**
     * 商家ID
     */
    @TableId(type = IdType.AUTO)
    private Integer sid;
    /**
     * 商家姓名
     */
    private String sname;
    /**
     * 商家电话
     */
    private String consphone;
    /**
     * 商家地址
     */
    private String address;

}
