package GUI;

import  fcih_hospital.Doctor;
import fcih_hospital.Receptionist;
import fcih_hospital.Nursing;
import fcih_hospital.Pharmacist;
import fcih_hospital.Archive;
import fcih_hospital.Cashier;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class  Administration extends MenuAdmin {
    
    private JButton Archive;

    private JButton Report;
    
    JLabel image;
    
     JPanel loun;

    public  Administration(String s) {
         super(s);
          this.Archive  = new JButton("*--Archive--*");
        Archive.setBackground(Color.MAGENTA);
        add(Archive );
        Archive .addActionListener(this);

        this.Report = new JButton("*--Report--*");
        Report.setBackground(Color.gray);
        add(Report);
        
        Report.addActionListener(this);
        loun = new JPanel();
        loun.setBounds(0, 0, 1300, 1200);
        image = new JLabel();
        
        Archive.setBounds(TitleLable.getBounds().x + 100, TitleLable.getBounds().y + 470, 150, 50);
        Report.setBounds(TitleLable.getBounds().x + 100, TitleLable.getBounds().y + 540, 150, 50);
    }
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == Doctor) {
            this.setVisible(false);
            new MenuDoctor("<<<Doctor>>>").setVisible(true);
             fcih_hospital.Doctor.loadAllData();
        } else if (e.getSource() == Receptionist) {
            this.setVisible(false);
            new MenuReceptionist1("<<<Receptionist>>>").setVisible(true);
            fcih_hospital.Receptionist.loadAllData();
    }
    else if (e.getSource() == Nursing) {
            this.setVisible(false);
            new MenuNursing("<<<Nursing>>>").setVisible(true);
            fcih_hospital.Nursing.loadAllData();
    }
         else if (e.getSource() == Pharmacist) {
            this.setVisible(false);
            new MenuPharmacist1("<<<Pharmacist>>>").setVisible(true);
            fcih_hospital.Pharmacist.loadAllData();
    }
         else if (e.getSource() == ArchiveEmployees) {
            this.setVisible(false);
            new MenuArchiveEmployee("<<<ArchEmploye>>>").setVisible(true);
            fcih_hospital.Archive.loadAllData();
    }
         else if (e.getSource() == Cashier) {
            this.setVisible(false);
            new MenuCashier1("<<<Cashier>>>").setVisible(true);
            fcih_hospital.Cashier.loadAllData();
    }
         else if (e.getSource() == Archive) {
            this.setVisible(false);
            new menuArchiveRoom("<<<Archive>>>").setVisible(true);
            
    }
          else if (e.getSource() == Report) {
              fcih_hospital.Doctor.loadAllData();
              
              
              double[] values = new double[6];
            String[] names = new String[6];
            names[0] = "OrthopedicAndFractures";
            names[1] = "InternalDiseases";
            names[2] = "Surgery";
            names[3] = "Neurology";
            names[4] = "Opthalmology";
            names[5] = "Gynecology";
            int i =0 ;
            values = fcih_hospital.Doctor.No_oF_Doctors();
            
            
           
            JFrame f = new JFrame();
            f.setLocation(250, 100);
            f.setSize(800, 650);
            

            f.getContentPane().add(new ChartPanel(values, names, "Statistics No of Doctors In Departments"));
            f.setVisible(true);
           
    }
    }
    
}
