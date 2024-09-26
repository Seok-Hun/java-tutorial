package com.example.demo.hero;

public interface Hero<Asdf, T> {
    T attack(Asdf element);

    void ultimate(Asdf element);
}
