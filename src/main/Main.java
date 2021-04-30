package main;

import customer.Person;
import room.Room;
import storeRange.FileManager;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Room A = new Room("Loại A", 500);
    static final Room B = new Room("Loại B", 200);
    static final Room C = new Room("Loại C", 100);
    static final Room D = new Room("Loại D", 100);

    static final String filePath = "ListCustomer.txt";

    static ArrayList<Hotel> listCustomer = new ArrayList<>();
    static Manager manager1 = new Manager("Nguyễn Văn A","01/01/1990","0123456789" );
    static Manager manager2 = new Manager("Nguyễn Văn B","01/02/1990","1234567890" );


    static {
        try {
            listCustomer = FileManager.readList(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        manager1.setListCustomer(listCustomer);

    }

    public static void menu(){
        System.out.println("1: Thêm khách thuê phòng");
        System.out.println("2: Hiện thị khách thuê phòng");
        System.out.println("3: Tính tiền thuê phòng");
        System.out.println("4: Exit");
        System.out.println("Bạn chọn gì ");
        int choice = new Scanner(System.in).nextInt();
        switch(choice){
            case 1:
                input();
                break;
            case 2:
                show();
                break;
            case 3:
                getMoney();
                break;
            default:
                System.out.println("Tạm biệt");
                System.exit(0);
                break;
        }
    }

    private static void getMoney() {
        System.out.println("Nhập tên số chứng minh nhân dân");
        String id = new Scanner(System.in).nextLine();
        System.out.println("Nhập số ngày thuê phòng của khách");
        int number = new Scanner(System.in).nextInt();

        int money = manager1.getMoneyOfHotel(number, id);
        System.out.println("Số tiền khách trả là "+ money);
    }

    private static void show() {
        manager1.show(listCustomer);
    }

    private static void input() {
        System.out.println("Mời bạn nhập tên");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Mời bạn nhập ngày sinh");
        String birthday= new Scanner(System.in).nextLine();

        System.out.println("Mời bạn nhập chứng minh nhân dân");
        String id = new Scanner(System.in).nextLine();

        Person newCustomer = new Person(name, birthday, id);

        System.out.println("Lựa chọn loại phòng khách chọn");
        System.out.println("A: Loại phòng A ");
        System.out.println("B: Loại phòng B ");
        System.out.println("C: Loại phòng C ");
        System.out.println("D: Loại phòng D ");
        String value = new Scanner(System.in).nextLine();
        switch(value){
            case "A":
                Hotel newHotel = new Hotel(newCustomer,A);
                try {
                    manager1.add(listCustomer,newHotel);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "B":
                Hotel newHotel1 = new Hotel(newCustomer,B);
                try {
                    manager1.add(listCustomer,newHotel1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "C":
                Hotel newHotel2 = new Hotel(newCustomer,C);
                try {
                    manager1.add(listCustomer,newHotel2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "D":
                Hotel newHotel3 = new Hotel(newCustomer, D);
                try {
                    manager1.add(listCustomer, newHotel3);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }

    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}
