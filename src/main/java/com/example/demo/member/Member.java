package com.example.demo.member;

import lombok.*;

@ToString(exclude = {"email"}) // @ToString(of = {"id", "name", "age"})
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    private Integer id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Getter
    @Setter(AccessLevel.PUBLIC)
    private String email;

    public void validAndSetAge(int age) {
        if (age < 30) {
            throw new RuntimeException("30 이상임");
        }
        this.setAge(age);
    }
}
