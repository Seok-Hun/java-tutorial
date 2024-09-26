package com.example.demo.hero;

public class IntelligenceHero<T> implements Hero<Integer, Integer> {
    @Override
    public Integer attack(Integer element) {
        System.out.println("파이어볼");
        return 2;
    }

    @Override
    public void ultimate(Integer element) {
        T text;
        System.out.println("메테오");
    }
}
