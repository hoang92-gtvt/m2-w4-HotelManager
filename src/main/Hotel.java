package main;

import customer.Person;
import room.Room;

import java.io.Serializable;
import java.util.ArrayList;

public class Hotel implements Serializable {

        private Person customer;
        private Room room;
        private int number;

    public Hotel() {
    }

    public Hotel(Person customer, Room room) {
        this.customer = customer;
        this.room = room;

    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "{" +
                "customer=" + customer +
                ", room=" + room +
                ", number=" + number +
                '}';
    }
    public int getMoney(int number){
        this.setNumber(number);
        return this.room.getPrice()*this.number;
    }
}
