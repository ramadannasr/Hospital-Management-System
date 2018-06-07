package fcih_hospital;

import Ihospital.IfileBinary;
import static fcih_hospital.Patient.Patients_data;
import static fcih_hospital.Recipt.Recipt_data;
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

public class medicalReport implements Serializable,IfileBinary{

    static ArrayList<medicalReport> medicalReport_data = new ArrayList<>();    
    
    private int reportno;
    
    private String report;
    
    public static boolean flag = true;

    public int getReportno() {
        return reportno;
    }

    public void setReportno(int reportno) {
        this.reportno = reportno;
    }
    
    

    public medicalReport prepareReport(int id) {
        
        String name = null;
        for(Patient taqrer: Patients_data){
         if (taqrer.getId() == id) {
             name = taqrer.getFname()+" "+taqrer.getLname()+" "+taqrer.getFaname();
             this.reportno =id%(20140000-1);
             this.setReportno(id%(20140000-1));
             this.report = "\t\t\t"+"ReportNo : "+this.reportno+"\n\n"+"Patient Name : "+name+"\t"+"ID : "+id+"\n"+
                     "Age : "+taqrer.getAge()+"\n"+"Health Problem : "+taqrer.getHealth_problems()+"\n"+"Case : "+taqrer.getCase()+"\n"+"Analgesics : "
                     +taqrer.getNeeded_medications()+"\t"+"Room Number : "+taqrer.getRoom_number();
             this.writeData(this);
                return (medicalReport) this;
            }
        }
        
        return null;
        
    }
    
    
    public String getReport(){
        if(!medicalReport_data.isEmpty())
    return this.report;
        else return "not found";
    }
    public medicalReport getReportIfExist(int id){
        int reportno = id%(20140000-1);
        for(medicalReport obj : medicalReport_data){
        if(obj.getReportno() == reportno){
           medicalReport o = new medicalReport(); 
           o = obj;
        return o;
        }
        }
    
    return null;
    }
    
    
    public static void loadAllData() {
        
        if(flag){
         FileInputStream FIS;
        try {
            FIS = new FileInputStream("medicalReport.bin");
            ObjectInputStream in = new ObjectInputStream(FIS);

            medicalReport_data = (ArrayList<medicalReport>) (Object) in.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(medicalReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(medicalReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag = false;
        }
    }

    public static void SaveAllData() {
         FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("medicalReport.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(medicalReport_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(medicalReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(medicalReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Object> readData() {
       return (ArrayList<Object>) (Object) medicalReport_data;
    }

    @Override
    public void writeData(Object o) {
        medicalReport obj = ((medicalReport) o);
        medicalReport_data.add(obj);
    }
    
    
}
