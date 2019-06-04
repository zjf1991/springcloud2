package com.yzj.springcloud2streamproducer;

import com.yzj.springcloud2streamproducer.stream.SendMessageInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(SendMessageInterface.class)
public class Springcloud2StreamProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud2StreamProducerApplication.class, args);
    }

}
