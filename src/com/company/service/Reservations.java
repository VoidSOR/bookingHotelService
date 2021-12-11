package com.company.service;

import com.company.entity.Bill;
import com.company.entity.Client;
import com.company.entity.Hotel;
import com.company.entity.Room;

public class Reservations {

    public void bookReservationsService(Hotel hotel, Client client, int numberOfPerson){
        boolean success = false;
        Room[] rooms = hotel.getRooms();
        boolean isFreeRooms = false;
        for (Room r : rooms) {
            if (r.isFree()){
                isFreeRooms = true;

            }
        }

        if (! isFreeRooms) {
            System.out.println("Свободных номеров в отеле   " + hotel.getName() + "  Нет ");
        }


        bookRoom(client, numberOfPerson, rooms);


    }

    private void bookRoom(Client client, int numberOfPerson, Room[] rooms) {
        for (Room room : rooms) {
            String clientName = client.getName();
            if (room.getNumberOfPerson() == numberOfPerson) {
                System.out.println("Нашелся номер для пользователя" + clientName + client.getSurname());
                if (client.getBill().getAmount() >= room.getCost()) {
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount() - room.getCost());
                    room.setFree(false);
                    System.out.println("Номер Забранирован клиентом " + clientName + client.getSurname() + client.getNumberPhone());
                } else {
                    System.out.println("На счету клиента" + clientName + "Не хватает средств");
                }
            }else {
                System.out.println("Не найден номер для клиента:  " + clientName + client.getEmail());
            }
        }
    }
}
