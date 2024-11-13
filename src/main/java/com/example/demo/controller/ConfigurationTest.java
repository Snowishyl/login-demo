package com.example.demo.controller;

import com.goodbuy.googbuylogin.login.LoginIdentifyAspect;
import com.goodbuy.googbuylogin.login.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: feiWoSCun
 * @Time: 2024/11/12
 * @Email: 2825097536@qq.com
 * @description: 只要配置了UserService作为bean就能跑通
 */

@Configuration
public class ConfigurationTest {
    @Bean
    public UserService loginIdentifyAspect() {
        return () -> new int[]{1, 2, 3};

    }


}
