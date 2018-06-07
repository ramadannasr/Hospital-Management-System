package GUI;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JButton;

public abstract class MenuAdmin extends MYFrameTitle {

    public JButton Doctor;

    public JButton Nursing;

    public JButton Receptionist;

    public JButton ArchiveEmployees;
    
    public JButton Pharmacist;
    
    public JButton Cashier;
    
    
    public MenuAdmin(String s) {
        super(s);
         this.Doctor = new JButton("<---Doctor--->");
         Doctor.setBackground(Color.CYAN);
        add(Doctor);
        Doctor.addActionListener(this);

        this.Receptionist = new JButton("<---Receptionist--->");
        Receptionist.setBackground(Color.LIGHT_GRAY);
        add(Receptionist);
        Receptionist.addActionListener(this);

        this.Nursing = new JButton("<---Nursing--->");
        Nursing.setBackground(Color.green);
        add(Nursing);
        Nursing.addActionListener(this);

        this.Pharmacist = new JButton("<---Pharmacist--->");
        Pharmacist.setBackground(Color.orange);
        add(Pharmacist);
        Pharmacist.addActionListener(this);

        this.ArchiveEmployees = new JButton("<---ArchiveEmployees--->");
        ArchiveEmployees.setBackground(Color.pink);
        add(ArchiveEmployees);
        ArchiveEmployees.addActionListener(this);
        
         this.Cashier  = new JButton("<---Cashier--->");
         Cashier.setBackground(Color.red);
        add(Cashier );
        Cashier .addActionListener(this);

       

        TitleLable.setBounds(120, 90, 200, 40);
        Doctor.setBounds(TitleLable.getBounds().x + 100, TitleLable.getBounds().y + 50, 150, 50);
        Receptionist.setBounds(TitleLable.getBounds().x + 100, TitleLable.getBounds().y + 120, 150, 50);
        Nursing.setBounds(TitleLable.getBounds().x + 100, TitleLable.getBounds().y + 190, 150, 50);
        Pharmacist.setBounds(TitleLable.getBounds().x + 100, TitleLable.getBounds().y + 260, 150, 50);
        ArchiveEmployees.setBounds(TitleLable.getBounds().x + 100, TitleLable.getBounds().y + 330, 150, 50);
        Cashier.setBounds(TitleLable.getBounds().x + 100, TitleLable.getBounds().y + 400, 150, 50);
        
    }
     
    
}
