package com.yzj.springcloud2streamproducer.controller;


import com.yzj.springcloud2streamproducer.stream.SendMessageInterface;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.UUID;

/**
 * 发送消息
 */
@RestController
public class SendMsgController {


    @Resource
    private SendMessageInterface sendMessageInterface;

    //生产消息
    @RequestMapping("/sendMsg")
    public String sendMsg() {
        String msg = UUID.randomUUID().toString();
        System.out.println("生产者发送的消息内容"+msg);
        Message build=MessageBuilder.withPayload(msg.getBytes()).build();
        sendMessageInterface.sendMsg().send(build);
        return "success";

    }
}
