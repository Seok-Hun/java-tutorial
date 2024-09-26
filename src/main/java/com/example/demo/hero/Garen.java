package com.example.demo.hero;

public class Garen extends HeroCombo {

    // public으로 하면 해당 클래스의 객체에서 메서드가 노출됨
    protected void q_skill() {
        System.out.println("돌격");
    }

    protected void w_skill() {
        System.out.println("눈도 깜짝 안한다");
    }
}
