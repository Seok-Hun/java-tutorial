package com.example.demo;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class MessageSender {
    private String receiver;
    private String sender;
    private String title;
    private String message;
}
