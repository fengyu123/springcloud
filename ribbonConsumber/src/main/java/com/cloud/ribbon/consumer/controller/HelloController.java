package com.cloud.ribbon.consumer.controller;

import com.cloud.ribbon.consumer.service.HelloService;
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
        return helloService.sayHello()+""+name;
    }

    @RequestMapping("/helloTest")
    public String sayHelloTest(){
        System.out.println("test11111111111");
        return "test";
    }
}
