package com.sc_feign.feign_consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients //开启Spring Cloud Feign的支持功能
@EnableDiscoveryClient
@SpringBootApplication
public class FeignConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumeApplication.class, args);
    }

}

