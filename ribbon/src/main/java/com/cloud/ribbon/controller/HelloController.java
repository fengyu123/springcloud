package com.cloud.ribbon.controller;

import com.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ly on 2018/9/18.
 */
@RestController
@RequestMapping("/")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello1")
    public String sayHello(String name){
        return helloService.sayHello()+""+name;
    }
}
