
package GUI;
import com.sun.net.httpserver.Authenticator;
import fcih_hospital.Bill;
import fcih_hospital.Cashier;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class generatebill extends SearchingFrame {
    JTextArea c = new JTextArea();
     public generatebill(String s) {
        super(s);
        c= new JTextArea();
        c.setSize(400, 500);
        add(c);
        c.setLocation(100,80 );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         Cashier l= new Cashier();
        if(e.getSource()==SubmitButton){
           
        if(!SearchKeyText.getText().equals("")){
           Bill x=new Bill();
                 x= l.generateBill(x,SearchKeyText.getText());
           if(x !=null){
                fail.setVisible(false);
                sucess.setVisible(true);
                c.setText(x.toString(SearchKeyText.getText()));
                 
           
           }
           else{
           fail.setVisible(true);
         sucess.setVisible(false);
                
           }
        
        }
        else{
        fail.setVisible(false);
        sucess.setVisible(true);
        }
     
        }
        else if(e.getSource()== BackButton){
        this.setVisible(false);
        new MenuCashier("").setVisible(true);
        }
        else if(e.getSource()==resetButton){
        this.setVisible(false);
        new generatebill("").setVisible(true);
        
        
        } 
    
    }
   
}
