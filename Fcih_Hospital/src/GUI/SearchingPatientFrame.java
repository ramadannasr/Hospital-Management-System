package GUI;

import static GUI.MYFrame.SubmitButton;
import static GUI.MYFrame.resetButton;
import fcih_hospital.Patient;

import fcih_hospital.Receptionist;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class SearchingPatientFrame extends SearchingFrame {

    Patient p ;
    public SearchingPatientFrame(String s) {
        super(s);
        p = new Patient();
    }

    public void actionPerformed(ActionEvent e) {
           if (e.getSource() == SubmitButton) {
            if (!SearchKeyText.getText().equals("")) {
                Receptionist x = new Receptionist ();
              
                
                try{
                
                p =  (Patient)x.Search(Integer.parseInt(SearchKeyText.getText()));
                if (p != null) {
                    fail.setVisible(false);
                    sucess.setVisible(true);
                    this.setVisible(false);
                    System.out.println("IDDD : "+p.getId());
                    
                    PatientFrame.view(p);
                   

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
            new MenuReceptionist("<<<Receptionist>>>").setVisible(true);
        }
    }
}
