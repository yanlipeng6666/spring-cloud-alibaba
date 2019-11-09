package com.funtl.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Program Name: hello-springcloud-alibaba
 * Created by yanlp on 2019-11-08
 *
 * @author yanlp
 * @version 1.0
 */
@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/echo/{message}")
    public String echo(@PathVariable("message") String message) {
        return "Hello Nacos " +  message + " i am from " + port;
    }
//
}
