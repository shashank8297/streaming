package com.ge.streaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.ge.streaming.service.KafkaProducerService;
 
@Controller
public class WebSocketController {
 
    @Autowired
    private KafkaProducerService kafkaProducerService;
 
    @MessageMapping("/sendMessage")
    public void sendMessage(String message) {
    	System.out.println("k-01");
        kafkaProducerService.sendMessage(message);
    }
}