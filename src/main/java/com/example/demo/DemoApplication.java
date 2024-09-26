package com.example.demo;

import com.example.demo.member.Member;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Member kang = new Member(1, "kang");

        // 불가
        kang.setId(2);
        kang.setName("kang");
    }
}
