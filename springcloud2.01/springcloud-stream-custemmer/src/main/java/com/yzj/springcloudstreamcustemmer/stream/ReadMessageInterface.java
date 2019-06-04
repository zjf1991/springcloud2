package com.yzj.springcloudstreamcustemmer.stream;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * 创建接收通道
 */
@Component
public interface ReadMessageInterface {

    @Input(value = "my_stream_channel")
    SubscribableChannel readMsg();

}
