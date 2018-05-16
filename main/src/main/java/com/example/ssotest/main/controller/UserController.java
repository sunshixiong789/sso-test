package com.example.ssotest.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunshixiong
 * @date 2018/5/16 10:38
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping
    public String getUser(){
        return "孙士雄你好";
    }
}
