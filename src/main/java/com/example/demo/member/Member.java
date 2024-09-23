package com.example.demo.member;

public class Member {
    private Integer id;
    private String name;
    private int age;
    private String email;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
