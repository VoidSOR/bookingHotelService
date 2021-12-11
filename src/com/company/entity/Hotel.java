package com.company.entity;

public class Hotel {
    private String name;

    private Room[] room;

    public Hotel(String name, Room[] room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRooms() {
        return room;
    }

    public void setRooms(Room[] room) {
        this.room = room;
    }
}
