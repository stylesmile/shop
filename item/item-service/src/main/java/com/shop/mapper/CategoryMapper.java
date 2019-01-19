package com.shop.mapper;

import com.shop.entity.Category;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @description: 商品分类mapper
 * @author: Stylesmile
 * @date: 2019/01/06
 */
public interface CategoryMapper extends Mapper<Category> {
    List<Category> queryCategoryListByPid(Long pid);
}
