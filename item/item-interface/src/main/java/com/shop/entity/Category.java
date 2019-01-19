package com.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * @description: 商品分类
 * @author: Stylesmile
 * @date: 2019/01/06
 */
@Table(name="tb_category")
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
