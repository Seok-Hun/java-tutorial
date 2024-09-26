package com.example.demo;

import com.example.demo.hero.Garen;
import com.example.demo.product.Tax;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Tax tax = new Tax(100, 20);
        tax.print();
        tax.print(10);
    }
}
