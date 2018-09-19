package com.cloud.feign.controller;

import com.cloud.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/hello")
    public String sayHello(String name){
        helloService.sayHelloTest();
        System.out.println("---------------------------");
        System.out.println(123);
        return helloService.sayHello()+""+name;
    }

}
