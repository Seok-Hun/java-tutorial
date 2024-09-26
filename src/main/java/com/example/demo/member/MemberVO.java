package com.example.demo.member;

import lombok.Value;

@Value
public class MemberVO {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
