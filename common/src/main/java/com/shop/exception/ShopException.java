package com.shop.exception;

import com.shop.enums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @description: shop exception
 * @author: Stylesmile
 * @date: 2019/01/05
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ShopException extends RuntimeException{
    private ExceptionEnums exceptionEnums;


}
