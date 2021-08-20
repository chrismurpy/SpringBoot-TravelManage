package com.murphy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 旅游线路 - 实体类
 *
 * @author murphy
 * @since 2021/8/20 12:33 下午
 */
@Data
@TableName("tab_category")
public class Category implements Serializable {

    /**
     * 分类ID
     */
    @TableId(type = IdType.AUTO)
    private Integer cid;
    private String cname;
}
