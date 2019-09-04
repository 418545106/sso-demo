package com.yueqi.sso.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: zpd
 * @Date: 2019/2/25 0025 09:52
 * @Description:
 */
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClient2Application {
    public static void main(String[] args) {
        SpringApplication.run(SsoClient2Application.class);
    }


    @GetMapping("/user")
    public Authentication user(Authentication user) {
        return user;
    }
}
