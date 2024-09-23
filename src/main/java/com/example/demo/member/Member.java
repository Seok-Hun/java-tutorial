package com.example.demo.member;

public class Member {
    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}
