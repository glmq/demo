package com.example.demo.controller;

import com.example.demo.dao.TestDao;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FreeMarkercontroller {
    @Autowired
    private TestDao t;
    @GetMapping("free")
    public ModelAndView say(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","lhz");
        mv.setViewName("lhz");
        return mv;
    }
    @GetMapping("lbwnb")
    public  ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        List<User> l = t.findAll();
        mv.addObject("l",l);
        mv.setViewName("lhz");
        return mv;
    }
}
