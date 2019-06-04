package com.yzj.springcloudstreamcustemmer.listener;


import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * 监听
 */
@Component
public class custemer {


    @StreamListener(value = "my_stream_channel")
    public void readMsg(String msg){
        System.out.println("消费者接收到的消息内容："+msg);
    }

}
