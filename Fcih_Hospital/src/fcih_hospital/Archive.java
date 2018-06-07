/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcih_hospital;

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
public  class Archive  extends Employees implements Serializable {
    private static String FileName = null;
    
    public static boolean flag1 = true;
    public static boolean flag2 = true;
    
    static ArrayList<Person> archived_data = new ArrayList<>();
    
    static ArrayList<Archive> archiveEmployee_data = new ArrayList<>();
    
    public static void AddDataToArchive(Object o){
        
        
          
        if (o instanceof Patient) {
            FileName = "Patient_Archieve.bin";
 } else if (o instanceof Nursing) {
            FileName = "Nursing_Archieve.bin";
 } else if (o instanceof Receptionist){
            FileName = "Receptionist_Archieve.bin";
 } else if (o instanceof Doctor){
            FileName = "Doctor_Archieve.bin";
 } else if (o instanceof Administration){
            FileName = "Administration_Archieve.bin";
 } else if (o instanceof SuperAdmin){
            FileName = "SuperAdmin_Archieve.bin";              
 } else if (o instanceof Cashier){
            FileName = "Cashier_Archieve.bin";            
        }
   else if (o instanceof Archive){
            FileName = "archEmpls_Archieve.bin";            
        }
   else if (o instanceof medicalReport){
            FileName = "medicalReport_Archieve.bin";            
        }   
   else if (o instanceof Bill){
            FileName = "Bill_Archieve.bin";            
        }     
   else if (o instanceof Pharmacist){
            FileName = "Pharmacist_Archieve.bin";            
        }  
   else if (o instanceof Pharmacy){
            FileName = "Pharmacy_Archieve.bin";            
        }      
        
    archived_data.add((Person) o);
    
    }
    
    @Override
    public Object Search(int Id) {
        for(Person E:archived_data){
            if(E.getId()==Id)
            {
                return E;
            }    
        }
        return null;
    }

    public static void ReadArchivedData(String o){
if(flag1){
         if (o.equals("Patient")) {
            FileName = "Patient_Archieve.bin";
 } else if (o.equals("Nurse")) {
            FileName = "Nursing_Archieve.bin";
 } else if (o.equals("Receptionist")){
            FileName = "Receptionist_Archieve.bin";
 } else if (o.equals("Doctor")){
            FileName = "Doctor_Archieve.bin";
 } else if (o.equals("Administrator")){
            FileName = "Administration_Archieve.bin";
 } else if (o.equals("SuperAdmin")){
            FileName = "SuperAdmin_Archieve.bin";              
 } else if (o.equals("Cashier")){
            FileName = "Cashier_Archieve.bin";            
        }
   else if (o.equals("ArchiveEmployee")){
            FileName = "archEmpls_Archieve.bin";            
        }
   else if (o.equals("medicalReport")){
            FileName = "medicalReport_Archieve.bin";            
        }   
   else if (o.equals("Bill")){
            FileName = "Bill_Archieve.bin";            
        }
    else if (o.equals("Pharmacist")){
            FileName = "Pharmacist_Archieve.bin";            
        }   
     else if (o.equals("Pharmacy")){
            FileName = "Pharmacy_Archieve.bin";            
        }     
         FileInputStream FIS;
        try {
            FIS = new FileInputStream(FileName);
            ObjectInputStream in  = new ObjectInputStream(FIS);
           
            archived_data = (ArrayList<Person>) (Object) in.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archive.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archive.class.getName()).log(Level.SEVERE, null, ex);
        }
    
       flag1 = false;
    }
    
    }
   
        
    public static void SaveArchivedData() {
        
        FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream(FileName);
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(archived_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archive.class.getName()).log(Level.SEVERE, null, ex);
        } 
             
            catch (IOException ex) {
                Logger.getLogger(Archive.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
       
    }
    
    
    public static void loadAllData() {
        if(flag2){
        FileInputStream FIS;
        try {
            FIS = new FileInputStream("archiveEmployee.bin");
            ObjectInputStream in  = new ObjectInputStream(FIS);
           
            archiveEmployee_data = (ArrayList<Archive>) (Object) in.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archive.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archive.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag2 = false;
    }}
    
    public static void SaveAllData() {
     FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("archiveEmployee.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(archiveEmployee_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archive.class.getName()).log(Level.SEVERE, null, ex);
        } 
             
            catch (IOException ex) {
                Logger.getLogger(Archive.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }

    @Override
    public ArrayList<Object> readData() {
        return (ArrayList<Object>) (Object) archiveEmployee_data;
    }

    @Override
    public void writeData(Object o) {
       Archive obj = ((Archive) o);
        archiveEmployee_data.add(obj);
    }
    @Override
    public boolean editData(Object EditedData, int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
