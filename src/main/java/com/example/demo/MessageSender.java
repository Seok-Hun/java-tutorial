package com.example.demo;

import lombok.Builder;
import lombok.ToString;

@ToString
public class MessageSender {
    private String receiver;
    private String sender;
    private String title;
    private String message;

    @Builder
    private MessageSender(String receiver, String sender, String title, String message) {
        this.receiver = receiver;
        this.sender = sender;
    }

    public static class MessageSenderBuilder {
        public MessageSenderBuilder sender(String sender) {
            if (!sender.equals("전송자")) {
                throw new RuntimeException("sender가 올바르지 않음");
            }
            this.sender = sender;
            return this;
        }
    }
}
