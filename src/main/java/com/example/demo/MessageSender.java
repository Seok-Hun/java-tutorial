package com.example.demo;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class MessageSender {
    private String receiver;
    private String sender;
    @Builder.Default
    private String title = "기본 제목";
    @Builder.Default
    private String message = "기본 메시지";

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
