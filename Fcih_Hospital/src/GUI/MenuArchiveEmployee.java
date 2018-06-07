package GUI;

import fcih_hospital.Employees;
import java.awt.event.ActionEvent;

public class MenuArchiveEmployee extends  ManageASUD{


    public MenuArchiveEmployee(String s) {
        super(s);
        Employees.setEmp_type("ArchiveEmployee");
    }
    @Override
     public void actionPerformed(ActionEvent e){
         if (e.getSource() == AddButton) {
            this.setVisible(false);
            new ArchiveEmployeesFrame("Adding New ArchiveEmployee").setVisible(true);
        } else if (e.getSource() == SearchButton) {
            this.setVisible(false);
                new SearchingArchiveFrame("Searching For ArchiveEmployee").setVisible(true);
        }
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new Administration("Main Menu Admin Panal ").setVisible(true);
        } else {
        }
     }
}
