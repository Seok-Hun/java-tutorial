package com.example.demo.travel;

public class BusRepository {
    public void reservation(int busId) {
        if (busId != 10) {
            throw new RuntimeException("- 해당 버스는 예약할 수 없습니다.");
        }
        System.out.println("- 버스 예약 완료");
    }
}
