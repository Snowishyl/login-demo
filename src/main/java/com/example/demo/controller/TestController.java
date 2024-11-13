package com.example.demo.controller;

import com.goodbuy.googbuylogin.login.LoginIdentify;
import com.goodbuy.googbuylogin.login.LoginIdentifyAspect;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: feiWoSCun
 * @Time: 2024/11/12
 * @Email: 2825097536@qq.com
 * @description:
 */
@RestController
@RequestMapping("/goodbuy")
@LoginIdentify(under = 100)
public class TestController implements ApplicationContextAware {
    private ApplicationContext applicationContext;


    @GetMapping("/test")
    public String test() {
        LoginIdentifyAspect bean = applicationContext.getBean(LoginIdentifyAspect.class);
        System.out.println(bean);
        return "test";
    }

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
