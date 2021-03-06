package GUI;

import fcih_hospital.Archive;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class SearchingArchiveFrame extends SearchingFrame {

    public SearchingArchiveFrame(String s) {
        super(s);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         fail.setVisible(false);
            if (e.getSource() == SubmitButton) {
            if (!SearchKeyText.getText().equals("")) {
                fcih_hospital.Administration admin = new fcih_hospital.Administration();
                try{
                
               Archive x =  (Archive)admin.Search(Integer.parseInt(SearchKeyText.getText()));
                if (x != null) {
                    fail.setVisible(false);
                    sucess.setVisible(true);
                    this.setVisible(false);
                    ArchiveEmployeesFrame.view(x);
                   

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
            new MenuArchiveEmployee("<<<ArchiveEmployee>>>").setVisible(true);
        }
    }
}
