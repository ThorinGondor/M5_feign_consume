package com.sc_feign.feign_consume.controller;

import com.sc_feign.feign_consume.pojo.User;
import com.sc_feign.feign_consume.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer-expand", method = RequestMethod.GET)
    public String helloConsumerExpand(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(helloService.hello()).append("\n");   //将调用Eureka-Client提供的第0个服务
        stringBuilder.append(helloService.hello("Jason")).append("\n");  //将调用Eureka-Client提供的第1个服务
        stringBuilder.append(helloService.hello("Kimi", 34)).append("\n");  //将调用Eureka-Client提供的第2个服务
        stringBuilder.append(helloService.hello(new User("Curry", 30))).append("\n");  //将调用Eureka-Client提供的第3个服务

        return stringBuilder.toString();
    }
}
