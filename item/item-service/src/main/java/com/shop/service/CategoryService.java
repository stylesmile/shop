package com.shop.service;

import com.shop.ExceptionEnums;
import com.shop.entity.Category;
import com.shop.exception.ShopException;
import com.shop.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @description: category
 * @author: Stylesmile
 * @date: 2019/01/06
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


    public List<Category> queryCategoryListByPid(Long pid) {
        Category category =  new Category();
        category.setParentId(pid);
        List<Category> list= categoryMapper.select(category);
        if(Objects.isNull(list)){
            throw new ShopException(ExceptionEnums.PRICE_CONNOT_BE_NULL);
        }
        return categoryMapper.queryCategoryListByPid(pid);
    }
}
