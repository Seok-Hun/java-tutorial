package com.example.demo;

import com.example.demo.member.Member;
import com.example.demo.member.MemberVO;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Member member1 = new Member(0);
        member1.setName("Kang");
        member1.setEmail("kang@gmail.com");
        member1.setAge(10);

        Member member2 = new Member(0);
        member2.setName("Kang");
        member2.setEmail("kang@gmail.com");
        member2.setAge(10);

        MemberVO memberVO = new MemberVO(member1.getId(), member1.getName(), member1.getAge(), member1.getEmail());

        log.info(memberVO);
    }
}
