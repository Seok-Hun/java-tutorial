package com.example.demo.member;

import lombok.ToString;

import java.util.Objects;

@ToString
public class MemberResponseDto {
    private Integer id;
    private String name;
    private static MemberResponseDto entity;

    private MemberResponseDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MemberResponseDto from(Member member) {
        if (Objects.isNull(entity)) {
            entity = new MemberResponseDto(member.getId(), member.getName());
            return entity;
        }
        return entity;
    }
}
