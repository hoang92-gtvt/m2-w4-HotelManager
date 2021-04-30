package room;

import java.io.Serializable;

public class Room implements Serializable {
    private String typeOfRoom ;
    private int price;

    public Room() {
    }

    public Room(String typeOfRoom, int price) {
        this.typeOfRoom = typeOfRoom;
        this.price = price;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
