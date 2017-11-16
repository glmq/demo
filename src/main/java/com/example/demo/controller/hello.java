package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @Value("${lalala}")
    String name;
    @RequestMapping(value="hello")
    public String oo(){
        return "Hello word"+name;
    }
}
