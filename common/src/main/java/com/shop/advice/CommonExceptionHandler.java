package com.shop.advice;

import com.shop.enums.ExceptionEnums;
import com.shop.exception.ShopException;
import com.shop.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @description: common Exception
 * @author: Stylesmile
 * @date: 2019/01/05
 */
@ControllerAdvice  //拦截所有所有被@contrler注解的类
public class CommonExceptionHandler {

    //拦截运行时异常
    @ExceptionHandler(ShopException.class)
    public ResponseEntity<ExceptionResult> handleException(ShopException e){
        ExceptionEnums em = e.getExceptionEnums();
        return ResponseEntity
                .status(em.getCode())
                .body(new ExceptionResult(e.getExceptionEnums()));
    }
}
