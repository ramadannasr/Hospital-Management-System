package fcih_hospital;

import Ihospital.IfileBinary;
import static fcih_hospital.Receptionist.recep_data;
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

public class Recipt implements Serializable,IfileBinary{

    static ArrayList<Recipt> Recipt_data = new ArrayList<>();
    
    private String recipt_content;

    private int Pid;

    private int reciptno;

    private String prescribing;
    
    public static boolean flag = true;

    public String getRecipt_content() {
        return recipt_content;
    }

    public void setRecipt_content(String recipt_content) {
        this.recipt_content = recipt_content;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int Pid) {
        this.Pid = Pid;
    }

    public int getReciptno() {
        return reciptno;
    }

    public void setReciptno(int reciptno) {
        this.reciptno = reciptno;
    }

    public String getPrescribing() {
        return prescribing;
    }

    public void setPrescribing(String prescribing) {
        this.prescribing = prescribing;
    }

    
    public static void loadAllData() {
        if(flag){
         FileInputStream FIS;
        try {
            FIS = new FileInputStream("Reciptdata.bin");
            ObjectInputStream in = new ObjectInputStream(FIS);

            Recipt_data = (ArrayList<Recipt>) (Object) in.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Recipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Recipt.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag = false;
        }
    }

    
    public static void SaveAllData() {
         FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("Reciptdata.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(Recipt_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Recipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Recipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Object> readData() {
       return (ArrayList<Object>) (Object) Recipt_data;
    }

    @Override
    public void writeData(Object o) {
        Recipt obj = ((Recipt) o);
        Recipt_data.add(obj);
    }
    
    
    
}
