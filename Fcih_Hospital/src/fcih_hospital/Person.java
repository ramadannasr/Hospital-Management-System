package fcih_hospital;

import Ihospital.IfileBinary;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class Person implements IfileBinary ,Serializable{

    private String Fname;

    private String Lname;

    private String Faname;

    private int Id;
    
    private int Age;

    private String Phone;

    private String Gender;

    private String Address;

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getFaname() {
        return Faname;
    }

    public void setFaname(String Faname) {
        this.Faname = Faname;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    
    

    @Override
    public abstract ArrayList<Object> readData() ;

    @Override
    public abstract void writeData(Object o) ;
}
