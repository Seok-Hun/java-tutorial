package com.example.demo;

import com.example.demo.exception.CustomException;
import com.example.demo.member.Member;
import com.example.demo.member.MemberResponseDto;
import com.example.demo.travel.TravelService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        String type = "감사";
        MessageSender.MessageSenderBuilder messageSenderBuilder = MessageSender.builder();
        if (type.equals("감사")) {
            messageSenderBuilder
                    .title("감사합니다.")
                    .message("감사 내용");
        }
        if (type.equals("안녕")) {
            messageSenderBuilder
                    .title("안녕하세요.")
                    .message("인사 내용");
        }
        messageSenderBuilder
                .receiver("받는 사람")
                .sender("보낸 사람");

        MessageSender messageSender = messageSenderBuilder.build();

        System.out.println(messageSender);
    }
}
