/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcih_hospital;

import GUI.Login;
import GUI.MenuPharmacist;
import Hospital.Clinic;
import Hospital.Rooms;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author romyo
 */
public class Fcih_Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Receptionist.loadAllData();
        Doctor.loadAllData();
        Administration.loadAllData();
        Nursing.loadAllData();
        Cashier.loadAllData();
        Pharmacist.loadAllData();
        Login log = new Login("Helwan University Hospital");
        log.setVisible(true);

        Scanner scan = new Scanner(System.in);
        int loginType = -1;
        int result = 0;
        int idNumber;
        String valid = "accepted";
        Patient access = new Patient();
        
        access.loadAllData();
        Doctor doc = new Doctor();
        doc.loadAllData();
        SuperAdmin superadmin = new SuperAdmin();
        Administration admin = new Administration();
        Recipt writer = new Recipt();
       Receptionist recep = new Receptionist();
       // new Receptionist().loadAllData();
        Nursing nurse = new Nursing();
        medicalReport r = new medicalReport();
        r.loadAllData();
        Pharmacy agz = new Pharmacy();
       // agz.loadAllData();
        Pharmacist sayd = new Pharmacist();
        Rooms room = new Rooms();
        Bill bill = new Bill();
        Archive arch = new Archive();
        Cashier cash = new Cashier();
        Doctor ra = new Doctor();
        Person x ;
    
     
      //Employees.writeLogInData("Admin@yahoo.com", "12345678");
      
      /*  if(x.getId()>199 &&x.getId()<4000){
           
       System.out.println("i am doc"+x.getId()+"  "+x.getLname());
       
       }
       
        if (true) {
            String checkupDate = new String();
            myExceptions verify = new myExceptions();
            String F_name = null, L_name = null, Fa_name = null;

            String fullname = new String();
            String scanner = new String();
             System.out.println("loging successfuly");*/
             Employees.setEmp_type("Doctor");/*
             System.out.println(" Add new Pharmacist data");
             System.out.println("<--------------------->" + "\n\n");
             System.out.print("username :" + "\n\n");
             recep.setUsername(scan.next());
             System.out.print("password :" + "\n\n");
             recep.setPassword(scan.next());
             
             result = 0;
             while (result != -1) {
             System.out.println("Enter a Patient First Name : ");
                
             F_name = scan.nextLine();
                
                
             valid = verify.IsStrValid(F_name);
             if (!valid.equals("accepted") ) {
             System.out.println("\n\n"+valid);
             } else {
             result = -1;
             recep.setFname(F_name);
             }
             }
             result = 0;
             while (result != -1) {
             System.out.println("Enter a Patient Last Name : ");
                
             L_name = scan.nextLine();
             valid = verify.IsStrValid(L_name);
             if (!valid.equals("accepted")) {
             System.out.println("\n\n" +valid);
             } else {
             result = -1;
             recep.setLname(L_name);
             }
             }
             result = 0;
             while (result != -1) {
             System.out.println("Enter a Patient Family  Name :");
               
             Fa_name = scan.nextLine();
             valid = verify.IsStrValid(Fa_name);
             if (!valid.equals("accepted")) {
             System.out.println("\n\n"+valid);
             } else {
             result = -1;
             recep.setFaname(Fa_name);
             }
             }

            

            

             idNumber = hosp_System.generateUId("Doctor");
             recep.setId(idNumber);
             result = 0;
             while (result != -1) {

             System.out.println("Enter Age : ");
                
             scanner = scan.nextLine();
             try {
             valid = verify.IsAgeValid(Integer.parseInt(scanner));
             if (!valid.equals("accepted")) {
             System.out.println(""+valid);
             } else {
             result = -1;
             }
             } catch (Exception e) {
             System.out.println("\n\nError entering Age .(it must be only integer number)\n\n");

             }

             }

            recep.setAge(Integer.parseInt(scanner));
             result = 0;
             while (result != -1) {
             System.out.println("Enter  Address : ");
                
             scanner = scan.nextLine();
             valid = verify.IsAddressValid(scanner);
             if (!valid.equals("accepted")) {
             System.out.println("\n\nError "+valid);
             } else {
             result = -1;
             }

             }
             recep.setAddress(scanner);
             result = 0;
             while (result != -1) {
             System.out.println("Enter phone : ");
                
             scanner = scan.nextLine();
             valid  = verify.IsValidPhone(scanner);
             if (!valid.equals("accepted")) {
             System.out.println("\n\nError"+valid);
             } else {
             result = -1;
             }
             }
             recep.setPhone(scanner);
             result = 0;
             while (result != -1) {
             System.out.println("Gender : ");
                
             scanner = scan.nextLine();
             valid = verify.IsStrValid(scanner);
             if (!valid.equals("accepted")) {
             System.out.println("\n\nError entering Gender.(it must be male or female)\n\n"+valid);
             } else if (scanner.equals("male") || scanner.equals("female")) {

             result = -1;
             } else {
             System.out.println("\n\nError entering Gender.(it must be male or female)\n\n");
             }

             }
             recep.setGender(scanner);
             Employees.writeLogInData(recep.getUsername(),recep.getPassword());
             admin.addData(recep);
             recep.SaveAllData();*/
         //  recep = (Receptionist)admin.Search(200);
             
           //  
             
            
           // System.out.println("ID :"+ recep.getId()+"\t name :"+recep.getFname());
           
              
             
             
             
             /*
             result = 0;
             while (result != -1) {
             System.out.print("height : ");
                
             scanner = scan.nextLine();
             try {
             valid = verify.IsHieghtValid(Float.parseFloat(scanner));
             if (!valid.equals("accepted")) {
             System.out.println("\n\nError "+valid);
             } else {
             result = -1;
             }
             } catch (Exception e) {
             System.out.println("\n\nError entering hieght.(it must be only integer number)\n\n");
             }

             }
             access.setHeight(Integer.parseInt(scanner));
             result = 0;
             while (result != -1) {
             System.out.print("weight : ");
                
             scanner = scan.nextLine();
             try {
             valid = verify.IsWieghtValid(Float.parseFloat(scanner));
             if (!valid.equals("accepted")) {
             System.out.println("\n\nError "+valid);
             } else {
             result = -1;
             }
             } catch (Exception e) {
             System.out.println("\n\nError entering weight.(it must be only integer numbers)\n\n");
             }

             }
             access.setWeight(Float.parseFloat(scanner));
             result = 0;
             while (result != -1) {
             System.out.print("Case : ");
                
             scanner = scan.nextLine();
             valid = verify.IsStrValid(scanner);
             if (!valid.equals("accepted")) {
             System.out.print("\n\nError "+valid);
             } else {
             result = -1;
             }
             }
             access.setCase(scanner);
             result = 0;
             while (result != -1) {
             System.out.print("Health problems : ");
                
             scanner = scan.nextLine();
             if (!verify.IsHealthProblemsValid(scanner)) {
             System.out.print("\n\nThis Health problem Not Supported try again\n\n");
             } else {
             result = -1;
             }
             }
             access.setHealth_problems(scanner);
             //  doc.prescribMedicine(scanner, writer);
             //// access.setNeeded_medications(writer.getRecipt_content());
             {
             //access.setPhysician(recep.Get_Physician(scanner));
             }
             result = 0;
             System.out.println("Checkup Date must be in this format dd/mm/yyyy");
             while (result != -1) {

             System.out.print("Checkup Date : ");
             scanner = scan.next();
             if (verify.isValidDate(scanner) == 1 || verify.isValidDate(scanner) == 2) {
             checkupDate = scanner;
             result = -1;
             } else if (verify.isValidDate(scanner) == 3) {
             result = -1;
             } else {
             System.out.println("Invalid Date\n");
             }
             }
             access.setCheckup_date(scanner);
             System.out.print("Checkup Time : ");
             scanner = scan.next();
             access.setTime(scanner);
           
             if (room.Check_availability(access.getHealth_problems())) {
             // access.setRoom_number(recep.Book_room(room, access.getHealth_problems()));
             Date Start_stay = new Date();
             SimpleDateFormat cdf = new SimpleDateFormat("dd/MM/yyyy");
             access.setStart_booking(cdf.format(Start_stay));
             //access.setRoom_number(d.room.getRoomNumber());
             } else {
             System.out.println("no available room for  patient");
             }
             recep.addData(access);
             System.out.println("please remember your ID Number : " + access.getId());
             System.out.println("\t\t\t" + "Data added successfuly .");
             System.out.println("\t\t\t" + "^*********************^" + "\n\n");*/
           
            
         /*   System.out.println("Enter a Patient First Name : ");

            F_name = scan.nextLine();
            System.out.println("Enter a Patient Last Name : ");

            L_name = scan.nextLine();
            
            System.out.println("Enter a Patient Family  Name :");
               
             Fa_name = scan.nextLine();
             ArrayList<Bill> b= new ArrayList<Bill>(); 
           b =  accountant.viewAllBills("20/12/2015");
           if(!b.isEmpty()){
            for(Bill bil : b){
            System.out.println(bil.toString(""));
            }
            }*/
            /* Map<String,Integer> x = new HashMap<>();
             for(int i = 0 ;i<3;i++){
                 agz = new Pharmacy();
                 System.out.print("enter medicineName : ");
                 agz.setMedicineName(scan.next());
                 System.out.print("enter quantity : ");
                 agz.setQuantity(scan.nextInt());
                 x.put(agz.getMedicineName(),agz.getQuantity() );  
           
             }
             System.out.println("first call : "+sayd.PrepareMedicine(x));*/
             
            
           
            
           /*  Clinic clin=new Clinic();
             
             
               System.out.println("please insert the specialization of the clinic");
              String input=scan.next();
              clin=recep.Reserve_clinic_appointment(clin, input);
               System.out.println("patient ID="+clin.getId()+"\t"+"Appointment="+clin.getAvailable_appointment());*/
             
             

             

        

       // access.SaveAllData();
        //Archive.SaveArchivedData("ok");
       // agz.SaveAllData();
           //r.SaveAllData();

    }

   

    static int receptionistMenu() {
        int choice = -2;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n0. Exit the Application.");
        System.out.println("1. Add new patient data. ");
        System.out.println("2. Edit a patient data.");
        System.out.println("3. Display a patient data.");
        System.out.println("4. Remove a patient data.");
        System.out.println("5. Resreve Appointment at Clinic.");
        System.out.println("6. Search for a patient.");
        System.out.println("7. Generate a Bill for patient.");
        System.out.println();
        System.out.print("Enter a choice: ");
        try {
            choice = input.nextInt();
        } catch (InputMismatchException e) {

        }

        return choice;

    }

}
