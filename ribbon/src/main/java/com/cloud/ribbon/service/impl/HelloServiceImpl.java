package com.cloud.ribbon.service.impl;

import com.cloud.ribbon.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by ly on 2018/9/18.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }
}
