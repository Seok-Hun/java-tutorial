package com.example.demo.travel;

public class RoomRepository {
    public void reservation(int roomId) {
        if (roomId != 10) {
            throw new RuntimeException("- 해당 객실은 예약할 수 없습니다.");
        }
        System.out.println("- 객실 예약 완료");
    }
}
