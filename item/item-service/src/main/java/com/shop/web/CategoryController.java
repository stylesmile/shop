package com.shop.web;

import com.shop.entity.Category;
import com.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Locale;

/**
 * @description: 商品分类
 * @author: Stylesmile
 * @date: 2019/01/06
 */
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 根据父节点ip查询
     * @param pid
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryListByPid(@RequestParam("pid")Long pid){
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.queryCategoryListByPid(pid));
    }
}
