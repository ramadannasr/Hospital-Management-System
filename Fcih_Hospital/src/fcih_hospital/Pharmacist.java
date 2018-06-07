/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcih_hospital;

import Ihospital.Iprocessing;
import static fcih_hospital.Receptionist.recep_data;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author romyo
 */
public class Pharmacist extends Employees implements Serializable,Iprocessing{
    
    static ArrayList<Pharmacist> Pharmacist_data = new ArrayList<>();
    
    public static boolean flag = true;
    boolean f= false;
     public String  PrepareMedicine(Map<String,Integer> WantedMedicine){
     for(Pharmacy obj:Pharmacy.Pharmacy_data){
     for(Map.Entry<String , Integer> entry:WantedMedicine.entrySet()){
     if(obj.getMedicineName().equals(entry.getKey())){
     if(obj.getExistedQuantity() > entry.getValue()||obj.getExistedQuantity() == entry.getValue()){
     obj.setExistedQuantity(obj.getExistedQuantity()-entry.getValue());
     obj.setSoldQuantity(obj.getSoldQuantity()+entry.getValue());
     f= true;
     }
     else 
     return "Sorry ! we do not have this quantity from : "+obj.getMedicineName();
     }
      
     }
     if(!f)
         return "Sorry ! we do not have this medicine : "+obj.getMedicineName();
         
     
     }
     return "accepted";
     }

    @Override
    public Object Search(int Id) {
         for (Pharmacy obj : Pharmacy.Pharmacy_data) {

            if (obj.getMedic_Id() == Id) {
                return (Pharmacy) obj;
            }
        }
        return null;
    }

    @Override
    public boolean editData(Object EditedData, int ID) {
        for (Pharmacy obj : Pharmacy.Pharmacy_data) {
            if (obj.getMedic_Id() == ID) {
               Pharmacy.Pharmacy_data.remove(obj);
               Pharmacy.Pharmacy_data.add((Pharmacy) EditedData);
                return true;

            }
        }
         return false;
    }
    
    
    public static void loadAllData() {
        if(flag){
          FileInputStream FIS;
        try {
            FIS = new FileInputStream("Pharmacistdata.bin");
            ObjectInputStream in = new ObjectInputStream(FIS);

            Pharmacist_data = (ArrayList<Pharmacist>) (Object) in.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pharmacist.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pharmacist.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag = false;
        }
    }

    
    public static void SaveAllData() {
         FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("Pharmacistdata.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(Pharmacist_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pharmacist.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pharmacist.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Object> readData() {
       return (ArrayList<Object>) (Object) Pharmacist_data;
    }

    @Override
    public void writeData(Object o) {
       Pharmacist obj = (Pharmacist) o;
        Pharmacist_data.add(obj);
    }

    @Override
    public void addData(Object o) {
        Pharmacy item = (Pharmacy) o;
        item.setExistedQuantity(item.getExistedQuantity()+item.getQuantity());
        item.writeData(o);
    }

    @Override
    public Object viewData(Object o) {
        String medic_name = (String) o;

        for (Pharmacy obj : Pharmacy.Pharmacy_data) {
            if (obj.getMedicineName().equals(medic_name)) {
                return (Pharmacy) obj;
            }

        }
        return null;
    }

    @Override
    public boolean removeData(int id) {
        
         
            for (Pharmacy obj : Pharmacy.Pharmacy_data) {

                if (obj.getMedic_Id()== id) {
                   
                    Pharmacy.Pharmacy_data.remove(obj);
                    Employees.remover(obj);

                    return true;
                }
            }

        
         
        
        return false;
    }
    
}
