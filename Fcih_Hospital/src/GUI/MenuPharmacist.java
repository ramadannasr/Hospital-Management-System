package GUI;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import GUI.*;

public class MenuPharmacist extends MYFrameTitle {

    JButton medicineButton;

   public MenuPharmacist(String s) {
        super(s);
        this.medicineButton=new JButton("Medicine");
        add(medicineButton);
        medicineButton.addActionListener(this);
        TitleLable.setBounds(120, 90, 200, 40);
        medicineButton.setBounds(TitleLable.getBounds().x + 100, TitleLable.getBounds().y + 50, 150, 150);
    }
     public void actionPerformed(ActionEvent e){
     if(e.getSource()==medicineButton){
         this.setVisible(false);
         
         new MenuPharmacist2("Patient Medicine").setVisible(true);
         
        }
     }
}


