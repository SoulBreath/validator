package com.example.validator.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 异常处理器
 */

@RestControllerAdvice
public class RRExceptionHandler {

    /**
     * 处理自定义异常
     */
    @ExceptionHandler
    public Map<String,Object> handleRRException(RRException e){
        Map<String,Object> map = new HashMap<>();
        map.put("msg", e.getMsg());
        map.put("code", e.getCode());
        return map;
    }
}
