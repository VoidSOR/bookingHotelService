package com.company;

import com.company.entity.Bill;
import com.company.entity.Client;
import com.company.entity.Hotel;
import com.company.entity.Room;
import com.company.service.Reservations;

public class Main {

    public static void main(String[] args) {

        Bill joeBill = new Bill(10000);

        Bill loriBill = new Bill(15000);

        Client joeClient = new Client("Joe", "Brans", 333, "kklesnak@gmail.com",joeBill);
        Client loriClent = new Client("Lori", "Gorg", 321,"gfdgdf@mail.ru",loriBill);

        Room[] moscowHotelRoom = new Room[]{new Room(1,1500, true ), new Room(3,3500,true)
        , new Room(2,3213123,true)};
        Hotel moscowOblastHotel = new Hotel("Moscow Oblast",moscowHotelRoom);

        Room[] kirovHotelRoom = new Room[]{new Room(5,14444,true),new Room(1,50000,true)};
        Hotel kirovHotelHotel = new Hotel("Kirov",kirovHotelRoom);
        Reservations bookingService = new Reservations();

        bookingService.bookReservationsService(moscowOblastHotel,loriClent,2);
        System.out.println("\n");
        bookingService.bookReservationsService(moscowOblastHotel,joeClient,6);
        System.out.println("\n");
        bookingService.bookReservationsService(moscowOblastHotel,joeClient,1);

        System.out.println("\n");

        bookingService.bookReservationsService(kirovHotelHotel,loriClent,2);


    }
}
