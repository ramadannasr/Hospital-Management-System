package GUI;

import java.awt.event.ActionEvent;

public class MenuPatient extends ManageASUD {

    public MenuPatient(String s) {
         super(s);
    }

    public void  actionPerformed(ActionEvent e) {
         if (e.getSource() == AddButton) {
            this.setVisible(false);
            new PatientFrame("Adding New Patient").setVisible(true);
        } else if (e.getSource() == SearchButton) {
            this.setVisible(false);
                new SearchingPatientFrame("Searching For Patient").setVisible(true);
        }
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new MenuReceptionist("Main Menu Receptionist Panal ").setVisible(true);
        } else {
        }
    }
}
