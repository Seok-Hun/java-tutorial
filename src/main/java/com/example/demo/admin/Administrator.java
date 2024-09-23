package com.example.demo.admin;

import com.example.demo.member.Member;

import java.time.LocalDate;

public class Administrator extends Member {

    private String role;
    private LocalDate assignedAt;

    public Administrator(String name, String email, String role) {
        super(name, email);
        this.role = role;
        this.assignedAt = LocalDate.now();
    }

    public String toString() {
        return "Administrator{" +
                "id=" + this.id + '\'' +
                "email=" + this.email + '\'' +
                "name=" + this.name + '\'' +
                "role='" + role + '\'' +
                ", assignedAt=" + assignedAt +
                '}';
    }
}
