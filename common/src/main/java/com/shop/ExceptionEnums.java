package com.shop;

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
    ;
    private int code;
    private String msg;

}
