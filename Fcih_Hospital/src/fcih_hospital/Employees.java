package fcih_hospital;

import static fcih_hospital.Administration.admin_data;
import static fcih_hospital.Archive.archiveEmployee_data;
import static fcih_hospital.Cashier.cash_data;
import static fcih_hospital.Doctor.docter_data;
import static fcih_hospital.Nursing.nursing_data;
import static fcih_hospital.Patient.Patients_data;
import static fcih_hospital.Receptionist.recep_data;
import static fcih_hospital.SuperAdmin.super_data;
import static fcih_hospital.medicalReport.medicalReport_data;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public abstract class Employees extends Person implements Serializable {

    private float Salary;

    private String date_of_joining;

    private String Username;

    private String Password;

    private static String emp_type;
     
    public static boolean flag = true;
   

    static HashMap<String, String> EmpsLogInData = new HashMap<String, String>();

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

    public String getDate_of_joining() {
        return date_of_joining;
    }

    public void setDate_of_joining(String date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public static Person LogIn(String uname, String pword) {
        boolean valid = false;
        readLogingData();
        try {
            valid = EmpsLogInData.get(uname).equals(pword);
        } catch (Exception e) {
        }
       
        if (valid) {
           
            for (Administration obj : admin_data) {
                if (obj.getUsername().equals(uname) && obj.getPassword().equals(pword)) {
                    
                    return obj;
                }
            }
            for (Doctor obj : docter_data) {
                if (obj.getUsername().equals(uname) && obj.getPassword().equals(pword)) {
                    
                    return obj;
                }
            }
            for (Receptionist obj : recep_data) {
                
                if (obj.getUsername().equals(uname) && obj.getPassword().equals(pword)) {
                    System.out.println("employees"+obj.getId());
                    
                    return obj;
                }
            }
            for (Nursing obj : nursing_data) {
                if (obj.getUsername().equals(uname) && obj.getPassword().equals(pword)) {
                    return obj;
                }
            }
            for (SuperAdmin obj : super_data) {
                if (obj.getUsername().equals(uname) && obj.getPassword().equals(pword)) {
                    return obj;
                }
            }
             for (Cashier obj : cash_data) {
                if (obj.getUsername().equals(uname) && obj.getPassword().equals(pword)) {
                    return obj;
                }
            }
             for (Pharmacist obj : Pharmacist.Pharmacist_data) {
                if (obj.getUsername().equals(uname) && obj.getPassword().equals(pword)) {
                    return obj;
                }
            }
            
        }
        return null;

    }

    public static void setEmp_type(String emp_type) {
        Employees.emp_type = emp_type;
    }

    public static String getEmp_type() {
        return emp_type;
    }

    private static HashMap<String, String> readLogingData() {
        
        
        FileInputStream FIS = null;
        try {
            FIS = new FileInputStream("EmployeesLogInData.bin");
            ObjectInputStream in = new ObjectInputStream(FIS);

            EmpsLogInData = (HashMap<String, String>) (Object) in.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return (HashMap<String, String>) (Object) EmpsLogInData;
        
    }

    public static void writeLogInData(String uname , String pword) {
  EmpsLogInData.put(uname, pword);
        FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("EmployeesLogInData.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(EmpsLogInData);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean remover(Object o) {
        int s = 0;
        
       
        if (o instanceof Patient) {
            Patient x=(Patient)o;
          int rn = x.getId()%(20140000-1);
            for(medicalReport obj : medicalReport_data){
            if(obj.getReportno() == rn){
             s = medicalReport_data.indexOf(obj); 
            }
            }
            if(!medicalReport_data.isEmpty()){
            Archive.AddDataToArchive(medicalReport_data.get(s));
             medicalReport_data.remove(s);
            }
            
            Patients_data.remove(o);      
 } else if (o instanceof Nursing) {
            nursing_data.remove(o);
 } else if (o instanceof Receptionist){
            recep_data.remove(o);
 } else if (o instanceof Doctor){
            docter_data.remove(o);
 } else if (o instanceof Administration){
            Administration.admin_data.remove(o);
 } else if (o instanceof SuperAdmin){
            super_data.remove(o);
 } else if (o instanceof medicalReport){
            medicalReport_data.remove(o);
 }
   else if (o instanceof Cashier){
            cash_data.remove(o);
 }   
   else if (o instanceof Archive){
            archiveEmployee_data.remove(o);
 }
   else if (o instanceof Bill){

 }
   else if (o instanceof Pharmacist){
            Pharmacist.Pharmacist_data.remove(o);
 }    
   else if (o instanceof Pharmacy){
            Pharmacy.Pharmacy_data.remove(o);
 }   
        Archive.AddDataToArchive(o);
       
       
        
        return false;
    }

    public abstract Object Search(int Id);

    public abstract boolean editData(Object EditedData, int ID);

  

   

    @Override
    public abstract ArrayList<Object> readData();

    @Override
    public abstract void writeData(Object o);

}
