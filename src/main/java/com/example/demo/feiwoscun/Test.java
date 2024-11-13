package com.example.demo.feiwoscun;

import com.goodbuy.googbuylogin.login.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: feiWoSCun
 * @Time: 2024/11/12
 * @Email: 2825097536@qq.com
 * @description:
 */
@Configuration
public class Test {
    @Bean
    public UserService userService() {
        return () -> new int[]{1, 2, 3, 4};
    };
}
