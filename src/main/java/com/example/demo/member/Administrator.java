package com.example.demo.member;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString(callSuper = true)
public class Administrator extends Member {
    private String role;

    public Administrator(Integer id, String name, int age, String email, String role) {
        super(id, name, age, email);
        this.role = role;
    }
}
