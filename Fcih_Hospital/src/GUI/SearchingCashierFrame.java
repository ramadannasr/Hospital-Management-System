package GUI;

import static GUI.MYFrame.SubmitButton;
import static GUI.MYFrame.resetButton;
import fcih_hospital.Cashier;
import fcih_hospital.Pharmacist;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class SearchingCashierFrame extends SearchingFrame {

    public SearchingCashierFrame(String s) {
        super(s);
    }

    public void actionPerformed(ActionEvent e) {
        fail.setVisible(false);
            if (e.getSource() == SubmitButton) {
            if (!SearchKeyText.getText().equals("")) {
                fcih_hospital.Administration admin = new fcih_hospital.Administration();
                try{
                
               Cashier x =  (Cashier)admin.Search(Integer.parseInt(SearchKeyText.getText()));
                if (x != null) {
                    fail.setVisible(false);
                    sucess.setVisible(true);
                    this.setVisible(false);
                    CashierFrame.view(x);
                   

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
            new MenuCashier1("<<<Cashier>>>").setVisible(true);
        }
    }
}
