package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author loongzhang
 * @Description DOING
 * @date ${DATE}-${TIME}
 */
@SpringBootApplication
public class ConsumerOrder80 {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerOrder80.class, args);

        System.out.println(run.getEnvironment().getProperty("server.port")+"启动成功!!!");
    }
}