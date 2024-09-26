package com.example.demo.hero;

public class StrengthHero implements Hero {
    @Override
    public void attack() {
        System.out.println("강타");
    }

    @Override
    public void ultimate() {
        System.out.println("힐윈드");
    }

    public void berserk() {
        System.out.println("버서커");
    }
}
