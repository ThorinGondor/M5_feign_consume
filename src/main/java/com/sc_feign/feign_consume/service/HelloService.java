package com.sc_feign.feign_consume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service-cluster") //定义Feign接口绑定服务，hello-service-cluster即我们要绑定的服务提供者client的名称
public interface HelloService {
    @RequestMapping("/hello") //服务提供者client拥有hello方法服务，在此绑定该服务
    String hello();
}
