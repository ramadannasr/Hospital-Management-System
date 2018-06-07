package GUI;

import fcih_hospital.Employees;
import java.awt.event.ActionEvent;

public class MenuDoctor extends ManageASUD {

    public MenuDoctor(String s) {
        super(s);
        Employees.setEmp_type("Doctor");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == AddButton) {
            this.setVisible(false);
            new DoctorFrame("Adding New Doctor").setVisible(true);
        } else if (e.getSource() == SearchButton) {
            this.setVisible(false);
                new SearchingDoctorFrame("Searching For Doctor").setVisible(true);
        }
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new Administration("Main Menu Admin Panal ").setVisible(true);
        } else {
        }
    }
}
