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
        Member member = new Member("A", "hamer1233@naver.com");
        MemberResponseDto memberResponseDto = new MemberResponseDto(member);
        System.out.println(memberResponseDto);
    }

}
