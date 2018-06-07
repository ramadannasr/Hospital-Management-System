/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import fcih_hospital.Employees;
import java.awt.event.ActionEvent;

/**
 *
 * @author romyo
 */
public class MenuCashier1 extends ManageASUD{
     public MenuCashier1(String s) {
        super(s);
        Employees.setEmp_type("Cashier");   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == AddButton) {
            this.setVisible(false);
            new CashierFrame("Adding New Cashier").setVisible(true);
        } else if (e.getSource() == SearchButton) {
            this.setVisible(false);
                new SearchingCashierFrame("Searching For Cashier").setVisible(true);
        }
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new Administration("Main Menu Admin Panal ").setVisible(true);
        } else {
        }
    }
    
}
