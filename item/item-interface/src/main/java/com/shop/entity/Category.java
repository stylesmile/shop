package com.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @description 商品分类
 * @author Stylesmile
 * @date 2019/01/06
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category {
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;
}
