package com.shop.service;

import com.shop.entity.Item;
import com.shop.enums.ExceptionEnums;
import com.shop.entity.Category;
import com.shop.exception.ShopException;
import com.shop.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author Stylesmile
 * @description category
 * @date 2019/01/06
 */
@Service
public class CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryListByPid(Long pid) {
        List<Category> list = categoryMapper.queryCategoryListByPid();
        //判断结果
        if (Objects.isNull(list)) {
            throw new ShopException(ExceptionEnums.CATEGORY_NOT_FOUND);
         }
        return list;
    }

    public void save(Category category) {
        categoryMapper.insert(category);
    }
}
