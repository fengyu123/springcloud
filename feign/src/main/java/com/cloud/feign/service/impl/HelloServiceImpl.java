package com.cloud.feign.service.impl;

import com.cloud.feign.rpc.GetHello;
import com.cloud.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ly on 2018/9/18.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private GetHello getHello;//注入rpc
    @Override
    public String sayHello() {

        return getHello.sayHello();
    }

    @Override
    public String sayHelloTest() {
        return getHello.sayHelloTest();
    }


}
