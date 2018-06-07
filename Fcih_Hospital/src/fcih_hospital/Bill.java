package fcih_hospital;

import java.io.Serializable;
import java.util.ArrayList;

public class Bill implements Serializable{
    
   static ArrayList<Bill> invoices = new ArrayList<>();
    

    private int billNo;

    private String startDate;
    
    private float Amount;

    private long LengthOfStay;

    private String endDate;

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public long getLengthOfStay() {
        return LengthOfStay;
    }

    public void setLengthOfStay(long LengthOfStay) {
        this.LengthOfStay = LengthOfStay;
    }


    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
     
    public Bill invoice(String Name) {
        String fullName = null;   
         for (Patient obj : Patient.Patients_data) {
            fullName = obj.getFname() + obj.getLname() + obj.getFaname();
            if (fullName.equals(Name)) {
                this.startDate = obj.getStart_booking();
                this.billNo = obj.getId()%(20140000-1);  
                return this;
            }
         }
        return null;
                     
    }
    
    public String toString(String PatientFullName){
    
     return "Billno : "+this.getBillNo()+"\n"+"Patient Name : "+PatientFullName+"\n"+"Reservation Start Date : "+this.getStartDate()+"\n"+"Reservation End Date : "
                +this.getEndDate()+"\n"+"LengthOfStay : "+this.getLengthOfStay()+"\n"+"Amount : "+this.getAmount()+"\n";
    }
    
    public static void AllInvoices(){
   
        // = (ArrayList<Bill>)(Object) Archive.ReadArchivedData("Bill");
        
    }
}
