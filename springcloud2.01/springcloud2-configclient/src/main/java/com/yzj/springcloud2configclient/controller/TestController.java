package com.yzj.springcloud2configclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
    @Value("${yzj}")
    private String yzj;

@RequestMapping("/getymlinfo")
    public String getyml(){
        return yzj;
    }
}
