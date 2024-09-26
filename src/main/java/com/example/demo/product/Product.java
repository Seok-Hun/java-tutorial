package com.example.demo.product;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Product {
    protected int price;

    public void print() {
        System.out.println(String.format("가격은 %s입니다.", this.price));
    }
}
