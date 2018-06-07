package GUI;

import fcih_hospital.Bill;
import fcih_hospital.Cashier;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

public class BillFrame extends MYFrame {

    private JLabel BillNoLabel;

    private JLabel PatientFullNameLabel;

    private JLabel AmountLabel;

    private JLabel LengthOfStayLabel;

    private JLabel StartDateLabel;

    private JLabel EndDateLabel;

    private JTextField BillNoText;

    private JTextField PatientFullNameText;

    private JTextField AmountText;

    private JTextField LengthOfStayText;

    private JTextField StartDateText;

    private JTextField EndDateText;
   
    public BillFrame(String s) {
        super(s);
        
         BillNoLabel=new JLabel("bILLnumber");
         add( BillNoLabel);
           BillNoLabel.setBounds(120, 50, 150,30);
           PatientFullNameLabel=new JLabel("fullname");
         add(PatientFullNameLabel);
           PatientFullNameLabel.setBounds(120, 90, 150,30);
           AmountLabel=new JLabel("amount");
         add(AmountLabel);
           AmountLabel.setBounds(120, 130, 150,30);
             LengthOfStayLabel=new JLabel("no of days");
         add(LengthOfStayLabel);
           LengthOfStayLabel.setBounds(120, 170, 150,30);
                StartDateLabel=new JLabel("start day");
         add( StartDateLabel);
            StartDateLabel.setBounds(120, 210, 150,30);
             EndDateLabel =new JLabel("end day");
         add( EndDateLabel);
           EndDateLabel.setBounds(120, 250, 150,30);
             BillNoText =new JTextField("");
         add(  BillNoText);
            BillNoText.setBounds(200,50, 150,30);
                PatientFullNameText =new JTextField("");
         add( PatientFullNameText);
             PatientFullNameText.setBounds(200,90, 150,30);
               AmountText =new JTextField("");
         add(AmountText);
            AmountText.setBounds(200,130, 150,30);
              LengthOfStayText =new JTextField("");
         add(LengthOfStayText);
            LengthOfStayText.setBounds(200,170, 150,30);
            StartDateText =new JTextField("");
         add(  StartDateText);
            StartDateText.setBounds(200,210, 150,30);
               EndDateText =new JTextField("");
         add(EndDateText);
            EndDateText.setBounds(200,250, 150,30);
            
    }

    public void actionPerformed(ActionEvent e) {
        Cashier c= new Cashier();
      if(e.getActionCommand().equals("Submit")){
          if(! BillNoText.getText().equals("")&&!PatientFullNameText.getText().equals("")&&!AmountText.getText().equals("")&&!LengthOfStayText.getText().equals("")&&!StartDateText.getText().equals("")&&! EndDateText.getText().equals(""))
          {      
     
      
      fail.setVisible(false);
      sucess.setVisible(true);
          }
          else{
          fail.setVisible(true);
          sucess.setVisible(false);
          
          }
         
        }
      else if(e.getSource()==BackButton){
      this.setVisible(false);
      new  MenuCashier("").setVisible(true);
      }
      else if(e.getSource()==resetButton){
      this.setVisible(false);
      new generatebill("").setVisible(true);
      }
    }
}
