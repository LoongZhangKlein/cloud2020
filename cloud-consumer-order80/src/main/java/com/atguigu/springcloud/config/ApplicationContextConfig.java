package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2023-01-28-16:44
 */
@Configuration
public class ApplicationContextConfig {
    // 开启轮询功能
    @LoadBalanced
    @Bean
    public RestTemplate getResTemplate(){
        return new RestTemplate();
    }
}
