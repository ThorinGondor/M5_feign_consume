package com.sc_feign.feign_consume.service;

import com.sc_feign.feign_consume.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("HELLO-SERVICE-CLUSTER") //定义Feign接口绑定服务，hello-service-cluster即我们要绑定的服务提供者Eureka_Client的名称，不区分大小写
public interface HelloService {
    @RequestMapping("/hello") //服务提供者Eureka_Client拥有hello方法服务，在此绑定该服务
    String hello();

    /***
     * 下述方法绑定更多Eureka_Client的服务接口
     */
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name")String name, @RequestHeader("age")Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
