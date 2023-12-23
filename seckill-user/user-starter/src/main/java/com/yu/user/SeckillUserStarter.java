package com.yu.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @description 用户服务启动类
 * @author yu
 * @date 2023-12-23
 */
@EnableAsync
@SpringBootApplication
@EnableDiscoveryClient
public class SeckillUserStarter {

    public static void main(String[] args) {
        System.setProperty("user.home", "/home/binghe/user");
        SpringApplication.run(SeckillUserStarter.class, args);
    }
}
