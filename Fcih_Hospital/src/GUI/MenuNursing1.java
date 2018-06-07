package GUI;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class MenuNursing1 extends MYFrameTitle {

    public JButton Patient;

    public MenuNursing1(String s) {
          super(s);
          Patient  = new JButton("Make report");
          add(Patient);
        Patient.addActionListener(this);
        
        Patient.setBounds(TitleLable.getBounds().x + 200, TitleLable.getBounds().y + 50, 150, 50);
    }
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==Patient)
    new SearchingPatientFrame("Searching For Patient").setVisible(true);
    
    }
}
