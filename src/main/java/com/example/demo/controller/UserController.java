package com.example.demo.controller;

import com.example.demo.dao.TestDao;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private TestDao t;
    @GetMapping("lalala")
    public List<User> test1(){
        return t.findAll();
    }
    @GetMapping("delete")
    public void asd(int id){
        t.delete(id);
    }
}
