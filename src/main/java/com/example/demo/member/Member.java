package com.example.demo.member;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    private Integer id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter(AccessLevel.PRIVATE)
    int age;
    @Getter
    @Setter(AccessLevel.PUBLIC)
    String email;

    public void validAndSetAge(int age) {
        if (age < 30) {
            throw new RuntimeException("30 이상임");
        }
        this.setAge(age);
    }
}
