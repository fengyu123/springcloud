package com.cloud.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ly on 2018/9/18.
 */
@FeignClient(value = "ribbon-consumer")
public interface GetHello {
    @RequestMapping(value = "/hello?name=feign",method = RequestMethod.GET)
    public String sayHello();

    @RequestMapping(value = "/helloTest",method = RequestMethod.GET)
    public String sayHelloTest();
}
