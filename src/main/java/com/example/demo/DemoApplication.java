package com.example.demo;

import com.example.demo.member.Member;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Member member = new Member(0, "Kang", 26, "hamer1233@naver.com");

        log.info(member.getName());
        log.info(member.getEmail());
        
        member.setName("Kang2");
        member.setEmail("hamer1234@naver.com");
    }
}
