package customer;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private String fullName;
    private String birthDay ;
    private String id;

    public Person() {
    }

    public Person(String fullName, String birthDay, String id) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
