    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcih_hospital;

import Ihospital.IfileBinary;
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

/**
 *
 * @author romyo
 */
public class Pharmacy implements IfileBinary, Serializable{
    
    private String CustomerName;
    
    private String medicineName;
    
    private String dateOfProduction;
    
    private String ExpirationDate;
    
    private int ExistedQuantity;
    
    private int SoldQuantity;
    
    private int Quantity;
    
    public static boolean flag = true;

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    private int Medic_Id;

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    public int getExistedQuantity() {
        return ExistedQuantity;
    }

    public void setExistedQuantity(int ExistedQuantity) {
        this.ExistedQuantity = ExistedQuantity;
    }

    public int getSoldQuantity() {
        return SoldQuantity;
    }

    public void setSoldQuantity(int SoldQuantity) {
        this.SoldQuantity = SoldQuantity;
    }

    public int getMedic_Id() {
        return Medic_Id;
    }

    public void setMedic_Id(int Medic_Id) {
        this.Medic_Id = Medic_Id;
    }
    
    static ArrayList<Pharmacy> Pharmacy_data = new ArrayList<>();
    
     public ArrayList<String> GetMedicineNames(){
    ArrayList<String> Arr=new ArrayList<>();
    String s=new String();
    for(Pharmacy ph:Pharmacy_data){
    s=ph.getMedicineName();
    Arr.add(s);
   
    }
    return Arr;
    }

    
    public static void loadAllData() {
        if(flag){
         FileInputStream FIS;
        try {
            FIS = new FileInputStream("Pharmacydata.bin");
            ObjectInputStream in = new ObjectInputStream(FIS);

            Pharmacy_data = (ArrayList<Pharmacy>) (Object) in.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pharmacy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pharmacy.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag = false;
        }
    }

    public static void SaveAllData() {
       FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("Pharmacydata.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(Pharmacy_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pharmacy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pharmacy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Object> readData() {
        return (ArrayList<Object>) (Object) Pharmacy_data;
    }

    @Override
    public void writeData(Object o) {
       Pharmacy obj = (Pharmacy) o;
        Pharmacy_data.add(obj);
    }
    
}
