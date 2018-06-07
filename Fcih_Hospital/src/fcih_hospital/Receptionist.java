package fcih_hospital;

import Hospital.Clinic;
import Hospital.Rooms;
import Ihospital.Iprocessing;
import static fcih_hospital.Patient.Patients_data;
import static fcih_hospital.medicalReport.medicalReport_data;
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

public class Receptionist extends Employees implements Iprocessing, Serializable {

    public static boolean flag = true;
    
    static ArrayList<Receptionist> recep_data = new ArrayList<>();

    public int Book_room(Rooms room,String health_problem )throws IOException{
     int room_number = 0;
     room  = new Rooms();
     ArrayList<Rooms> booking=new ArrayList<>();
    /* FileInputStream FIS =  new FileInputStream("Room.bin");
            ObjectInputStream in  = new ObjectInputStream(FIS);
           
        try {
            booking = (ArrayList<Department>) (Object) in.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Receptionist.class.getName()).log(Level.SEVERE, null, ex);
        }*/
     
        for(Rooms x : booking){
            
         if(x.getDept().equals(health_problem)){
             room = x;
             System.out.println(room.getDept());
             room_number = x.getRoomNumber()+1;
             room.setRoomNumber(x.getRoomNumber()+1);
             return room_number;
         }
        }
   
     FileOutputStream FOS = new FileOutputStream("Room.bin");
           ObjectOutputStream out = new ObjectOutputStream(FOS);
           out.writeObject(booking);
           out.close();
           FOS.close();
        return 20;
    

}

    public Clinic Reserve_clinic_appointment(Clinic a, String y) {
         a=new Clinic();
    ArrayList<Clinic>list=new ArrayList<>();
    String APP;
    
   
    int id,TS,TE ;
    
    
    
    
    if(y.equals("HeartClinic")){
    try{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("HeartClinic.bin"));
    list=(ArrayList<Clinic>)(Object)in.readObject();
    in.close();
    }
    catch(Exception e)
    {
    
    }
    a=list.get(list.size()-1);
    id=a.getId();
    id++;
    a.setId(id);
    TS=a.getTimeStart();
    TS++;
    a.setTimeStart(TS);
    TE=a.getTimeEnd();
    TE++;
    a.setTimeEnd(TE);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    if(a.getTimeStart()==12)
    {
    a.setId(1);
    a.setTimeStart(9);
    a.setTimeEnd(10);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    
    }
    list.add(a);
    
    try{
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("HeartClinic.bin"));
    out.writeObject(list);
    out.close();
    }
    catch(Exception e)
    {
    
    }
    }
    
    
    
    if(y.equals("DentistClinic")){
    try{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("DentistClinic.bin"));
    list=(ArrayList<Clinic>)(Object)in.readObject();
    in.close();
    }
    catch(Exception e)
    {
    
    }
    a=list.get(list.size()-1);
    id=a.getId();
    id++;
    a.setId(id);
    TS=a.getTimeStart();
    TS++;
    a.setTimeStart(TS);
    TE=a.getTimeEnd();
    TE++;
    a.setTimeEnd(TE);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    if(a.getTimeStart()==12)
    {
    a.setId(1);
    a.setTimeStart(9);
    a.setTimeEnd(10);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    
    }
    list.add(a);
    
    try{
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("DentistClinic.bin"));
    out.writeObject(list);
    out.close();
    }
    catch(Exception e)
    {
    
    }
    }
    
    
    
     if(y.equals("DermatologyClinic")){
    try{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("DermatologyClinic.bin"));
    list=(ArrayList<Clinic>)(Object)in.readObject();
    in.close();
    }
    catch(Exception e)
    {
    
    }
    a=list.get(list.size()-1);
    id=a.getId();
    id++;
    a.setId(id);
    TS=a.getTimeStart();
    TS++;
    a.setTimeStart(TS);
    TE=a.getTimeEnd();
    TE++;
    a.setTimeEnd(TE);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    if(a.getTimeStart()==12)
    {
    a.setId(1);
    a.setTimeStart(9);
    a.setTimeEnd(10);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    
    }
    list.add(a);
    
    try{
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("DermatologyClinic.bin"));
    out.writeObject(list);
    out.close();
    }
    catch(Exception e)
    {
    
    }
    }
    
    
    
     if(y.equals("EarAndNoseAndThroatClinic")){
    try{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("EarAndNoseAndThroatClinic.bin"));
    list=(ArrayList<Clinic>)(Object)in.readObject();
    in.close();
    }
    catch(Exception e)
    {
    
    }
    a=list.get(list.size()-1);
    id=a.getId();
    id++;
    a.setId(id);
    TS=a.getTimeStart();
    TS++;
    a.setTimeStart(TS);
    TE=a.getTimeEnd();
    TE++;
    a.setTimeEnd(TE);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    if(a.getTimeStart()==12)
    {
    a.setId(1);
    a.setTimeStart(9);
    a.setTimeEnd(10);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    
    }
    list.add(a);
    
    try{
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("EarAndNoseAndThroatClinic.bin"));
    out.writeObject(list);
    out.close();
    }
    catch(Exception e)
    {
    
    }
    }
    
     
     
     
     if(y.equals("GeneralSurgeryAndVascularClinic")){
    try{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("GeneralSurgeryAndVascularClinic.bin"));
    list=(ArrayList<Clinic>)(Object)in.readObject();
    in.close();
    }
    catch(Exception e)
    {
    
    }
    a=list.get(list.size()-1);
    id=a.getId();
    id++;
    a.setId(id);
    TS=a.getTimeStart();
    TS++;
    a.setTimeStart(TS);
    TE=a.getTimeEnd();
    TE++;
    a.setTimeEnd(TE);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    if(a.getTimeStart()==12)
    {
    a.setId(1);
    a.setTimeStart(9);
    a.setTimeEnd(10);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    
    }
    list.add(a);
    
    try{
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("GeneralSurgeryAndVascularClinic.bin"));
    out.writeObject(list);
    out.close();
    }
    catch(Exception e)
    {
    
    }
    }
     
     
     if(y.equals("ObstetricsAndGyneocologyClinic")){
    try{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("ObstetricsAndGyneocologyClinic.bin"));
    list=(ArrayList<Clinic>)(Object)in.readObject();
    in.close();
    }
    catch(Exception e)
    {
    
    }
    a=list.get(list.size()-1);
    id=a.getId();
    id++;
    a.setId(id);
    TS=a.getTimeStart();
    TS++;
    a.setTimeStart(TS);
    TE=a.getTimeEnd();
    TE++;
    a.setTimeEnd(TE);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    if(a.getTimeStart()==12)
    {
    a.setId(1);
    a.setTimeStart(9);
    a.setTimeEnd(10);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    
    }
    list.add(a);
    
    try{
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("ObstetricsAndGyneocologyClinic.bin"));
    out.writeObject(list);
    out.close();
    }
    catch(Exception e)
    {
    
    }
    }
     
     
     if(y.equals("InternalMedicineClinic")){
    try{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("InternalMedicineClinic.bin"));
    list=(ArrayList<Clinic>)(Object)in.readObject();
    in.close();
    }
    catch(Exception e)
    {
    
    }
    a=list.get(list.size()-1);
    id=a.getId();
    id++;
    a.setId(id);
    TS=a.getTimeStart();
    TS++;
    a.setTimeStart(TS);
    TE=a.getTimeEnd();
    TE++;
    a.setTimeEnd(TE);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    if(a.getTimeStart()==12)
    {
    a.setId(1);
    a.setTimeStart(9);
    a.setTimeEnd(10);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    
    }
    list.add(a);
    
    try{
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("InternalMedicineClinic.bin"));
    out.writeObject(list);
    out.close();
    }
    catch(Exception e)
    {
    
    }
    }
     
     
     if(y.equals("OrthopedicClinic")){
    try{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("OrthopedicClinic.bin"));
    list=(ArrayList<Clinic>)(Object)in.readObject();
    in.close();
    }
    catch(Exception e)
    {
    
    }
    a=list.get(list.size()-1);
    id=a.getId();
    id++;
    a.setId(id);
    TS=a.getTimeStart();
    TS++;
    a.setTimeStart(TS);
    TE=a.getTimeEnd();
    TE++;
    a.setTimeEnd(TE);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    if(a.getTimeStart()==12)
    {
    a.setId(1);
    a.setTimeStart(9);
    a.setTimeEnd(10);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    
    }
    list.add(a);
    
    try{
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("OrthopedicClinic.bin"));
    out.writeObject(list);
    out.close();
    }
    catch(Exception e)
    {
    
    }
    }
     
     
     
     if(y.equals("EyeClinic")){
    try{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("EyeClinic.bin"));
    list=(ArrayList<Clinic>)(Object)in.readObject();
    in.close();
    }
    catch(Exception e)
    {
    
    }
    a=list.get(list.size()-1);
    id=a.getId();
    id++;
    a.setId(id);
    TS=a.getTimeStart();
    TS++;
    a.setTimeStart(TS);
    TE=a.getTimeEnd();
    TE++;
    a.setTimeEnd(TE);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    if(a.getTimeStart()==12)
    {
    a.setId(1);
    a.setTimeStart(9);
    a.setTimeEnd(10);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    
    }
    list.add(a);
    
    try{
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("EyeClinic.bin"));
    out.writeObject(list);
    out.close();
    }
    catch(Exception e)
    {
    
    }
    }
     
     
     if(y.equals("TractClinic")){
    try{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("TractClinic.bin"));
    list=(ArrayList<Clinic>)(Object)in.readObject();
    in.close();
    }
    catch(Exception e)
    {
    
    }
    a=list.get(list.size()-1);
    id=a.getId();
    id++;
    a.setId(id);
    TS=a.getTimeStart();
    TS++;
    a.setTimeStart(TS);
    TE=a.getTimeEnd();
    TE++;
    a.setTimeEnd(TE);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    if(a.getTimeStart()==12)
    {
    a.setId(1);
    a.setTimeStart(9);
    a.setTimeEnd(10);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    
    }
    list.add(a);
    
    try{
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("TractClinic.bin"));
    out.writeObject(list);
    out.close();
    }
    catch(Exception e)
    {
    
    }
    }
     
     
     
     if(y.equals("EmergencyClinic")){
    try{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("EmergencyClinic.bin"));
    list=(ArrayList<Clinic>)(Object)in.readObject();
    in.close();
    }
    catch(Exception e)
    {
    
    }
    a=list.get(list.size()-1);
    id=a.getId();
    id++;
    a.setId(id);
    TS=a.getTimeStart();
    TS++;
    a.setTimeStart(TS);
    TE=a.getTimeEnd();
    TE++;
    a.setTimeEnd(TE);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    if(a.getTimeStart()==24)
    {
    a.setId(1);
    a.setTimeStart(1);
    a.setTimeEnd(2);
    APP=a.getTimeStart()+":"+a.getTimeEnd();
    a.setAvailable_appointment(APP);
    
    }
    list.add(a);
    
    try{
    ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("EmergencyClinic.bin"));
    out.writeObject(list);
    out.close();
    }
    catch(Exception e)
    {
    
    }
    }
     
    return a; 
    }

    public String Get_Physician(String Health_problems) {
        Doctor w=new Doctor();
             ArrayList<Doctor> Arr=new ArrayList<Doctor>();
             Arr=null;           
        try{
            
            FileInputStream fis=new FileInputStream("Doctordata.bin");
            ObjectInputStream Inp=new ObjectInputStream(fis);
            Arr=(ArrayList<Doctor>)(Object)Inp.readObject();
                for (int i=0;i<Arr.size();i++){
                   w=Arr.get(i);
                   System.out.println("w="+Arr.get(i).getSpecialization());
                   String o=new String();
                   o=w.getSpecialization();
     
                    //System.out.println("w="+Arr.get(i).getName());
                        if(Health_problems.equals("BreakingBones")&&o.equals("OrthopedicAndFractures")){
                            //System.out.println(w.getName());
                            return w.getFname()+w.getLname()+w.getFaname();}
                        else{
                            if(Health_problems.equals("Gastrointestinalpain")&&o.toString().equals("InternalDiseases"))
                                return w.getFname()+w.getLname()+w.getFaname();
                            else{
                                if(Health_problems.equals("SeriousInjury")&&o.toString().equals("Surgery"))
                                    return w.getFname()+w.getLname()+w.getFaname();
                                else{
                                    if(Health_problems.equals("NervousTension")&&o.toString().equals("Neurology"))
                                       return w.getFname()+w.getLname()+w.getFaname();
                                    else{
                                        if(Health_problems.equals("EyePain")&&o.toString().equals("Opthalmology"))
                                            return w.getFname()+w.getLname()+w.getFaname();
                                        else{
                                            if(Health_problems.equals("Pregnancy")&&o.toString().equals("Gynecology"))
                                                return w.getFname()+w.getLname()+w.getFaname();
                                         
                                            
                                            }
                                        }
                                    }
                                }
                            
                            }
                    
                    }
                fis.close();
                Inp.close();
              
            
        }
            catch(FileNotFoundException e){
                  System.out.println(e);
                }
        catch(Exception e){
        System.out.println(e);
        }
        
     return "this health problem not saported";  
    }

    
    @Override
    public Object viewData(Object o) {

        String p_name = (String) o;
        String fullName = new String();

        for (Patient obj : Patients_data) {
            fullName = obj.getFname() + obj.getLname() + obj.getFaname();
            if (fullName.equals(p_name)) {
                return (Patient) obj;
            }

        }
        return null;
    }

    @Override
    public void addData(Object o) {
        Patient item = (Patient) o;
        item.writeData(o);

    }

    public boolean removeData(int id) {
        
       for (Patient obj : Patients_data) {

            if (obj.getId() == id) {
               
                Patients_data.remove(obj);
                
                return true;   
            }
        }
        return false;
    
    }

    @Override
    public Person Search(int Id) {
        for (Patient obj : Patients_data) {
System.out.println("الموجودين "+obj.getId());
            if (obj.getId() == Id) {
                System.out.println("Found"+obj.getId());
                return (Patient) obj;
                
            }
        }
        return null;
    }

    @Override
    public boolean editData(Object EditedData, int ID) {
        for (Patient obj : Patients_data) {
            if (obj.getId() == ID) {
                Patients_data.remove(obj);
                Patients_data.add((Patient) EditedData);
                return true;

            }
        }
        return false;
    }

    public static void loadAllData() {
        if(flag){
        FileInputStream FIS;
        try {
            
            FIS = new FileInputStream("recepdata.bin");
            ObjectInputStream in  = new ObjectInputStream(FIS);
           
            recep_data = (ArrayList<Receptionist>) (Object) in.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Receptionist.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Receptionist.class.getName()).log(Level.SEVERE, null, ex);
        }
          flag = false;  
        }
    }

   
    public static void SaveAllData() {
        FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("recepdata.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(recep_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Receptionist.class.getName()).log(Level.SEVERE, null, ex);
        } 
             
            catch (IOException ex) {
                Logger.getLogger(Receptionist.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    @Override
    public ArrayList<Object> readData() {
        return (ArrayList<Object>) (Object) recep_data;
    }

    @Override
    public void writeData(Object o) {
        Receptionist obj = ((Receptionist) o);
        recep_data.add(obj);
    }

    

}
