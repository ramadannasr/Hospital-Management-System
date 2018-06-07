package GUI;

//import fcih_hospital.Person;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class  Employee extends Person {

    public JLabel SalaryLabel;

    public JLabel UsernameLabel;

    public JLabel PasswordLabel;
    
    public JLabel Date_of_joiningLabel;

    public static JTextField SalaryText;

    public static JTextField UsernameText;

    public static JTextField PasswordText;
    
    public  static JTextField Date_of_joiningText;

    public Employee(String s) {
         super(s);
         
        this.UsernameLabel = new JLabel("Username");
        add(UsernameLabel);
        this.PasswordLabel = new JLabel("Password");
        add(PasswordLabel);
        this.SalaryLabel = new JLabel("Salary");
        add(SalaryLabel);
        this.Date_of_joiningLabel = new JLabel("Date  Of Joining");
        add(Date_of_joiningLabel);

      
        this.UsernameText = new JTextField("");
        add(UsernameText);
        this.PasswordText = new JTextField("");
        add(PasswordText);
        this.SalaryText = new JTextField("");
        add(SalaryText);
        this.Date_of_joiningText = new JTextField("");
        add(Date_of_joiningText);
        
        
        UsernameLabel.setBounds(TitleLable.getBounds().x + 500, 80, LW, LH);
        PasswordLabel.setBounds(UsernameLabel.getBounds().x, UsernameLabel.getBounds().y + 40, LW, LH);     
        SalaryLabel.setBounds(UsernameLabel.getBounds().x, UsernameLabel.getBounds().y + 80, LW, LH);
        Date_of_joiningLabel.setBounds(UsernameLabel.getBounds().x, UsernameLabel.getBounds().y + 120, LW, LH);
        
        UsernameText.setBounds(UsernameLabel.getBounds().x + 100, UsernameLabel.getBounds().y, TW, TH);
        PasswordText.setBounds(UsernameLabel.getBounds().x + 100, UsernameLabel.getBounds().y+40, TW, TH);
        SalaryText.setBounds(UsernameLabel.getBounds().x + 100, UsernameLabel.getBounds().y+80, TW, TH);
        Date_of_joiningText.setBounds(UsernameLabel.getBounds().x + 100, UsernameLabel.getBounds().y+120, TW, TH);
    }

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     protected void resetinfo() {
        reset();
        SalaryText.setText("");
        UsernameText.setText("");
        PasswordText.setText("");
        Date_of_joiningText.setText("");
         if(male.isSelected()||female.isSelected()){
            male.setSelected(false);
            female.setSelected(false);}
    }
}
