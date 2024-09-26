package com.example.demo.member;

import lombok.*;

@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Member {
    private Integer id;
    private String name;
    private int age;
    private String email;

//    public boolean equals(Member operand) {
//        return id.equals(operand.id) && name.equals(operand.name) && age == operand.age && email.equals(operand.email);
//    }
}
