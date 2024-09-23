package com.example.demo.member;

import lombok.ToString;

@ToString
public class MemberResponseDto {
    private Integer id;
    private String name;
    private static int count = 0;

    private MemberResponseDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MemberResponseDto from(Member member) {
        count += 1;
        if (count > 10) {
            throw new RuntimeException("MemberResponseDto 객체는 10개 이상 생성 불가");
        }
        return new MemberResponseDto(member.getId(), member.getName());
    }
}
