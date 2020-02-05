package com.zikozee.jms_messaging.listener;

import com.zikozee.jms_messaging.config.JmsConfig;
import com.zikozee.jms_messaging.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class HelloMessageListener {
    //@Payload -> deserialize the components
    //@Headers -> Get message header

    @JmsListener(destination = JmsConfig.My_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, Message message){

        System.out.println("I got a message!!!!");
        System.out.println(helloWorldMessage);

        // uncomment and view to see retry count in debugger. jms retries if it encounters an error
//         throw new RuntimeException("foo");
    }
}
