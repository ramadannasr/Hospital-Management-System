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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author romyo
 */
public class Cashier extends Employees implements Serializable{
    
    static ArrayList<Cashier> cash_data = new ArrayList<>();
    
    public static boolean flag = true;

    public Bill generateBill(Bill bill, String name) {
        
        long LengthOfStay;
        bill = bill.invoice(name);
        if (bill != null) {
            Date currentdate = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String endStay = "20/12/2015"; //sdf.format(currentdate);
            try {
                Date date1 = sdf.parse(bill.getStartDate());
                Date date2 = sdf.parse(endStay);
                LengthOfStay = date2.getTime() - date1.getTime();
                bill.setEndDate(endStay);
                bill.setLengthOfStay(TimeUnit.DAYS.convert(LengthOfStay, TimeUnit.MILLISECONDS));
                bill.setAmount(bill.getLengthOfStay() * (100 + 50));
            } catch (Exception e) {
                return null;
            }
           return bill; 
        }
     return null;   
    }
    
    public ArrayList<Bill> viewAllBills(String Date){
    ArrayList<Bill> Allinvoices = new ArrayList<Bill>();
    Bill.AllInvoices();
    for(Bill obj : Bill.invoices){
    if(obj.getEndDate().equals(Date)){
      Allinvoices.add(obj);
    }
    }
        
        return Allinvoices;
    
    }

    
    @Override
    public Object Search(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editData(Object EditedData, int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public static void loadAllData() {
        if(flag){
        FileInputStream FIS;
        try {
            FIS = new FileInputStream("Cashierdata.bin");
            ObjectInputStream in = new ObjectInputStream(FIS);

            cash_data = (ArrayList<Cashier>) (Object) in.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag = false;
        }
    }

    public static void SaveAllData() {
        FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("Cashierdata.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(cash_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Object> readData() {
        return (ArrayList<Object>) (Object) cash_data;
    }

    @Override
    public void writeData(Object o) {
        Cashier obj = ((Cashier) o);
        cash_data.add(obj);
    }

    
}
