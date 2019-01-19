package com.shop.vo;

import com.shop.ExceptionEnums;
import lombok.Data;

/**
 * @description: exception result
 * @author: Stylesmile
 * @date: 2019/01/05
 */
@Data
public class ExceptionResult {

    private int status;
    private String message;
    private Long timestmap;
    public ExceptionResult(ExceptionEnums em){
        this.status=em.getCode();
        this.message=em.getMsg();
        this.timestmap= System.currentTimeMillis();
    }
}
