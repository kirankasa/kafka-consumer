package com.kiranreddykasa.kafkaconsumer;

import example.avro.User;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "messages", groupId = "group_id")
    public void consume(User user) {
        System.out.println("Consumed message: " + user);
    }
}
