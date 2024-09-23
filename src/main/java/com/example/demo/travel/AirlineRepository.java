package com.example.demo.travel;

public class AirlineRepository {
    public void reservation(int airlineId) {
        if (airlineId != 10) {
            throw new RuntimeException("- 해당 비행기는 예약할 수 없습니다.");
        }
        System.out.println("- 항공권 예약 완료");
    }
}
