package com.ge.streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
 
@Service
public class KafkaProducerService {
 
    private static final String TOPIC = "test_topic";
 
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
 
    public void sendMessage(String message) {
    	System.out.println("K-02");
        kafkaTemplate.send(TOPIC, message);
        System.out.println("K-02-02");
    }
}
