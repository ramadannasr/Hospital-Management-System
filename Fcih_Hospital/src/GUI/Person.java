package GUI;

import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public abstract class Person extends MYFrame {

    public JLabel FnameLabel;

    public JLabel LameLabel;

    public JLabel FanameLabel;

    public JLabel IdLabel;

    public JLabel AgeLabel;

    public JLabel PhoneLabel;

    public JLabel GenderLabel;

   public JLabel AddressLabel;

  static  public JTextField FnameText;

  static public JTextField LameText;

  static  public JTextField FanameText;

  static  public JTextField IdText;

  static  public JTextField AgeText;

  static  public JTextField PhoneText;

  static  public JRadioButton male,female;
    
  static  public ButtonGroup gender;

  static  public JTextArea AddressArea;

    public Person(String s) {
         super(s);
        this.FnameLabel = new JLabel("First Name");
        add(FnameLabel);
        this.LameLabel = new JLabel("Last Name");
        add(LameLabel);
        this.FanameLabel = new JLabel("Family Name");
        add(FanameLabel);
        
        this.IdLabel = new JLabel("ID");
        add(IdLabel);
       
        this.AgeLabel = new JLabel("Age");
        add(AgeLabel);
        this.PhoneLabel = new JLabel("Phone");
        add(PhoneLabel);
        this.GenderLabel = new JLabel("Gender");
        add(GenderLabel);
        this.AddressLabel = new JLabel("Address");
        add(AddressLabel);

        this.FnameText = new JTextField("");
        add(FnameText);
        this.LameText = new JTextField("");
        add(LameText);
        this.FanameText = new JTextField("");
        add(FanameText);
        IdText = new JTextField("");
        add(IdText);
        this.AgeText = new JTextField("");
        add(AgeText);
        this.PhoneText = new JTextField("");
        add(PhoneText);
        male = new JRadioButton("Male");
        add(male);
        female = new JRadioButton("Female");
        add(female);
        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        AddressArea = new JTextArea("");
        add(AddressArea);

        FnameLabel.setBounds(TitleLable.getBounds().x + 90, 80, LW, LH);
        LameLabel.setBounds(FnameLabel.getBounds().x, FnameLabel.getBounds().y + 40, LW, LH);     
        FanameLabel.setBounds(FnameLabel.getBounds().x, FnameLabel.getBounds().y + 80, LW, LH);
        IdLabel.setBounds(FnameLabel.getBounds().x, FnameLabel.getBounds().y + 120, LW, LH);
        AgeLabel.setBounds(FnameLabel.getBounds().x, FnameLabel.getBounds().y + 160, LW, LH);
        PhoneLabel.setBounds(FnameLabel.getBounds().x, FnameLabel.getBounds().y + 200, LW, LH);
        GenderLabel.setBounds(FnameLabel.getBounds().x, FnameLabel.getBounds().y + 240, LW, LH);
        AddressLabel.setBounds(FnameLabel.getBounds().x, FnameLabel.getBounds().y + 280, LW, LH);
        
        FnameText.setBounds(FnameLabel.getBounds().x + 100, FnameLabel.getBounds().y, TW, TH);
        LameText.setBounds(FnameLabel.getBounds().x + 100, FnameLabel.getBounds().y + 40, TW, TH);
        FanameText.setBounds(FnameLabel.getBounds().x + 100, FnameLabel.getBounds().y + 80, TW, TH);
        IdText.setBounds(FnameLabel.getBounds().x + 100, FnameLabel.getBounds().y + 120, TW, TH);
        AgeText.setBounds(FnameLabel.getBounds().x + 100, FnameLabel.getBounds().y + 160, TW, TH);
        PhoneText.setBounds(FnameLabel.getBounds().x + 100, FnameLabel.getBounds().y + 200, TW, TH);
        male.setBounds(FnameLabel.getBounds().x + 100, FnameLabel.getBounds().y + 240, 80, TH);
        female.setBounds(FnameLabel.getBounds().x + 180, FnameLabel.getBounds().y + 240, 80, TH);
        AddressArea.setBounds(FnameLabel.getBounds().x + 100, FnameLabel.getBounds().y + 280, TW, TH);
    }

    public abstract void actionPerformed(ActionEvent e);
    
    protected void reset() {
        FnameText.setText("");
        LameText.setText("");
        FanameText.setText("");
        IdText.setText("");
        AgeText.setText("");
        PhoneText.setText("");
        AddressArea.setText("");
        
    }
}
