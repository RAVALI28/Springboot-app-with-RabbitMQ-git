package com.DemoSpringbootAppWithRabbitMQ.Springboot.app.with.RabbitMQ.Service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {


    @RabbitListener(queues = "test-queue")
    public void receiveMessage(String message){
        System.out.println("Received Message: " + message);
    }
}
