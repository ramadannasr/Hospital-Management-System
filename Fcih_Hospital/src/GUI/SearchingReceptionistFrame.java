package GUI;

import java.awt.event.ActionEvent;
import fcih_hospital.Administration;
import fcih_hospital.Receptionist;
import javax.swing.JOptionPane;

public class SearchingReceptionistFrame extends SearchingFrame {

    public SearchingReceptionistFrame(String s) {
        super(s);
    }

    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == SubmitButton) {
            if (!SearchKeyText.getText().equals("")) {
                Administration admin = new Administration();
                try{
                
               Receptionist x =  (Receptionist)admin.Search(Integer.parseInt(SearchKeyText.getText()));
                if (x != null) {
                    fail.setVisible(false);
                    sucess.setVisible(true);
                    this.setVisible(false);
                    ReceptionistFrame.view(x);
                   

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
            new MenuReceptionist1("<<<Receptionist>>>").setVisible(true);
        }
    }
}
