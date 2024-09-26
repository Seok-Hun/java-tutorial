package com.example.demo.member;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class Member {
    private Integer id;
    private String name;
    private int age;
    private String email;

    // 정적 팩토리 메서드
    // name을 받고 이를 이용해 Member 객체 생성
    public static Member of(String name) {
        return new Member(1, name, 0, "undefined");
    }
}
