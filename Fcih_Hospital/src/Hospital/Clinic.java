package Hospital;

import Ihospital.IfileBinary;
import java.io.Serializable;
import java.util.ArrayList;

public class Clinic implements IfileBinary, Serializable{

    private String Available_appointment;

    private String specialization;

    private int Id;

    private int timeStart;

    private int timeEnd;
    
    public static boolean flag = true;

    public String getAvailable_appointment() {
        return Available_appointment;
    }

    public void setAvailable_appointment(String Available_appointment) {
        this.Available_appointment = Available_appointment;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(int timeStart) {
        this.timeStart = timeStart;
    }

    public int getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(int timeEnd) {
        this.timeEnd = timeEnd;
    }
    

    
    public static void loadAllData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
