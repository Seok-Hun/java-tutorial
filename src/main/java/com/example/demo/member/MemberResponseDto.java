package com.example.demo.member;

import lombok.ToString;

@ToString
public class MemberResponseDto {
    private Integer id;
    private String name;

    public MemberResponseDto(Member member) {
        this.id = member.getId();
        this.name = member.getName();
    }
}
