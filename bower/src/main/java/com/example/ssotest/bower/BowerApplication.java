package com.example.ssotest.bower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * @author sunshixiong
 * @date 2018/5/16 10:49
 */

@SpringBootApplication
public class BowerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BowerApplication.class,args);
    }
}
