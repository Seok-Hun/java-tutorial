package com.example.demo;

public class RacingCar {
    private final int players;
    private final int count;

    public void input(int players, int count) {
        this.players = players;
        this.count = count;
    }

    public void play() {
        System.out.printf("게임을 시작합니다. 플레이어는 %s명이고, %s회 반복합니다.\n", players, count);
    }
}
