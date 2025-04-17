package com.DemoSpringbootAppWithRabbitMQ.Springboot.app.with.RabbitMQ.Config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {

    //Define a queue
    @Bean
    public Queue queue(){
        return new Queue("test-queue", true);
    }

    //Define a Topic Exchange
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("test-exchange");
    }

    //Bind the Queue to the Exchange
    @Bean
    public Binding binding(Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with("routing.key");

    }

}
