package com.shop.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @description: exception enums
 * @author: Stylesmile
 * @date: 2019/01/05
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnums {

    PRICE_CONNOT_BE_NULL(400,"价格不能为空！"),
    CATEGORY_NOT_FOUND(404,"商品分类没有查到")
    ;
    private int code;
    private String msg;

}
