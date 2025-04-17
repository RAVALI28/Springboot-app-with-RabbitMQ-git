package com.DemoSpringbootAppWithRabbitMQ.Springboot.app.with.RabbitMQ.Service;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send(String message){
        amqpTemplate.convertAndSend("test-topicExchange", "routingkey", message);
        System.out.println("Sent message: " +message);
    }
}
