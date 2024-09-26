package com.example.demo.member;

public final class Student extends Member {
    public Student(Integer id, String name) {
        super(id, name);
    }

    //    불가
    @Override
    public void print() {
        super.print();
    }
}
