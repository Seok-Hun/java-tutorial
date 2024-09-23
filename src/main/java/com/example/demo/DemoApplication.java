package com.example.demo;

import com.example.demo.admin.Administrator;
import com.example.demo.exception.CustomException;
import com.example.demo.member.Member;
import com.example.demo.travel.TravelService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Member member1 = new Member("Kang", "hamer1233@naver.com");
        Member member2 = new Member("Seok", "hamer5599@naver.com");
        System.out.println(member1.getName());
        System.out.println(member2.getName());

        Administrator administrator1 = new Administrator("A", "abcd@naver.com", "DEV");
        Administrator administrator2 = new Administrator("B", "efgh@naver.com", "DEV");
        System.out.println(administrator1);
        System.out.println(administrator2);
    }

}
