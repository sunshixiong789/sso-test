package com.example.ssotest.bower.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunshixiong
 * @date 2018/5/16 11:06
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping
    public String user(){
        return "孙士雄这是一个单点登录端";
    }
}
