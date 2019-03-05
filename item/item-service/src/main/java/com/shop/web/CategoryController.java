package com.shop.web;

import com.shop.entity.Category;
import com.shop.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品分类
 *
 * @author Stylesmile
 * @date 2019/01/06
 */
@RestController
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    /**
     * 根据父节点id查询
     *
     * @param pid 父节点id
     * @return list
     */
    @GetMapping("/list")
    public ResponseEntity<List<Category>> queryCategoryListByPid(@RequestParam("pid") Long pid) {
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.queryCategoryListByPid(pid));
    }
}
