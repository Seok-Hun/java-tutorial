package com.example.demo.travel;

public class TravelService {
    public void reservation() {
        AirlineRepository airlineRepository = new AirlineRepository();
        BusRepository busRepository = new BusRepository();
        RoomRepository roomRepository = new RoomRepository();

        try {
            airlineRepository.reservation(10);
            busRepository.reservation(20);
            roomRepository.reservation(30);
        } catch (RuntimeException e) {
            e.printStackTrace(); // 해당 코드 필수 : 해당 코드가 없으면 어디서 에러가 발생했는지 알 수 없음
            throw new RuntimeException("전체 예약 실패");
        }
        System.out.println("- 전체 예약 완료");
    }
}
