package GUI;

import fcih_hospital.Employees;
import java.awt.event.ActionEvent;

public class MenuReceptionist1 extends ManageASUD {

    public MenuReceptionist1(String s) {
        super(s);
         Employees.setEmp_type("Receptionist");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == AddButton) {
            this.setVisible(false);
            new ReceptionistFrame("Adding New Receptionist").setVisible(true);
        } else if (e.getSource() == SearchButton) {
            this.setVisible(false);
                new SearchingReceptionistFrame("Searching For Receptionist").setVisible(true);
        }
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new Administration("Main Menu Admin Panal ").setVisible(true);
        } else {
        }
    }
}
