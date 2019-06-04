package com.yzj.springcloud2configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
public class Springcloud2ConfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud2ConfigclientApplication.class, args);
    }

}
