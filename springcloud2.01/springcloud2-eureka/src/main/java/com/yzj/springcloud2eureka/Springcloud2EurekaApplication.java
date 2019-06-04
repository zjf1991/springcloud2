package com.yzj.springcloud2eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloud2EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud2EurekaApplication.class, args);
    }

}
