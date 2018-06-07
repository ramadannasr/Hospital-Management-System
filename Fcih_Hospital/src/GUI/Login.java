package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import fcih_hospital.Employees;
import fcih_hospital.ExeptionHandling;
import fcih_hospital.Person;
public class Login extends MYFrameTitle {

    public static String logedPerson = null ;
    
    public JLabel userLable;

    public JLabel passLable;

    public JTextField userText;

    public JPasswordField passText;

    public JButton loginButton;

    public JButton resetButton;
    
    JPanel loun;
    
    JLabel image;
    
    Person x;

    JLabel khat;
    public Login(String s) {
        super(s);
        
        
        this.TitleLable.setForeground(Color.WHITE);
        add(TitleLable);
         this.khat = new JLabel("*------------------------------------*");
       khat.setForeground(Color.WHITE);
        add(khat);
        this.userLable = new JLabel("User Name ");
        add(userLable);
        this.userLable.setForeground(Color.WHITE);
        this.userText = new JTextField("");
        this.userText.setBackground(Color.lightGray);
       
        add(userText);

        this.passLable = new JLabel("Password ");
        this.passLable.setForeground(Color.WHITE);
        add(passLable);
        this.passText = new JPasswordField("");
        passText.setBackground(Color.lightGray);
        add(passText);

        this.loginButton = new JButton("Sign in");
        add(loginButton);
        loginButton.addActionListener(this);

        this.resetButton = new JButton("Forget Password");
        add(resetButton);
        resetButton.addActionListener(this);
        
         loun = new JPanel();

        loun.setBounds(0, 0, 1300, 1200);
        image = new JLabel();
        image.setIcon(new ImageIcon("login.jpg"));
        image.setBounds(0, 0, 1000, 3400);
        loun.add(image);

        add(loun);

        //setLayout(new FlowLayout());
        setLayout(null);
        TitleLable.setBounds(50, 0, 400, 80);
        khat.setBounds(50, 10, 400, 80);
        userLable.setBounds(50, 180, 100, 30);
        passLable.setBounds(userLable.getBounds().x, userLable.getBounds().y + 60, 100, 30);

        userText.setBounds(userLable.getBounds().x + 100, userLable.getBounds().y, 200, 30);
        passText.setBounds(userLable.getBounds().x + 100, userLable.getBounds().y + 60, 200, 30);

        loginButton.setBounds(userLable.getBounds().x + 150, userLable.getBounds().y + 150, 100, 40);
        resetButton.setBounds(userLable.getBounds().x + 125, userLable.getBounds().y + 200, 150, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == loginButton){
            
            int i = 0 ;
            if(userText.getText().equals("")||passText.getText().equals(""))
           JOptionPane.showMessageDialog(null, "Invalid Request! \nYou Must Fill All Fields");
            else{
                do{i =ExeptionHandling.checkUsername(userText.getText());
                    if(i == 0)
                break;
                
                }while( i!=-1);
                do{i =ExeptionHandling.checkLength(passText.getText());
                    if(i == 0)
                break;
                
                }while( i!=-1);     
           x = Employees.LogIn(userText.getText(), passText.getText());
           System.out.println("GGGGGGGGGGGGGG"+x.getId());
           if(x.getId()>199 &&x.getId()<3000){
               System.out.println("RECEP ASDFFFF");
              new MenuReceptionist("<<<<Receptionist>>>>").setVisible(true);
           //receplogin
           }
           else if(x.getId()>2999 &&x.getId()<4000){
               new MenuDoctor1("<<<<Doctor>>>>").setVisible(true);
               //doctorlogni
            }
            else if (x.getId()>3999 &&x.getId()<10000){
                new Administration("<<<<Administrator>>>>").setVisible(true);
            //admin
            }
             else if (x.getId()>9999 &&x.getId()<20000){
            //superadmin
            }
           else if (x.getId()>19999 &&x.getId()<100000){
               new MenuCashier("<<<<Cashier>>>>").setVisible(true);
            //cashier
            }
           else if (x.getId()>99999 &&x.getId()<200000){
            //archieveemp
            }
           else if (x.getId()>199999 &&x.getId()<300000){
            //nurse
               new MenuNursing1("<<<<Pharamacist>>>>").setVisible(true);
            }
           else if (x.getId()>299999 &&x.getId()<400000){
            //pharmacist
            }
           this.setVisible(false);
            }
            
            
            
            
    logedPerson = x.getFname()+" "+x.getLname();
        }
        
    }
    }

