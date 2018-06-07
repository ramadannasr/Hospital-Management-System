package GUI;


import fcih_hospital.Employees;
import fcih_hospital.ExeptionHandling;
import fcih_hospital.Pharmacist;
import fcih_hospital.hosp_System;
import fcih_hospital.myExceptions;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class PharmacistFrame extends Employee {

    Pharmacist pharm;
    public PharmacistFrame(String s) {
          super(s);
          pharm = new Pharmacist();
          
           Employees.setEmp_type("Pharmacist");
        
        IdText.setText(hosp_System.generateUId("Pharmacist")+"");
        IdText.setEditable(false);
          
    }
    public void actionPerformed(ActionEvent e) {
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
        pharm.setGender("Male");
    }
    else if(female.isSelected())
    {
        pharm.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
             Employees.writeLogInData(UsernameText.getText(), PasswordText.getText());
        pharm.setFname(FnameText.getText()); pharm.setLname(LameText.getText()); pharm.setFaname(FanameText.getText());
        pharm.setAge(Integer.parseInt(AgeText.getText())); pharm.setPhone(PhoneText.getText()); pharm.setAddress(AddressArea.getText());
        pharm.setUsername(UsernameText.getText()); pharm.setPassword(PasswordText.getText()); pharm.setSalary(Float.parseFloat(SalaryText.getText()));
        pharm.setDate_of_joining(Date_of_joiningText.getText()); 
        pharm.setId(hosp_System.generateUId("Pharmacist")); 
        admin.addData(pharm);
        fail.setVisible(false);
        sucess.setVisible(true);
        resetinfo();
        JOptionPane.showMessageDialog(null, "ID :"+pharm.getId()+"You Must Keep It Memorable");
         }
        
        }else{JOptionPane.showMessageDialog(null, "You Must Fill All Fiedls","Error", JOptionPane.ERROR_MESSAGE);
        
        }
 
            IdText.setText(hosp_System.generateUId("Pharmacist")+"");
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
        pharm.setGender("Male");
    }
    else if(female.isSelected())
    {
        pharm.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
             Employees.writeLogInData(UsernameText.getText(), PasswordText.getText());
        pharm.setFname(FnameText.getText()); pharm.setLname(LameText.getText()); pharm.setFaname(FanameText.getText());
        pharm.setAge(Integer.parseInt(AgeText.getText())); pharm.setPhone(PhoneText.getText()); pharm.setAddress(AddressArea.getText());
        pharm.setUsername(UsernameText.getText()); pharm.setPassword(PasswordText.getText()); pharm.setSalary(Float.parseFloat(SalaryText.getText()));
        pharm.setDate_of_joining(Date_of_joiningText.getText()); 
        pharm.setId(Integer.parseInt(IdText.getText()));  
         admin.editData(pharm, Integer.parseInt(IdText.getText()));
         
            admin.addData(pharm);
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
            new MenuPharmacist1("<<<Pharmacist>>>").setVisible(true);
        }
    }

    public static void view(Pharmacist x) {
  PharmacistFrame s = new PharmacistFrame("View Pharmacist Data");

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

