package com.example.chatappdemo1.controller;

import com.example.chatappdemo1.entity.Message;
import com.example.chatappdemo1.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class ChatController {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/sendMessage")
    public void sendMessage(Message message) {
        message.setTimestamp(new Date());
        messageRepository.save(message);  // Save message to MongoDB
        messagingTemplate.convertAndSend("/topic/messages", message);  // Broadcast message to WebSocket subscribers
    }
}
