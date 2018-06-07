/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.MYFrame.SubmitButton;
import static GUI.MYFrame.resetButton;
import static GUI.menuArchiveRoom.EmpTypeCombo;
import Hospital.Clinic;
import fcih_hospital.Archive;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author romyo
 */
public class ClinicFrame extends SearchingFrame{

    public JLabel clinicTypeLabel;

    public static JComboBox clinicTypeCombo;
    
    Clinic x;
    public ClinicFrame(String s) {
        super(s);
        x= new Clinic();
        resetButton.setVisible(false);
        SearchKeyText.setVisible(false);
        SearchKeyLable.setVisible(false);
         this.clinicTypeLabel= new JLabel("Enter Clinic Specialization");
        add(clinicTypeLabel);
         clinicTypeCombo = new JComboBox();
        clinicTypeCombo.addItem("HeartClinic");
        clinicTypeCombo.addItem("DentistClinic");
        clinicTypeCombo.addItem("DermatologyClinic");
        clinicTypeCombo.addItem("EarAndNoseAndThroatClinic");
        clinicTypeCombo.addItem("GeneralSurgeryAndVascularClinic");
        clinicTypeCombo.addItem("ObstetricsAndGyneocologyClinic");
        clinicTypeCombo.addItem("InternalMedicineClinic");
        clinicTypeCombo.addItem("OrthopedicClinic");
        clinicTypeCombo.setSelectedItem("HeartClinic");
        clinicTypeCombo.setBackground(java.awt.Color.cyan);
        add(clinicTypeCombo);
        
        
        SearchKeyLable.setBounds(TitleLable.getBounds().x + 265, 200, LW + 5, LH);
        SearchKeyText.setBounds(TitleLable.getBounds().x + 470, SearchKeyLable.getBounds().y, TW, TH);
        clinicTypeLabel.setBounds(TitleLable.getBounds().x + 260, 300, LW + 30, LH);
        clinicTypeCombo.setBounds(TitleLable.getBounds().x + 470, clinicTypeLabel.getBounds().y , TW, LH);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        fail.setVisible(false);
            if (e.getSource() == SubmitButton) {
            
                fcih_hospital.Receptionist r= new fcih_hospital.Receptionist();
                try{
                
               x =  r.Reserve_clinic_appointment(x, clinicTypeCombo.getSelectedItem().toString());
                if (x != null) {
                    fail.setVisible(false);
                    sucess.setVisible(true);
                    this.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Your Appointment WILL be at "+x.getAvailable_appointment());
                   

                }
                else 
                    JOptionPane.showMessageDialog(null, " Sorry ! there is no avialable appointment", "Error", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception xe){
                
                 sucess.setVisible(false);
                 fail.setVisible(true);
                 JOptionPane.showMessageDialog(null, "Invalid ID It Must Be Only Integer Numbers", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
               

            
            reset();
        }
         
       
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new MenuReceptionist("<<<Receptionist>>>").setVisible(true);
        }
    }
    
    
}
