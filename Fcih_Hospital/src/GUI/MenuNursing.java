package GUI;

import fcih_hospital.Employees;
import java.awt.event.ActionEvent;

public class MenuNursing extends ManageASUD {

    public MenuNursing(String s) {
        super(s);
        Employees.setEmp_type("Nurse");
    }

    @Override
    public void  actionPerformed(ActionEvent e) {
         if (e.getSource() == AddButton) {
            this.setVisible(false);
            new NursingFrame("Adding New Nurse").setVisible(true);
        } else if (e.getSource() == SearchButton) {
            this.setVisible(false);
                new SearchingNursingFrame("Searching For Nurse").setVisible(true);
        }
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new Administration("Main Menu Admin Panal ").setVisible(true);
        } else {
        }
    }
}
