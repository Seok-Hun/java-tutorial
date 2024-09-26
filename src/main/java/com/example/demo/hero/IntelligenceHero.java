package com.example.demo.hero;

public class IntelligenceHero implements Hero {
    @Override
    public void attack() {
        System.out.println("파이어볼");
    }

    @Override
    public void ultimate() {
        System.out.println("메테오");
    }
}
