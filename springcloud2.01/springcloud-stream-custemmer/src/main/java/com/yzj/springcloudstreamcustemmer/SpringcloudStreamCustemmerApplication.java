package com.yzj.springcloudstreamcustemmer;

import com.yzj.springcloudstreamcustemmer.stream.ReadMessageInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ReadMessageInterface.class)
public class SpringcloudStreamCustemmerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStreamCustemmerApplication.class, args);
    }

}
