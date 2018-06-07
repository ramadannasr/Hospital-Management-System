/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import fcih_hospital.Employees;
import java.awt.event.ActionEvent;
public class MenuPharmacist1 extends ManageASUD{
    
    public MenuPharmacist1(String s) {
        super(s);
        Employees.setEmp_type("Pharmacist");   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == AddButton) {
            this.setVisible(false);
            new PharmacistFrame("Adding New Pharmacist").setVisible(true);
        } else if (e.getSource() == SearchButton) {
            this.setVisible(false);
                new SearchingPharmacistFrame("Searching For Pharmacist").setVisible(true);
        }
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new Administration("Main Menu Admin Panal ").setVisible(true);
        } else {
        }
    }
    
    
}
