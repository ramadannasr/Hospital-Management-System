package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MenuReceptionist extends MYFrameTitle {

    public JButton Patient;

    public JButton ReserveAppointment;
    
    public JButton PatientHWO;
    
    public JLabel Pname;
    
    public JLabel date;
    
    public JLabel doctor;
    

    public MenuReceptionist(String s) { 
          super(s);
          this.Patient = new JButton("<---Patient--->");
         Patient.setBackground(Color.CYAN);
        add(Patient);
        Patient.addActionListener(this);
        Pname = new JLabel("Patient");
        date = new JLabel("Date");
        doctor = new JLabel("Doctor");

        this.ReserveAppointment = new JButton("<---Reserve Clinic Appointment--->");
        ReserveAppointment.setBackground(Color.LIGHT_GRAY);
        add(ReserveAppointment);
        ReserveAppointment.addActionListener(this);
        
        this.PatientHWO = new JButton("<---PatientWHoCheckupDate Soon--->");
        PatientHWO.setBackground(Color.ORANGE);
        add(PatientHWO);
        PatientHWO.addActionListener(this);
        
        TitleLable.setBounds(120, 90, 200, 40);
        Patient.setBounds(TitleLable.getBounds().x + 200, TitleLable.getBounds().y + 50, 150, 50);
        ReserveAppointment.setBounds(TitleLable.getBounds().x + 200, TitleLable.getBounds().y + 120, 150, 50);
        PatientHWO.setBounds(TitleLable.getBounds().x + 200, TitleLable.getBounds().y + 190, 150, 50);
        
    }
     public static void main(String[] args) throws IOException, ClassNotFoundException {
        //new LoginGUI("Welcome to FCIH").setVisible(true);
        new MenuReceptionist("PatientFrame>>>").setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
    
     if (e.getSource() == Patient) {
            this.setVisible(false);
            new MenuPatient("<<<Patient>>>").setVisible(true);{
      fcih_hospital.Patient.loadAllData();
      
     }
            
        } else if (e.getSource() == ReserveAppointment) {
            this.setVisible(false);
            new ClinicFrame("<<<Reserve Clinic Appointment>>>").setVisible(true);
           
    }
     else if (e.getSource() == PatientHWO) {
            this.setVisible(false);
            JFrame f = new JFrame();
            f.setLocation(200, 50);
            f.setSize(1000, 800);;
            f.setLayout(new BorderLayout());
            Pname.setBounds(TitleLable.getBounds().x + 160, TitleLable.getBounds().y + 140, 100, 40);
            date.setBounds(TitleLable.getBounds().x + 200, TitleLable.getBounds().y + 140, 100, 40);
            doctor.setBounds(TitleLable.getBounds().x + 240, TitleLable.getBounds().y + 140, 100, 40);
            f.getContentPane().add(Pname);
            f.getContentPane().add(date);
            f.getContentPane().add(doctor);
            f.setVisible(true);
           
    }
    }
    
}
