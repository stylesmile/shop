package com.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description 商品分类mapper
 * @author Stylesmile
 * @date 2019/01/06
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
    List<Category> queryCategoryListByPid();
}
