package com.example.demo;

import com.example.demo.member.Member;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Member member = new Member(1, "Kang");
        member.setEmail("hamer1233@naver.com");
        member.setAge(20);

        log.info(member);
    }
}
