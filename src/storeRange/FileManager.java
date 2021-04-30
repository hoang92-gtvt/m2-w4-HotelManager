package storeRange;

import customer.Person;
import main.Hotel;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static ArrayList<Hotel> readList(String filePath) throws IOException, ClassNotFoundException {
        File newFile = new File(filePath);
        ArrayList<Hotel> readerList = new  ArrayList<>();
        if(newFile.length()>0){
                FileInputStream  fileOutputStream = new FileInputStream(newFile);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
                Object object = objectInputStream.readObject();

                objectInputStream.close();
                fileOutputStream.close();
                readerList = (ArrayList<Hotel>)object;
        }
        return readerList;
    }

    public static void writeFile(ArrayList<Hotel> list , String filePath) throws IOException{
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oOs = new ObjectOutputStream(fos);
        oOs.writeObject(list);
        oOs.close();
        fos.close();

    }

}
