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
            e.printStackTrace();
        }
        System.out.println("- 전체 예약 완료");
    }
}
