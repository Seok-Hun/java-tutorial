package com.example.demo;

import com.example.demo.member.Member;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Member member = new Member(1, "Kang");
        member.school = "가천대";
        log.info(Member.school);

        Member.Item item = new Member(2, "Kang2").new Item();
        Member.Item_Static itemStatic = new Member.Item_Static();
    }
}
