package com.example.demo.member;

import lombok.*;

@Setter
@NoArgsConstructor
@ToString
public class Member {
    private Integer id;
    private String name;
    private int age;
    private String email;
}
