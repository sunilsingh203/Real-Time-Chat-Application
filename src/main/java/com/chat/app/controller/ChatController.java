package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")  // Handles messages from frontend ie. web sockets messages to destination
    @SendTo("/topic/messages")  // Sends response to subscribers
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    @GetMapping("chat")  // Returns Thymeleaf template (if using Thymeleaf)
    public String chat() {
        return "chat";
    }
}
