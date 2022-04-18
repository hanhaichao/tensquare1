package com.tensquare.base.controller;

import entity.Result;
import entity.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BaseExceptionHandler {
    Logger logger = LoggerFactory.getLogger(BaseExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        logger.error("发生了错误，错误原因为"+e.getMessage());
        return new Result(false, StatusCode.ERROR, e.getMessage());
    }

}