package GUI;

import static GUI.Employee.Date_of_joiningText;
import static GUI.Employee.PasswordText;
import static GUI.Employee.SalaryText;
import static GUI.Employee.UsernameText;
import static GUI.MYFrame.SubmitButton;
import static GUI.MYFrame.resetButton;
import static GUI.Person.AddressArea;
import static GUI.Person.AgeText;
import static GUI.Person.FanameText;
import static GUI.Person.FnameText;
import static GUI.Person.IdText;
import static GUI.Person.LameText;
import static GUI.Person.PhoneText;
import static GUI.Person.female;
import static GUI.Person.male;
import fcih_hospital.Archive;
import fcih_hospital.Employees;
import fcih_hospital.ExeptionHandling;
import fcih_hospital.Pharmacist;
import fcih_hospital.hosp_System;
import fcih_hospital.myExceptions;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ArchiveEmployeesFrame extends Employee {

   fcih_hospital.Administration arch_emp;
    
    public ArchiveEmployeesFrame(String s) {
        super(s);
         arch_emp = new fcih_hospital.Administration();
          
           Employees.setEmp_type("Administrator");
        
        IdText.setText(hosp_System.generateUId("Administrator")+"");
        IdText.setEditable(false);
    }
    @Override
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
        arch_emp.setGender("Male");
    }
    else if(female.isSelected())
    {
        arch_emp.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
        arch_emp.setFname(FnameText.getText()); arch_emp.setLname(LameText.getText()); arch_emp.setFaname(FanameText.getText());
        arch_emp.setAge(Integer.parseInt(AgeText.getText())); arch_emp.setPhone(PhoneText.getText()); arch_emp.setAddress(AddressArea.getText());
        arch_emp.setUsername(UsernameText.getText()); arch_emp.setPassword(PasswordText.getText()); arch_emp.setSalary(Float.parseFloat(SalaryText.getText()));
        arch_emp.setDate_of_joining(Date_of_joiningText.getText()); 
        arch_emp.setId(hosp_System.generateUId("Administrator")); 
         new fcih_hospital.SuperAdmin().addData(arch_emp);
        fail.setVisible(false);
        sucess.setVisible(true);
        resetinfo();
        JOptionPane.showMessageDialog(null, "ID :"+arch_emp.getId()+"You Must Keep It Memorable");
         }
        
        }else{JOptionPane.showMessageDialog(null, "You Must Fill All Fiedls","Error", JOptionPane.ERROR_MESSAGE);
        
        }
 
            IdText.setText(hosp_System.generateUId("ArchiveEmployee")+"");
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
        arch_emp.setGender("Male");
    }
    else if(female.isSelected())
    {
        arch_emp.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
        arch_emp.setFname(FnameText.getText()); arch_emp.setLname(LameText.getText()); arch_emp.setFaname(FanameText.getText());
        arch_emp.setAge(Integer.parseInt(AgeText.getText())); arch_emp.setPhone(PhoneText.getText()); arch_emp.setAddress(AddressArea.getText());
        arch_emp.setUsername(UsernameText.getText()); arch_emp.setPassword(PasswordText.getText()); arch_emp.setSalary(Float.parseFloat(SalaryText.getText()));
        arch_emp.setDate_of_joining(Date_of_joiningText.getText()); 
        arch_emp.setId(Integer.parseInt(IdText.getText()));  
        admin.editData(arch_emp, Integer.parseInt(IdText.getText()));
        
            
        fail.setVisible(false);
        sucess.setVisible(true);
        resetinfo();}
       
         
        
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
            new MenuArchiveEmployee("<<<ArchiveEmployee>>>").setVisible(true);
        }
    
    
    }
     public static void view(Archive x) {
  ArchiveEmployeesFrame s = new ArchiveEmployeesFrame("View ArchiveEmployee Data");

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
