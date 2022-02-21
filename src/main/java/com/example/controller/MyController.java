package com.example.controller;

import com.example.service.UserService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MyController {
    @Resource
    private UserService userService;

    @Transactional
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "hello" + userService.getActByName(name);
    }
}
