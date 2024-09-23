package com.example.demo;

public class RacingCar {
    // 불변성 : final로 인해 변하지 않음
    private final int players;
    private final int count;

    // 완전성 : 객체 초기화
    public RacingCar(int players, int count) {
        this.players = players;
        this.count = count;
    }

    public void play() {
        System.out.printf("게임을 시작합니다. 플레이어는 %s명이고, %s회 반복합니다.\n", players, count);
    }
}
