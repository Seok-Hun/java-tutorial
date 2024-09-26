package com.example.demo.hero;

public class StrengthHero<T> implements Hero<String, Integer> {
    @Override
    public Integer attack(String element) {
        System.out.println("강타");
        return 10;
    }

    @Override
    public void ultimate(String element) {
        System.out.println("힐윈드");
    }

    public void berserk(T asdf) {
        System.out.println("버서커");
    }
}
