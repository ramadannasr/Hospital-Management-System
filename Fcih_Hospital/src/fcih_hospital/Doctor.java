package fcih_hospital;

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

public class Doctor extends Employees implements Serializable {

    static ArrayList<Doctor> docter_data = new ArrayList<>();

    private String Specialization;

    private String dept;
    
    public static boolean flag = true;

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

    public void prescribMedicine(String Health_problems, Recipt writer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<medicalReport> checkReports(Nursing assistant) {
        
      return assistant.presentReports();
        
    }
    public void contentMedicine(String Health_problems, Recipt writer) {
        Recipt w=new Recipt();
        ArrayList<Recipt> Arr=new ArrayList<Recipt>();
        Arr=null;
      
        try{
            FileInputStream fis=new FileInputStream("Reciptdata.bin");
            ObjectInputStream Inp=new ObjectInputStream(fis);
            Arr=(ArrayList<Recipt>)(Object)Inp.readObject();
            for (int i=0;i<Arr.size();i++){
                   w=Arr.get(i);
                   String o=new String();
                   o=w.getPrescribing();
         if(Health_problems.equals("BreakingBones")&&o.equals("BreakingBones"))
              writer.setRecipt_content(w.getRecipt_content());
         
         else{      
             if(Health_problems.equals("Gastrointestinalpain")&&o.equals("Gastrointestinalpain"))
                writer.setRecipt_content(w.getRecipt_content());
             else{ 
                 if(Health_problems.equals("SeriousInjury")&&o.equals("SeriousInjury"))
                     writer.setRecipt_content(w.getRecipt_content());
                 else{
                      if(Health_problems.equals("NervousTension")&&o.equals("NervousTension"))
                     writer.setRecipt_content(w.getRecipt_content());
                     else{
                        if(Health_problems.equals("EyePain")&&o.equals("EyePain"))
                           writer.setRecipt_content(w.getRecipt_content());
                        else{
                            if(Health_problems.equals("Pregnancy")&&o.equals("Pregnancy"))
                            writer.setRecipt_content(w.getRecipt_content());
                            }}
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
    }
           public void prescribMedicine(int id, Recipt writer) {
        Recipt w=new Recipt();
        ArrayList<Recipt> Arr=new ArrayList<Recipt>();
        Arr=null;
        try{
            FileInputStream fis=new FileInputStream("recipt.bin");
            ObjectInputStream Inp=new ObjectInputStream(fis);
            Arr=(ArrayList<Recipt>)(Object)Inp.readObject();
            for (int i=0;i<Arr.size();i++){
                   w=Arr.get(i);
                   String o=new String();
                   o=w.getPrescribing();
                   if(w.getPid()==id)
                       writer.setPrescribing(w.getPrescribing());
                   else 
                       writer.setPrescribing("");
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
    }
                 public void write_copomplet_recipt(String Recipt_content,String Prescribing,int Pid){
      Recipt w=new Recipt();
      try{
       FileOutputStream FOS = new FileOutputStream("Doctordata.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            w.setPid(Pid);
            w.setRecipt_content(Recipt_content);
            w.setPrescribing(Prescribing);
            out.writeObject(w);
      
      }
      catch(FileNotFoundException e){
        System.out.println(e);
        }
        catch(Exception e){
        System.out.println(e);
        }
      
      
      }


    @Override
    public boolean editData(Object EditedData, int ID) {
         for (Recipt obj : Recipt_data) {
            if (obj.getPid() == ID) {
                Recipt_data.remove(obj);
                Recipt_data.add((Recipt) EditedData);
                return true;

            }
        }
         return false;
    }

    @Override
    public Object Search(int Id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public static void  loadAllData() {
        if(flag){
        FileInputStream FIS;
        try {
            FIS = new FileInputStream("Doctordata.bin");
            ObjectInputStream in = new ObjectInputStream(FIS);

            docter_data = (ArrayList<Doctor>) (Object) in.readObject();
         
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag = false;
        }
    }

    public static void SaveAllData() {
        FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("Doctordata.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(docter_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Object> readData() {
        return (ArrayList<Object>) (Object) docter_data;
    }

    @Override
    public void writeData(Object o) {
        Doctor obj = ((Doctor) o);
        docter_data.add(obj);
    }
    public static double[] No_oF_Doctors(){
        double[] n = {0,0,0,0,0,0};
    for(Doctor o : Doctor.docter_data){
        if(o.getDept().equals("OrthopedicAndFractures")){
        n[0]++;
        }
        else if(o.getDept().equals("InternalDiseases")){
        n[1]++;
        }
        else if(o.getDept().equals("Surgery")){
        n[2]++;
        }
        else if(o.getDept().equals("Neurology")){
        n[3]++;
        }
        else if(o.getDept().equals("Opthalmology")){
        n[4]++;
        }
        else if(o.getDept().equals("Gynecology")){
        n[5]++;
        }
    }
    System.out.println(n[0]+" "+n[1]+" "+n[2]+" "+n[3]+" "+n[4]+" "+n[5]+" ");
    
    return n;
    }
}
