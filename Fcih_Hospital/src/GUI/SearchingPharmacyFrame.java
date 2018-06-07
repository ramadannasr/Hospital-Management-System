
package GUI;
import java.awt.event.ActionEvent;
import fcih_hospital.Pharmacist;
import fcih_hospital.Pharmacy;
import javax.swing.JOptionPane;
public class SearchingPharmacyFrame extends SearchingFrame {

    public SearchingPharmacyFrame(String s) {
        super(s);
    }

    public void actionPerformed(ActionEvent e) {
       
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new MenuPharmacist2("Patient Medicine").setVisible(true);
    }
        if (e.getSource() == resetButton) {
            fail.setVisible(false);
            sucess.setVisible(false);
            reset();
        }
        if(e.getSource() == SubmitButton){
        if (!SearchKeyText.getText().equals("")){
            Pharmacist p=new Pharmacist();
        try{
        Pharmacy ph=(Pharmacy)p.Search(Integer.parseInt(SearchKeyText.getText()));
         if (ph != null) {
          fail.setVisible(false);
          sucess.setVisible(true);
          this.setVisible(false);
           PharmacyFrame.view(ph);
         }
         else {
               JOptionPane.showMessageDialog(null, "ID Not Found", "Error", JOptionPane.ERROR_MESSAGE);}
        }
        catch(Exception E){
                
                 sucess.setVisible(false);
                 fail.setVisible(true);
                 JOptionPane.showMessageDialog(null, "Invalid ID It Must Be Only Integer Numbers", "Error", JOptionPane.ERROR_MESSAGE);
                }
        
        }
        else{
        JOptionPane.showMessageDialog(null, "You had Entered Nothing !\nTry Again ","Error", JOptionPane.ERROR_MESSAGE);}
         reset();
        }
}
}