package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author loongzhang
 * @Description DOING
 * @date ${DATE}-${TIME}
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7002.class,args);
        System.out.println("CloudEurekaServer7002 启动成功");
    }
}