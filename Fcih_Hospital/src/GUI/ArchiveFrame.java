/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import fcih_hospital.Employees;
import java.awt.event.ActionEvent;

/**
 *
 * @author romyo
 */
public class ArchiveFrame extends Employee{
    
    public ArchiveFrame(String s){
    
    super(s);
    IdText.setEditable(false);
    
    
    }
    @Override
     public void actionPerformed(ActionEvent e) {
     
     
     if (e.getSource() == BackButton) {
            this.setVisible(false);
            new menuArchiveRoom("Archive").setVisible(true);
        }
     }
      public static void view (Employees x){
        ArchiveFrame s = new ArchiveFrame("View Employee Data");
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
        resetButton.setVisible(false);
        SubmitButton.setVisible(false);
        s.setVisible(true);
    
    
    }
}
