
 package fcih_hospital;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class Patient extends Person implements Serializable{
    
    static ArrayList<Patient> Patients_data = new ArrayList<>();

    private String Health_problems;

    private String Physician;

    private String Needed_medications;

    private String checkup_date;

    private int height;
    
    private int weight;

    private int Room_number;

    private String time;

    private String Case;
    
   private String Start_booking;
   
   public File Image;
   
   public static boolean flag = true;

    public String getStart_booking() {
        return Start_booking;
    }

    public void setStart_booking(String Start_booking) {
        this.Start_booking = Start_booking;
    }

    

    private Recipt roshitta;
    
    public Patient(){
roshitta = new Recipt();
}


   

    public Recipt getRoshitta() {
        return roshitta;
    }

    

    public String getHealth_problems() {
        return Health_problems;
    }

    public void setHealth_problems(String Health_problems) {
        this.Health_problems = Health_problems;
    }

    public String getPhysician() {
        return Physician;
    }

    public void setPhysician(String Physician) {
        this.Physician = Physician;
    }

    public String getNeeded_medications() {
        return Needed_medications;
    }

    public void setNeeded_medications(String Needed_medications) {
        this.Needed_medications = roshitta.getRecipt_content();
    }

    public String getCheckup_date() {
        return checkup_date;
    }

    public void setCheckup_date(String checkup_date) {
        this.checkup_date = checkup_date;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRoom_number() {
        return Room_number;
    }

    public void setRoom_number(int Room_number) {
        this.Room_number = Room_number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCase() {
        return Case;
    }

    public void setCase(String Case) {
        this.Case = Case;
    }
   
    
    public static void loadAllData() {
        if(flag){
        FileInputStream FIS;
        try {
            FIS = new FileInputStream("Patientdata.bin");
            ObjectInputStream in  = new ObjectInputStream(FIS);
           
            Patients_data = (ArrayList<Patient>) (Object) in.readObject();
               
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
           flag = false; 
           System.out.println("flag = false");
        }
    }

   
    public static void SaveAllData() {
        FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("Patientdata.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(Patients_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        } 
             
            catch (IOException ex) {
                Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    

    @Override
    public ArrayList<Object> readData() {
        return (ArrayList<Object>) (Object) Patients_data;
    }

    @Override
    public void writeData(Object o) {
        Patient obj = ((Patient) o);
        Patients_data.add(obj);
    }

    
}
