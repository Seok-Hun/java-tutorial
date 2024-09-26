package com.example.demo.hero;

public interface Hero {
    default void attack() {
        System.out.println("맨손 후려치기");
    }
}
