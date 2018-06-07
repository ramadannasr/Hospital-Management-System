package Hospital;

import Ihospital.IfileBinary;
import java.io.Serializable;
import java.util.ArrayList;

public class Rooms implements IfileBinary, Serializable{

    private int roomNumber;
    
    private String dept;

    private ArrayList<Rooms> booking;
    
    public static boolean flag = true;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public ArrayList<Rooms> getBooking() {
        return booking;
    }

    public void setBooking(ArrayList<Rooms> booking) {
        this.booking = booking;
    }
    

    public boolean Check_availability(String health_problem) {
        return true;
    }

    
    public static void loadAllData() {
        
    }

   
    public static void SaveAllData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> readData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeData(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
