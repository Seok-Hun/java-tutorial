package com.example.demo;

import com.example.demo.hero.Garen;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Garen garen = new Garen();
        garen.combo();
    }
}
