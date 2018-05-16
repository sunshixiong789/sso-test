package com.example.ssotest.servse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author sunshixiong
 * @date 2018/5/16 10:08
 */
@SpringBootApplication
@EnableAuthorizationServer
public class ServseApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServseApplication.class, args);
    }
}
