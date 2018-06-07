package GUI;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import fcih_hospital.Doctor;
import fcih_hospital.Administration;
import fcih_hospital.ExeptionHandling;
import fcih_hospital.myExceptions;
import fcih_hospital.Employees;
import fcih_hospital.hosp_System;
import javax.swing.JOptionPane;
public class DoctorFrame extends Employee {

    public JLabel DeptLabel;

    public static JComboBox DeptCombo;
    Doctor doc;
    public DoctorFrame(String s) {
        super(s);
         doc = new Doctor();
        Employees.setEmp_type("Doctor");
        
        IdText.setText(hosp_System.generateUId("Doctor")+"");
        IdText.setEditable(false);
        this.DeptLabel = new JLabel("Dept. ");
        add(DeptLabel);
         DeptCombo = new JComboBox();
        DeptCombo.addItem("OrthopedicAndFractures");
        DeptCombo.addItem("InternalDiseases");
        DeptCombo.addItem("Surgery");
        DeptCombo.addItem("Neurology");
        DeptCombo.addItem("Opthalmology");
        DeptCombo.addItem("Gynecology");
        DeptCombo.setSelectedItem("Surgery");
        add(DeptCombo);
        DeptLabel.setBounds(UsernameLabel.getBounds().x, UsernameLabel.getBounds().y + 160, LW, LH);
        DeptCombo.setBounds(UsernameLabel.getBounds().x+100, UsernameLabel.getBounds().y + 160, LW, LH);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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
        doc.setGender("Male");
    }
    else if(female.isSelected())
    {
        doc.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
             Employees.writeLogInData(UsernameText.getText(), PasswordText.getText());
        doc.setFname(FnameText.getText()); doc.setLname(LameText.getText()); doc.setFaname(FanameText.getText());
        doc.setAge(Integer.parseInt(AgeText.getText())); doc.setPhone(PhoneText.getText()); doc.setAddress(AddressArea.getText());
        doc.setUsername(UsernameText.getText()); doc.setPassword(PasswordText.getText()); doc.setSalary(Float.parseFloat(SalaryText.getText()));
        doc.setDate_of_joining(Date_of_joiningText.getText()); doc.setDept(DeptCombo.getSelectedItem().toString());
        doc.setId(hosp_System.generateUId("Doctor")); doc.setSpecialization(DeptCombo.getSelectedItem().toString());
        admin.addData(doc);
        fail.setVisible(false);
        sucess.setVisible(true);
        resetinfo();
        JOptionPane.showMessageDialog(null, "ID :"+doc.getId()+"You Must Keep It Memorable");
         }
        
        }else{JOptionPane.showMessageDialog(null, "You Must Fill All Fiedls","Error", JOptionPane.ERROR_MESSAGE);
        
        }
 
            IdText.setText(hosp_System.generateUId("Doctor")+"");
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
        doc.setGender("Male");
    }
    else if(female.isSelected())
    {
        doc.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
             Employees.writeLogInData(UsernameText.getText(), PasswordText.getText());
        doc.setFname(FnameText.getText()); doc.setLname(LameText.getText()); doc.setFaname(FanameText.getText());
        doc.setAge(Integer.parseInt(AgeText.getText())); doc.setPhone(PhoneText.getText()); doc.setAddress(AddressArea.getText());
        doc.setUsername(UsernameText.getText()); doc.setPassword(PasswordText.getText()); doc.setSalary(Float.parseFloat(SalaryText.getText()));
        doc.setDate_of_joining(Date_of_joiningText.getText()); doc.setDept(DeptCombo.getSelectedItem().toString());
        doc.setId(Integer.parseInt(IdText.getText()));  doc.setSpecialization(DeptCombo.getSelectedItem().toString());
         admin.editData(doc, Integer.parseInt(IdText.getText()));
        fail.setVisible(false);
        sucess.setVisible(true);
        resetinfo();
        if(f){ 
           }
       
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
            if(male.isSelected()||female.isSelected()){
            male.setSelected(false);
            female.setSelected(false);}
        }
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new MenuDoctor("****Doctor****").setVisible(true);
        }
    }

    public static void view(Doctor x) {
  DoctorFrame s = new DoctorFrame("View Doctor Data");

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
        DeptCombo.setSelectedItem(x.getDept());
        SubmitButton.setText("Update");
        resetButton.setText("Delete");

        s.setVisible(true);
    }
}
