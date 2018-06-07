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
import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author romyo
 */
public class menuArchiveRoom extends SearchingFrame{
    public JLabel EmpTypeLabel;

    public static JComboBox EmpTypeCombo;
    
    
    
    public menuArchiveRoom(String s) {
        super(s);
       // Employees.setEmp_type("Cashier");
         this.EmpTypeLabel= new JLabel("Enter Employee Job");
        add(EmpTypeLabel);
         EmpTypeCombo = new JComboBox();
        EmpTypeCombo.addItem("Doctor");
        EmpTypeCombo.addItem("Nurse");
        EmpTypeCombo.addItem("Pharmacist");
        EmpTypeCombo.addItem("Receptionist");
        EmpTypeCombo.addItem("Cashier");
        EmpTypeCombo.addItem("ArchiveEmployee");
        EmpTypeCombo.addItem("Administrator");
        EmpTypeCombo.addItem("SuperAdministrator");
        EmpTypeCombo.setSelectedItem("Doctor");
        EmpTypeCombo.setBackground(java.awt.Color.cyan);
        add(EmpTypeCombo);
        
        
        SearchKeyLable.setBounds(TitleLable.getBounds().x + 265, 200, LW + 5, LH);
        SearchKeyText.setBounds(TitleLable.getBounds().x + 470, SearchKeyLable.getBounds().y, TW, TH);
        EmpTypeLabel.setBounds(TitleLable.getBounds().x + 260, 300, LW + 30, LH);
        EmpTypeCombo.setBounds(TitleLable.getBounds().x + 470, EmpTypeLabel.getBounds().y , TW, LH);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String type = null;
                 if (e.getSource() == SubmitButton) {
            if (!SearchKeyText.getText().equals("")) {
                type = EmpTypeCombo.getSelectedItem().toString();
                
                Archive.ReadArchivedData(type);
                
                
                try{
                
               Employees x =  (Employees)new Archive().Search(Integer.parseInt(SearchKeyText.getText()));
                if (x != null) {
                    fail.setVisible(false);
                    sucess.setVisible(true);
                    this.setVisible(false);
                    ArchiveFrame.view(x);
                   

                }
                else 
                    JOptionPane.showMessageDialog(null, "ID Not Found", "Error", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception xe){
                
                 sucess.setVisible(false);
                 fail.setVisible(true);
                 JOptionPane.showMessageDialog(null, "Invalid ID It Must Be Only Integer Numbers", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
               

            } else {
                JOptionPane.showMessageDialog(null, "You had Entered Nothing !\nTry Again ","Error", JOptionPane.ERROR_MESSAGE);
            }
            reset();
        }
         
          if (e.getSource() == resetButton) {
            fail.setVisible(false);
            sucess.setVisible(false);
            reset();
        }
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new Administration("Main Menu Admin Panal ").setVisible(true);
        }        
        }
   
    
     
    
}
