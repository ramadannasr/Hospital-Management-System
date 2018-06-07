/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import fcih_hospital.Pharmacist;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import fcih_hospital.Pharmacy;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
//import static fcih_hospital.Pharmacy.Pharmacy_data;
/**
 *
 * @author ahmedsayed
 */
public class PharmacyFrame extends MYFrame{
    public static JLabel CustomerNameLabel;
    public JLabel  medicineNameLabel;
    public JLabel  dateOfProductionLabel;
    public JLabel  ExpirationDateLabel;
    public JLabel  QuantityLabel;
    public JLabel Medic_IdLabel;
  public  static JTextField CustomerNameText;
    static public JTextField medicineNameText;
    static public JTextField dateOfProductionText;
    static public JTextField ExpirationDateText;
    static public JTextField QuantityText;
    static public JTextField Medic_IdText;
   public JComboBox MedicineChoice = new JComboBox();
    // JButton XButton;
    
    public PharmacyFrame(String s) {
       super(s);
       
       
        this.CustomerNameLabel = new JLabel("Customer Name ");
        add(CustomerNameLabel);
        this.medicineNameLabel = new JLabel("Medicine Name ");
        add(medicineNameLabel);
        this.dateOfProductionLabel = new JLabel("Date Of Production");
        add(dateOfProductionLabel);
        this.ExpirationDateLabel = new JLabel("Expiration Date");
        add(ExpirationDateLabel);
        this.QuantityLabel = new JLabel("Quantity");
        add(QuantityLabel);
        this.Medic_IdLabel = new JLabel("Medicine ID");
        add(Medic_IdLabel);

        this.CustomerNameText = new JTextField("");
        add(CustomerNameText);
        this.medicineNameText = new JTextField("");
        add(medicineNameText);
        this.dateOfProductionText = new JTextField("");
        add(dateOfProductionText);
        this.ExpirationDateText = new JTextField("");
        add(ExpirationDateText);
        this.QuantityText = new JTextField("");
        add(QuantityText);
        this.Medic_IdText = new JTextField("");
        add(Medic_IdText);
        add(MedicineChoice);
        
         //XButton=new JButton("Buy");
        //add(XButton);
        //XButton.addActionListener(this);
        //XButton.setBounds(TitleLable.getBounds().x +10, TitleLable.getBounds().y + 440, 100, 40);
        
        CustomerNameLabel.setBounds(TitleLable.getBounds().x + 90, 80, LW, LH);
        medicineNameLabel.setBounds(CustomerNameLabel.getBounds().x, CustomerNameLabel.getBounds().y + 40, LW, LH);
        dateOfProductionLabel.setBounds(CustomerNameLabel.getBounds().x, CustomerNameLabel.getBounds().y + 80, LW, LH);
        ExpirationDateLabel.setBounds(CustomerNameLabel.getBounds().x, CustomerNameLabel.getBounds().y + 120, LW, LH);
        QuantityLabel.setBounds(CustomerNameLabel.getBounds().x, CustomerNameLabel.getBounds().y + 160, LW, LH);
        Medic_IdLabel.setBounds(CustomerNameLabel.getBounds().x, CustomerNameLabel.getBounds().y + 200, LW, LH);
        


        CustomerNameText.setBounds(CustomerNameLabel.getBounds().x + 100, CustomerNameLabel.getBounds().y, TW, TH);
        medicineNameText.setBounds(CustomerNameLabel.getBounds().x + 100, CustomerNameLabel.getBounds().y + 40, TW, TH);
        dateOfProductionText.setBounds(CustomerNameLabel.getBounds().x + 100, CustomerNameLabel.getBounds().y + 80, TW, TH);
        ExpirationDateText.setBounds(CustomerNameLabel.getBounds().x + 100, CustomerNameLabel.getBounds().y + 120, TW, TH);
        QuantityText.setBounds(CustomerNameLabel.getBounds().x + 100, CustomerNameLabel.getBounds().y + 160, TW, TH);
        Medic_IdText.setBounds(CustomerNameLabel.getBounds().x + 100,CustomerNameLabel.getBounds().y + 200, TW, TH);
        
        
        resetButton.setText("Delete");
        SubmitButton.setText("Update");
 
    // XButton=new JButton("Buy");
       // add(XButton);
        //XButton.addActionListener(this);
    }
    @SuppressWarnings("static-access")
    public  void  actionPerformed(ActionEvent e) {
            if (e.getSource() == BackButton) {
            this.setVisible(false);
            new MenuPharmacist2("Medicine").setVisible(true);}
            
            if (e.getActionCommand().equals("Add")) {
                
           if (!medicineNameText.getText().equals("") && !dateOfProductionText.getText().equals("") && !ExpirationDateText.getText().equals("") && !QuantityText.getText().equals("") && !Medic_IdText.getText().equals("")){
            Pharmacist ph1=new Pharmacist();
            Pharmacy ph =new Pharmacy();
            ph.setMedicineName(medicineNameText.getText());
            ph.setDateOfProduction(dateOfProductionText.getText());
            ph.setExpirationDate(ExpirationDateText.getText());
            ph.setQuantity(Integer.parseInt(QuantityText.getText()));
            ph.setMedic_Id(Integer.parseInt(Medic_IdText.getText()));
            ph1.addData(ph);
            fail.setVisible(false);
            sucess.setVisible(true);}
            else{
               JOptionPane.showMessageDialog(null, "You Must Fill All Fiedls","Error", JOptionPane.ERROR_MESSAGE);
             sucess.setVisible(false);
                fail.setVisible(true);
            }
                    
            }
            if (e.getActionCommand().equals("Reset")) {
            sucess.setVisible(false);
            fail.setVisible(false);
            resetPharmacy();
            }
            if (e.getActionCommand().equals("Update")) {
             //if (!medicineNameText.getText().equals("") && !dateOfProductionText.getText().equals("") && !ExpirationDateText.getText().equals("") && !QuantityText.getText().equals("") && !Medic_IdText.getText().equals("")){
             Pharmacist ph1=new Pharmacist();
            Pharmacy ph =new Pharmacy();
            ph.setMedicineName(medicineNameText.getText());
            ph.setDateOfProduction(dateOfProductionText.getText());
            ph.setExpirationDate(ExpirationDateText.getText());
            ph.setQuantity(Integer.parseInt(QuantityText.getText()));
            ph.setMedic_Id(Integer.parseInt(Medic_IdText.getText()));
            ph1.editData(ph,Integer.parseInt(Medic_IdText.getText()));
            fail.setVisible(false);
            sucess.setVisible(true);
            //}
            //else{
             //  JOptionPane.showMessageDialog(null, "You Can Not Update An Completed Medicine","Error", JOptionPane.ERROR_MESSAGE);
             //sucess.setVisible(false);
             //   fail.setVisible(true);
            //}
            }
            if (e.getActionCommand().equals("Delete")) {
            //if (!medicineNameText.getText().equals("") && !dateOfProductionText.getText().equals("") && !ExpirationDateText.getText().equals("") && !QuantityText.getText().equals("") && !Medic_IdText.getText().equals("")){
             Pharmacist ph1=new Pharmacist();
            Pharmacy ph =new Pharmacy();
            ph.setMedicineName(this.medicineNameText.getText());
            ph.setDateOfProduction(dateOfProductionText.getText());
            ph.setExpirationDate(ExpirationDateText.getText());
            ph.setQuantity(Integer.parseInt(QuantityText.getText()));
            ph.setMedic_Id(Integer.parseInt(Medic_IdText.getText()));
            ph1.removeData(Integer.parseInt(Medic_IdText.getText()));
            //ArrayList<Pharmacy> Arr=new ArrayList<Pharmacy>();
            //Arr=(ArrayList<Pharmacy>)(Object)ph1.readData();
            //Arr.remove(ph);
           
            fail.setVisible(false);
            sucess.setVisible(true);
            //}
            //else{
            //   JOptionPane.showMessageDialog(null, "You Can Not Delete An Completed Medicine","Error", JOptionPane.ERROR_MESSAGE);
            // sucess.setVisible(false);
            //    fail.setVisible(true);
            //}
            if (e.getActionCommand().equals("Buy")) {
                //PharmacyFrame pf =new PharmacyFrame("");
                Pharmacist p=new Pharmacist();
            if(!MedicineChoice.getSelectedItem().equals("")&&!QuantityText.getText().equals("")){
                String s=new String();
                Map<String,Integer> SetMedicine=new HashMap<String,Integer>();
            SetMedicine.put((MedicineChoice.getSelectedItem()+""),Integer.parseInt(QuantityText.getText()));
            s=p.PrepareMedicine(SetMedicine);
            if(s!=null){
            JOptionPane.showMessageDialog(null,s);
}else JOptionPane.showMessageDialog(null,"ahlan");
             sucess.setVisible(true);
             fail.setVisible(false);
            }
            else{
            JOptionPane.showMessageDialog(null, "You Must Fill Two Fiedls","Error", JOptionPane.ERROR_MESSAGE);
             sucess.setVisible(false);
             fail.setVisible(true);
            }
            }
            }
}
      public static void view(Pharmacy x) {
        PharmacyFrame p = new PharmacyFrame("View Medicine Data");
        CustomerNameText.setVisible(false);
        CustomerNameLabel.setVisible(false);
        medicineNameText.setText(x.getMedicineName());
        dateOfProductionText.setText(x.getDateOfProduction());
        ExpirationDateText.setText(x.getExpirationDate());
        QuantityText.setText(x.getQuantity()+"");
        Medic_IdText.setText(x.getMedic_Id()+"");
        p.setVisible(true);
  
    }
      public void resetPharmacy(){
      medicineNameText.setText("");
      dateOfProductionText.setText("");
      ExpirationDateText.setText("");
      QuantityText.setText("");
      Medic_IdText.setText("");
     }
}


