package com.stackroute.kafka.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.kafka.kafkaconsumer.model.User;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example", group = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Skills", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
