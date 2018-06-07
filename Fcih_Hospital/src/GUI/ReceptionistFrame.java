package GUI;

import fcih_hospital.Employees;
import fcih_hospital.ExeptionHandling;
import fcih_hospital.Receptionist;
import fcih_hospital.hosp_System;
import fcih_hospital.myExceptions;
import java.awt.event.ActionEvent;
import fcih_hospital.Administration;
import javax.swing.JOptionPane;

public class ReceptionistFrame extends Employee {

    Receptionist recep;
    
    public ReceptionistFrame(String s) {
          super(s);
           recep= new Receptionist();
        Employees.setEmp_type("Receptionist");
        
        IdText.setText(hosp_System.generateUId("Receptionist")+"");
        IdText.setEditable(false);
    }

    public void  actionPerformed(ActionEvent e) {
         Administration admin = new Administration();
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
        recep.setGender("Male");
    }
    else if(female.isSelected())
    {
        recep.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
             Employees.writeLogInData(UsernameText.getText(), PasswordText.getText());
        recep.setFname(FnameText.getText()); recep.setLname(LameText.getText()); recep.setFaname(FanameText.getText());
        recep.setAge(Integer.parseInt(AgeText.getText())); recep.setPhone(PhoneText.getText()); recep.setAddress(AddressArea.getText());
        recep.setUsername(UsernameText.getText()); recep.setPassword(PasswordText.getText()); recep.setSalary(Float.parseFloat(SalaryText.getText()));
        recep.setDate_of_joining(Date_of_joiningText.getText());
        recep.setId(hosp_System.generateUId("Receptionist")); 
        admin.addData(recep);
        fail.setVisible(false);
        sucess.setVisible(true);
        resetinfo();
        JOptionPane.showMessageDialog(null, "ID :"+recep.getId()+"You Must Keep It Memorable");
         }
        
        }else{JOptionPane.showMessageDialog(null, "You Must Fill All Fiedls","Error", JOptionPane.ERROR_MESSAGE);
        
        }
 
            IdText.setText(hosp_System.generateUId("Receptionist")+"");
            IdText.setEditable(false);
        }
        if (e.getActionCommand().equals("Update")) {
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
        recep.setGender("Male");
    }
    else if(female.isSelected())
    {
        recep.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
             Employees.writeLogInData(UsernameText.getText(), PasswordText.getText());
        recep.setFname(FnameText.getText()); recep.setLname(LameText.getText()); recep.setFaname(FanameText.getText());
        recep.setAge(Integer.parseInt(AgeText.getText())); recep.setPhone(PhoneText.getText()); recep.setAddress(AddressArea.getText());
        recep.setUsername(UsernameText.getText()); recep.setPassword(PasswordText.getText()); recep.setSalary(Float.parseFloat(SalaryText.getText()));
        recep.setDate_of_joining(Date_of_joiningText.getText());
        recep.setId(Integer.parseInt(IdText.getText())); 
         admin.removeData(Integer.parseInt(IdText.getText()));
        
         admin.addData(recep);
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
            new MenuReceptionist1("****Receptionist****").setVisible(true);
        }
        
    }

    public static void view(Receptionist x) {
        ReceptionistFrame s=new ReceptionistFrame("View Receptionist Data");
        
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
