package GUI;


import fcih_hospital.Employees;
import fcih_hospital.ExeptionHandling;
import fcih_hospital.Nursing;
import fcih_hospital.hosp_System;
import fcih_hospital.myExceptions;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class NursingFrame extends Employee {

    public JLabel Nursing_shiftLabel;

   static public JComboBox Nursing_shiftCombo;
   
   public JLabel DeptLabel;

    public static JComboBox DeptCombo;
    
    Nursing nurse;

    public NursingFrame(String s) {
         super(s);
         nurse =  new Nursing();
         Employees.setEmp_type("Nurse");
         IdText.setText(hosp_System.generateUId("Nurse")+"");
        IdText.setEditable(false);
        this.Nursing_shiftLabel = new JLabel("Nursing Shift. ");
       add(Nursing_shiftLabel);
        Nursing_shiftCombo = new JComboBox();
        Nursing_shiftCombo.addItem("8 Hours");
        Nursing_shiftCombo.addItem("12 Hours");
       Nursing_shiftCombo.setSelectedItem("8 Hours");
       add(Nursing_shiftCombo);
        this.DeptLabel = new JLabel("Dept. ");
        add(DeptLabel);
         DeptCombo = new JComboBox();
        DeptCombo.addItem("OrthopedicAndFractures");
        DeptCombo.addItem("InternalDiseases");
        DeptCombo.addItem("Surgery");
        DeptCombo.addItem("Neurology");
        DeptCombo.addItem("Opthalmolog");
        DeptCombo.addItem("Gynecology");
        DeptCombo.setSelectedItem("Surgery");
        add(DeptCombo);
        DeptLabel.setBounds(UsernameLabel.getBounds().x, UsernameLabel.getBounds().y + 160, LW, LH);
        DeptCombo.setBounds(UsernameLabel.getBounds().x+100, UsernameLabel.getBounds().y + 160, LW, LH);
        Nursing_shiftLabel.setBounds(UsernameLabel.getBounds().x, UsernameLabel.getBounds().y + 230, LW, LH);
        Nursing_shiftCombo.setBounds(UsernameLabel.getBounds().x+100, UsernameLabel.getBounds().y + 230, LW, LH);
    }

    @Override
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
        nurse.setGender("Male");
    }
    else if(female.isSelected())
    {
        nurse.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
             Employees.writeLogInData(UsernameText.getText(), PasswordText.getText());
        nurse.setFname(FnameText.getText()); nurse.setLname(LameText.getText()); nurse.setFaname(FanameText.getText());
        nurse.setAge(Integer.parseInt(AgeText.getText())); nurse.setPhone(PhoneText.getText()); nurse.setAddress(AddressArea.getText());
        nurse.setUsername(UsernameText.getText()); nurse.setPassword(PasswordText.getText()); nurse.setSalary(Float.parseFloat(SalaryText.getText()));
        nurse.setDate_of_joining(Date_of_joiningText.getText()); nurse.setDept(DeptCombo.getSelectedItem().toString());nurse.setNursing_shift(Nursing_shiftCombo.getSelectedItem().toString());
        nurse.setId(hosp_System.generateUId("Nurse")); nurse.setSpecialization(DeptCombo.getSelectedItem().toString());
        admin.addData(nurse);
        fail.setVisible(false);
        sucess.setVisible(true);
        resetinfo();
        JOptionPane.showMessageDialog(null, "ID :"+nurse.getId()+"You Must Keep It Memorable");
         }
        
        }else{JOptionPane.showMessageDialog(null, "You Must Fill All Fiedls","Error", JOptionPane.ERROR_MESSAGE);
        
        }
 
            IdText.setText(hosp_System.generateUId("Nurse")+"");
            IdText.setEditable(false);
        }
         if (e.getActionCommand().equals("Update")){
             Employees.writeLogInData(UsernameText.getText(), PasswordText.getText());
        
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
        nurse.setGender("Male");
    }
    else if(female.isSelected())
    {
        nurse.setGender("Female");
    }
    else{
    JOptionPane.showMessageDialog(null, "You Must Select Gender ","Error", JOptionPane.ERROR_MESSAGE);
    if(x==-1)f = false;
    }
         if(f){
        nurse.setFname(FnameText.getText()); nurse.setLname(LameText.getText()); nurse.setFaname(FanameText.getText());
        nurse.setAge(Integer.parseInt(AgeText.getText())); nurse.setPhone(PhoneText.getText()); nurse.setAddress(AddressArea.getText());
        nurse.setUsername(UsernameText.getText()); nurse.setPassword(PasswordText.getText()); nurse.setSalary(Float.parseFloat(SalaryText.getText()));
        nurse.setDate_of_joining(Date_of_joiningText.getText()); nurse.setDept(DeptCombo.getSelectedItem().toString());
        nurse.setSpecialization(DeptCombo.getSelectedItem().toString());nurse.setId(Integer.parseInt(IdText.getText())); nurse.setNursing_shift(Nursing_shiftCombo.getSelectedItem().toString());
         admin.editData(nurse, Integer.parseInt(IdText.getText()));
         
            admin.addData(nurse);
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
            new MenuNursing("<<<Nursing>>>").setVisible(true);
        }
    }

    public static void view(Nursing x) {
        NursingFrame s = new NursingFrame("View Nurse Data");

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
        Nursing_shiftCombo.setSelectedItem(x.getNursing_shift());
        SubmitButton.setText("Update");
        resetButton.setText("Delete");

        s.setVisible(true);
    }
}
