package com.example.demo;

import com.example.demo.hero.Hero;
import com.example.demo.hero.IntelligenceHero;
import com.example.demo.member.Member;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        IntelligenceHero<Integer> hero = new IntelligenceHero<>();
        hero.attack(3);
        hero.ultimate(5);
    }
}
