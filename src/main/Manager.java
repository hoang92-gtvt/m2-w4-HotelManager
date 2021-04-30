package main;

import customer.Person;
import storeRange.FileManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Person {
     ArrayList<Hotel> listCustomer = new ArrayList<>();
//
    public ArrayList<Hotel> getListCustomer() {
        return listCustomer;
    }

    public void setListCustomer(ArrayList<Hotel> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public Manager() {

    }
    public Manager(String fullName, String birthDay, String id) {
        super(fullName, birthDay, id);
    }

    public void add(ArrayList<Hotel> list, Hotel hotel) throws IOException {
        list.add(hotel);
        FileManager.writeFile(list,"ListCustomer.txt");

    }
    public void show(ArrayList<Hotel> list){
        for (Hotel h:list
             ) {
            System.out.println(h.getCustomer());
        }
    }
    public void delete(ArrayList<Hotel> list, int index)throws IOException{
        list.remove(index);
        FileManager.writeFile(list,"ListCustomer.txt");
    }

    @Override
    public String toString() {
        return super.getFullName();
    }

    public int getMoneyOfHotel(int number, String id){
        for (Hotel h:listCustomer
             ) {
                if(h.getCustomer().getId().equals(id) ){
                    return h.getMoney(number);
                }

        }
        return 0;
    }
}
