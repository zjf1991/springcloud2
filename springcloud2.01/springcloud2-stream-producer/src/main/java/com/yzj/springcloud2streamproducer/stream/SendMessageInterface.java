package com.yzj.springcloud2streamproducer.stream;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * 创建发送消息通道
 */
public interface SendMessageInterface {

    @Output(value = "my_stream_channel")
    SubscribableChannel sendMsg();

}
