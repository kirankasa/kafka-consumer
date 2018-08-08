package com.kiranreddykasa.kafkaconsumer;

import example.avro.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "messages", groupId = "group_id")
    public void consume(User user) {

        System.out.println("Consumed message: " + user.toString());
    }
}
