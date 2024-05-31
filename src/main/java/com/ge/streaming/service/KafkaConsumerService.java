package com.ge.streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
 
@Service
public class KafkaConsumerService {
 
    @Autowired
    private SimpMessagingTemplate messagingTemplate;
 
    @KafkaListener(topics = "test_topic", groupId = "group_id")
    public void consume(String message) {
        messagingTemplate.convertAndSend("/topic/messages", message);
    }
}