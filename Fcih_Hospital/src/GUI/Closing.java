package GUI;

import Hospital.Rooms;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import fcih_hospital.*;
public  class Closing implements WindowListener{

  


    public void windowClosing(WindowEvent e) {
         int c = JOptionPane.showConfirmDialog(null, "Are you Sure, System will Exit");
       if (c == JOptionPane.OK_OPTION) {
           if(!Doctor.flag) Doctor.SaveAllData();
           if(!Receptionist.flag)Receptionist.SaveAllData();
           if(!Nursing.flag)Nursing.SaveAllData();
           if(!Pharmacist.flag)Pharmacist.SaveAllData();
           if(!Archive.flag2)Archive.SaveAllData();
           if(!Cashier.flag)Cashier.SaveAllData();
           if(!Archive.flag1)Archive.SaveArchivedData();
           if(!Patient.flag)Patient.SaveAllData();
           if(!Rooms.flag)Rooms.SaveAllData();
           if(!Recipt.flag)Recipt.SaveAllData();
           if(fcih_hospital.Administration.flag)fcih_hospital.Administration.SaveAllData();
         System.exit(0); 
       }
    }

    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
