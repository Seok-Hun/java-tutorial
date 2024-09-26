package com.example.demo.member;

import lombok.*;

@Setter
@RequiredArgsConstructor
@ToString
public class Member {
    private final Integer id;
    private final String name;
    private int age;
    private String email;
}
