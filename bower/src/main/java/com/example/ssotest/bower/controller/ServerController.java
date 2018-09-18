package com.example.ssotest.bower.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 描述：
 * 服务器
 *
 * @author sunshixiong
 * @create 2018/8/8-10:48
 */
@RestController
@RequestMapping(value = "/weixin")
public class ServerController {
  @GetMapping
  public String checkSignature(ServletRequest request) {
    String signature = request.getParameter("signature");
    String timestamp = request.getParameter("timestamp");
    String nonce = request.getParameter("nonce");
    System.out.println(signature + "---" + timestamp + "---" + nonce);
    return request.getParameter("echostr");
  }

  @PostMapping
  public String getMessage(HttpRequest request, HttpServletResponse response) {
    System.out.println("有人发消息来了");
    return null;
  }
}
