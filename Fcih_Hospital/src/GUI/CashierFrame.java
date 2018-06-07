package GUI;


import fcih_hospital.Cashier;
import fcih_hospital.Employees;
import fcih_hospital.ExeptionHandling;

import fcih_hospital.hosp_System;
import fcih_hospital.myExceptions;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class CashierFrame extends Employee {

   fcih_hospital.Administration cash;
    public CashierFrame(String s) {
         super(s);
         cash  = new fcih_hospital.Administration();
          Employees.setEmp_type("Administrator");
        
        IdText.setText(hosp_System.generateUId("Administrator")+"");
        IdText.setEditable(false);
         
    }
      public void actionPerformed(ActionEvent e){
       fcih_hospital.Administration admin = new fcih_hospital.Administration();
        boolean f = true;
        int x= 0;
        String valid = new String();
        if (e.getActionCommand().equals("Submit")) {
        if(ExeptionHandling.checkEmpty(FnameText.getText(),LameText.getText(),FanameText.getText(),AgeText.getText(),PhoneText.getText(),AddressArea.getText(),UsernameText.getText(),PasswordText.getText(),SalaryText.getText(),Date_of_joiningText.getText())){
        valid = myExceptions.IsStrValid(FnameText.getText(),LameText.getText(),FanameText.getText());
        if(valid != null){JOptionPane.showMessageDialog(null, valid,"Error", JOptionPane.ERROR_MESSAGE);
        f = false;
        }
        else if(true){
         valid = myExceptions.IsAgeValid(AgeText.getText());
         if(valid != null){JOptionPane.showMessageDialog(null, valid,"Error", JOptionPane.ERROR_MESSAGE);
         f = false;
         }
         else if(true){
        valid = myExceptions.IsValidPhone(PhoneText.getText());
        if(valid != null){JOptionPane.showMessageDialog(null, valid,"Error", JOptionPane.ERROR_MESSAGE);
        f = false;
        }
        else if(true){
         x= ExeptionHandling.checkUsername(UsernameText.getText());
         if(x==-1)f = false;
         else if(true){
        x=ExeptionHandling.checkLength(PasswordText.getText());
        if(x==-1)f = false;
         else if(true){
         valid = ExeptionHandling.checkSalary(SalaryText.getText());
        if(valid != null){JOptionPane.showMessageDialog(null, valid,"Error", JOptionPane.ERROR_MESSAGE);
                f = false;
                }
         }
         }     
        }
       
        }
        
        }
        
       
         if(male.isSelected())
    {
        cash.setGender("Male");
    }
    else if(female.isSelected())
    {
        cash.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
             Employees.writeLogInData(UsernameText.getText(), PasswordText.getText());
        cash.setFname(FnameText.getText()); cash.setLname(LameText.getText()); cash.setFaname(FanameText.getText());
        cash.setAge(Integer.parseInt(AgeText.getText())); cash.setPhone(PhoneText.getText()); cash.setAddress(AddressArea.getText());
        cash.setUsername(UsernameText.getText()); cash.setPassword(PasswordText.getText()); cash.setSalary(Float.parseFloat(SalaryText.getText()));
       cash.setDate_of_joining(Date_of_joiningText.getText()); 
        cash.setId(hosp_System.generateUId("Administrator")); 
      new fcih_hospital.SuperAdmin().addData(cash);
        fail.setVisible(false);
        sucess.setVisible(true);
        resetinfo();
        JOptionPane.showMessageDialog(null, "ID :"+cash.getId()+"You Must Keep It Memorable");
         }
        
        }else{JOptionPane.showMessageDialog(null, "You Must Fill All Fiedls","Error", JOptionPane.ERROR_MESSAGE);
        
        }
 
            IdText.setText(hosp_System.generateUId("Administrator")+"");
            IdText.setEditable(false);
        }
        if (e.getActionCommand().equals("Update")){
        
        if(ExeptionHandling.checkEmpty(FnameText.getText(),LameText.getText(),FanameText.getText(),AgeText.getText(),PhoneText.getText(),AddressArea.getText(),UsernameText.getText(),PasswordText.getText(),SalaryText.getText(),Date_of_joiningText.getText())){
        valid = myExceptions.IsStrValid(FnameText.getText(),LameText.getText(),FanameText.getText());
        if(valid != null){JOptionPane.showMessageDialog(null, valid,"Error", JOptionPane.ERROR_MESSAGE);
        f = false;
        }
        else if(true){
         valid = myExceptions.IsAgeValid(AgeText.getText());
         if(valid != null){JOptionPane.showMessageDialog(null, valid,"Error", JOptionPane.ERROR_MESSAGE);
         f = false;
         }
         else if(true){
        valid = myExceptions.IsValidPhone(PhoneText.getText());
        if(valid != null){JOptionPane.showMessageDialog(null, valid,"Error", JOptionPane.ERROR_MESSAGE);
        f = false;
        }
        else if(true){
         x= ExeptionHandling.checkUsername(UsernameText.getText());
         if(x==-1)f = false;
         else if(true){
        x=ExeptionHandling.checkLength(PasswordText.getText());
        if(x==-1)f = false;
         else if(true){
         valid = ExeptionHandling.checkSalary(SalaryText.getText());
        if(valid != null){JOptionPane.showMessageDialog(null, valid,"Error", JOptionPane.ERROR_MESSAGE);
                f = false;
                }
         }
         }     
        }
       
        }
        
        }
        
       
         if(male.isSelected())
    {
        cash.setGender("Male");
    }
    else if(female.isSelected())
    {
        cash.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
             Employees.writeLogInData(UsernameText.getText(), PasswordText.getText());
        cash.setFname(FnameText.getText()); cash.setLname(LameText.getText()); cash.setFaname(FanameText.getText());
        cash.setAge(Integer.parseInt(AgeText.getText())); cash.setPhone(PhoneText.getText()); cash.setAddress(AddressArea.getText());
        cash.setUsername(UsernameText.getText()); cash.setPassword(PasswordText.getText()); cash.setSalary(Float.parseFloat(SalaryText.getText()));
        cash.setDate_of_joining(Date_of_joiningText.getText()); 
        cash.setId(Integer.parseInt(IdText.getText()));  
        admin.editData(cash,Integer.parseInt(IdText.getText()));
        
        fail.setVisible(false);
        sucess.setVisible(true);
        resetinfo();
       
         }
        
        }else{JOptionPane.showMessageDialog(null, "You Must Fill All Fiedls","Error", JOptionPane.ERROR_MESSAGE);
        
        }

            IdText.setEditable(false);
        
        }
        
    if (e.getActionCommand().equals("Delete")) {
            if (!IdText.getText().equals("")) {
                int q = JOptionPane.showConfirmDialog(rootPane, "Are You Sure ? ");
                if (q != 1) {
                    if (admin.removeData(Integer.parseInt(IdText.getText()))) {
                        fail.setVisible(false);
                        sucess.setVisible(true);
                        resetinfo();
                    } else {
                        sucess.setVisible(false);
                        fail.setVisible(true);
                    }

                }
            } 

        }
           if (e.getActionCommand().equals("reset")) {
            fail.setVisible(false);
            sucess.setVisible(false);
            resetinfo();
        }
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new MenuCashier1("<<<Cashier>>>").setVisible(true);
        }
    }

    public static void view(Cashier x) {
  CashierFrame s = new CashierFrame("View Cashier Data");

        FnameText.setText(x.getFname());
        LameText.setText(x.getLname());
        FanameText.setText(x.getFaname());
        IdText.setText(x.getId()+"");
        AgeText.setText(x.getAge()+"");
        PhoneText.setText(x.getPhone());
       if(x.getGender().equals("Male")){  
      male.setSelected(true);}
        else{
           female.setSelected(true);}
        AddressArea.setText(x.getAddress());
        SalaryText.setText(x.getSalary()+"");
        UsernameText.setText(x.getUsername());
        PasswordText.setText(x.getPassword());
        Date_of_joiningText.setText(x.getDate_of_joining());
        
        SubmitButton.setText("Update");
        resetButton.setText("Delete");

        s.setVisible(true);
    }
}
