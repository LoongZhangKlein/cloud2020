package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author loongzhang
 * @Description DOING
 * @date ${DATE}-${TIME}
 */


@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001.class,args);
        System.out.println("CloudEurekaServer7001  start success!");
    }
}