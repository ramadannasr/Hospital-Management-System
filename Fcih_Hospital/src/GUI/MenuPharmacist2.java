package GUI;


import GUI.MenuPharmacist;
import GUI.PharmacyFrame;
import static GUI.PharmacyFrame.CustomerNameLabel;
import GUI.SearchingPharmacyFrame;
import fcih_hospital.Pharmacy;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author ahmedsayed
 */
public class MenuPharmacist2 extends ManageASUD{
    JButton BuyButton;
   //  JButton XButton;
 public MenuPharmacist2(String s) {
        super(s);
      
        
        this.AddButton = new JButton("Adding !");
        add(AddButton);
        AddButton.addActionListener(this);

        this.SearchButton = new JButton("Searching !");
        add(SearchButton);
        SearchButton.addActionListener(this);

        this.BackButton = new JButton("Back !");
        add(BackButton);
        BackButton.addActionListener(this);
        
        
        BuyButton=new JButton("Buy!");
        add(BuyButton);
        BuyButton.addActionListener(this);
        
        this.loggedUser = new JLabel("User :  ");
        add(loggedUser);
        loggedUser.setVisible(true);

        //this.loggedUserName = new JLabel(LoginGUI.logedPerson.getFName() +" "+ LoginGUI.logedPerson.getLName() );
        //add(loggedUserName);
        //loggedUserName.setVisible(true);

       this.AddButton.setBounds(TitleLable.getBounds().x+50, TitleLable.getBounds().y + 160, 170, 70);
        SearchButton.setBounds(TitleLable.getBounds().x + 300, TitleLable.getBounds().y + 160, 170, 70);
        BuyButton.setBounds(TitleLable.getBounds().x+50, TitleLable.getBounds().y + 330, 170, 70);
        BackButton.setBounds(TitleLable.getBounds().x + 300, TitleLable.getBounds().y + 330, 170, 70);
        
        loggedUser.setBounds(TitleLable.getBounds().x + 400, TitleLable.getBounds().y, 150, 40);
       // loggedUserName.setBounds(TitleLable.getBounds().x + 440, TitleLable.getBounds().y, 150, 40);
    }      

    public  void actionPerformed(ActionEvent e){
    if (e.getSource() == BackButton) {
            this.setVisible(false);
            new MenuPharmacist("Pharmacist").setVisible(true);
    }
     if (e.getSource() == AddButton) {
            this.setVisible(false);
            PharmacyFrame x=new PharmacyFrame("Medicine");
            x.setVisible(true);
            PharmacyFrame.CustomerNameLabel.setVisible(false);
            x.CustomerNameText.setVisible(false);
            x.SubmitButton.setText("Add");
            x.resetButton.setText("Reset");
           
            
    }
     if (e.getSource() == SearchButton) {
            this.setVisible(false);
            SearchingPharmacyFrame x=new SearchingPharmacyFrame("Medicine");
            x.setVisible(true);
    }
     if (e.getActionCommand().equals("Buy!")){
     PharmacyFrame x=new PharmacyFrame("Buy Medicine");
     Pharmacy y=new Pharmacy();
     x.CustomerNameLabel.setVisible(false);
     x.CustomerNameText.setVisible(false);
     x.dateOfProductionLabel.setVisible(false);
     x.dateOfProductionText.setVisible(false);
     x.ExpirationDateLabel.setVisible(false);
     x.ExpirationDateText.setVisible(false);
     x.Medic_IdLabel.setVisible(false);
     x.Medic_IdText.setVisible(false);
     x.MedicineChoice.setBounds(CustomerNameLabel.getBounds().x + 100, CustomerNameLabel.getBounds().y+ 40, TW, TH);
     x.medicineNameText.setVisible(false);
     
     ArrayList<String> Arr=new ArrayList();
     Arr=(ArrayList<String>)y.GetMedicineNames();
     for(int i=0;i<Arr.size();i++){
     x.MedicineChoice.addItem(Arr.get(i));
     }
     x.SubmitButton.setText("Reset");
     
       
     x.resetButton.setText("Buy");
     //x.resetButton.setVisible(false);
     
     x.setVisible(true);
     
     }
}
}