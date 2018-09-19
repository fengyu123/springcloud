package com.cloud.ribbon.consumer.service.impl;

import com.cloud.ribbon.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ly on 2018/9/18.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String sayHello() {
        String str=restTemplate.getForObject("http://ribbon-provider/hello1?name=test",String.class);
        System.out.println("str="+str);
        return "hello";
    }
}
