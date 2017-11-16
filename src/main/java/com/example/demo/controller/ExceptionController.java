package com.example.demo.controller;

import com.example.demo.pojo.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



@ControllerAdvice
public class ExceptionController {
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public String say(){
        return "发生了异常，请稍后重试";
    }
}
