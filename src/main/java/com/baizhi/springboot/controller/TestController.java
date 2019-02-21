package com.baizhi.springboot.controller;

import com.baizhi.springboot.entity.User;
import com.baizhi.springboot.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private Userservice userservice;

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "spring boot 来了，老弟！";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "index";
    }

    @RequestMapping("/test3")
    @ResponseBody
    public List<User> test3(){
        return userservice.getAll();
    }
}
