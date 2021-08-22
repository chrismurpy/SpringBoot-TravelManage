package com.murphy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.murphy.domain.Category;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 线路分类 - Dao
 *
 * @author murphy
 * @since 2021/8/20 12:35 下午
 */
public interface CategoryDao extends BaseMapper<Category> {
    List<Category> selectByOrder();

    @Select("select cname,cid from tab_category where cid = #{id}")
    Category findById(Integer id);
}
