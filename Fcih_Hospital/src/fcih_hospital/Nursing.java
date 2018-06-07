package fcih_hospital;


import Ihospital.Iprocessing;
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

public class Nursing extends Employees implements Serializable{
    
    static ArrayList<Nursing> nursing_data = new ArrayList<>();

    private String nursing_shift;
    
    private String Specialization;

    private String dept;
    
     public static boolean flag = true;

    public String getNursing_shift() {
        return nursing_shift;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setNursing_shift(String nursing_shift) {
        this.nursing_shift = nursing_shift;
    }
    
 
    public medicalReport makeReport(medicalReport report, int id) {
        medicalReport myReport= new medicalReport();
        myReport = report.getReportIfExist(id);
        if(myReport != null)
            return myReport;
        else{
        myReport = report.prepareReport(id);
        if(myReport != null)
            return myReport;
            }
     
            return null;
    }
    public ArrayList<medicalReport> presentReports(){
    
    return medicalReport.medicalReport_data;
    }

    @Override
    public Object Search(int Id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean editData(Object EditedData, int ID) {
      for (medicalReport obj : medicalReport_data) {
            if (obj.getReportno() == ID%(20140000-1)) {
                medicalReport_data.remove(obj);
                medicalReport_data.add((medicalReport) EditedData);
                return true;

            }
        }
        return false;
      
    }

    public static void loadAllData() {
        if(flag){
         FileInputStream FIS;
        try {
            FIS = new FileInputStream("Nursingdata.bin");
            ObjectInputStream in  = new ObjectInputStream(FIS);
           
            nursing_data = (ArrayList<Nursing>) (Object) in.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Nursing.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Nursing.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag = false;
        }
    }

    public static void SaveAllData() {
        
         FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("Nursingdata.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(nursing_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Nursing.class.getName()).log(Level.SEVERE, null, ex);
        } 
             
            catch (IOException ex) {
                Logger.getLogger(Nursing.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    
    
    }

    @Override
    public ArrayList<Object> readData() {
        return (ArrayList<Object>) (Object) nursing_data;
    }

    @Override
    public void writeData(Object o) {
       Nursing obj = ((Nursing) o);
        nursing_data.add(obj);
    }


}
