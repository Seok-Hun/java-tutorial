package com.example.demo;

import com.example.demo.member.Member;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        int pa = 10;
        int pb = 10;

        Integer ra = 128;
        Integer rb = 128;

        log.info(pa == pb);
        log.info(ra.equals(rb));

        Member member1 = new Member();
        Member member2 = new Member();

        log.info(member1 == member2);
        log.info(member1.equals(member2));
    }
}
