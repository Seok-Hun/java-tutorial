package com.example.demo.member;

import lombok.*;

@Data
public class Member {
    private final Integer id;
    private String name;
    private int age;
    private String email;
}
