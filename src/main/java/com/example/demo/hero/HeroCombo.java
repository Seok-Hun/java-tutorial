package com.example.demo.hero;

public abstract class HeroCombo {
    // 챔피언마다 사용하는 q 스킬과 w 스킬이 다름
    protected abstract void q_skill();

    protected abstract void w_skill();

    public void combo() {
        q_skill();
        w_skill();
        q_skill();
        w_skill();
    }
}
