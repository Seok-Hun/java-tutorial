package com.example.demo.product;

public class Tax extends Product {
    private int tax;

    // 오버라이드
    public void print() {
        System.out.println(String.format("총 가격은 %s입니다.", this.price + this.tax));
    }

    // 오버로드
    public void print(int tip) {
        System.out.println(String.format("총 가격은 %s입니다.", this.price + this.tax + tip));
    }

    public Tax(int price, int tax) {
        super(price);
        this.tax = tax;
    }
}
