package GUI;

import static GUI.Person.IdText;
import Hospital.Rooms;
import fcih_hospital.Doctor;
import fcih_hospital.ExeptionHandling;
import fcih_hospital.Patient;
import fcih_hospital.Receptionist;
import fcih_hospital.Recipt;
import fcih_hospital.hosp_System;
import fcih_hospital.myExceptions;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PatientFrame extends Person {

    JLabel Health_problemsLabe;
    JLabel PhysicianLabel;
    JLabel Needed_medicationsLabel;
    JLabel Checkup_dateLabel;
    JLabel HeightLabel;
    JLabel WeightLabel;
    JLabel Room_numberLabel;
    JLabel TimeLabel;
    JLabel CaseLabel;
    JLabel Start_bookingLabel;
    JPanel p;

    static JComboBox Health_problemsText;
    static JTextField PhysicianText;
    static JTextField Needed_medicationsArea;
    static JTextField Checkup_dateText;
    static JTextField HeightText;
    static JTextField WeightText;
    static JTextField Room_numberText;
    static JTextField TimeText;
    static JTextField CaseText;
    static JTextField Start_bookingText;
    static JLabel pic;
    
    JButton btn;
    Patient pat;
    Receptionist recep;

    public PatientFrame(String s) {
        super(s);
        pat = new Patient();
        recep  = new Receptionist();
        
        IdText.setText(hosp_System.generateUId("Patient") + "");
        IdText.setEditable(false);
        btn = new JButton("Select Patient Photo");
        btn.addActionListener(this);
        this.Health_problemsLabe = new JLabel("Health Problems");
        add(Health_problemsLabe);
        this.PhysicianLabel = new JLabel("Physician");
        add(PhysicianLabel);
        this.Needed_medicationsLabel = new JLabel("Medications");
        add(Needed_medicationsLabel);
        this.Checkup_dateLabel = new JLabel("Checkup Date");
        add(Checkup_dateLabel);
        this.HeightLabel = new JLabel(" Height");
        add(HeightLabel);
        this.WeightLabel = new JLabel("Weight");
        add(WeightLabel);
        this.Room_numberLabel = new JLabel("Room Number");
        add(Room_numberLabel);
        this.TimeLabel = new JLabel("Time");
        add(TimeLabel);
        this.CaseLabel = new JLabel("Case");
        add(CaseLabel);
        this.Start_bookingLabel = new JLabel("Start Booking");
        add(Start_bookingLabel);
        pic = new JLabel("");
        

        add(pic);
        p = new JPanel();

        p.setSize(200, 230);

        pic.setSize(150, 180);

        p.add(pic);

        p.setBackground(Color.ORANGE);

        Health_problemsText = new JComboBox();
        Health_problemsText.addItem("BreakingBones");
        Health_problemsText.addItem("Gastrointestinalpain");
        Health_problemsText.addItem("SeriousInjury");
        Health_problemsText.addItem("NervousTension");
        Health_problemsText.addItem("EyePain");
        Health_problemsText.addItem("Pregnancy");
        Health_problemsText.setSelectedItem("BreakingBones");
        Health_problemsText.setBackground(Color.PINK);
        add(Health_problemsText);
        this.PhysicianText = new JTextField("");
        add(PhysicianText);
        Needed_medicationsArea = new JTextField("");
        add(Needed_medicationsArea);
        this.Checkup_dateText = new JTextField("");
        add(Checkup_dateText);
        this.HeightText = new JTextField("");
        add(HeightText);
        this.WeightText = new JTextField("");
        add(WeightText);
        this.Room_numberText = new JTextField("");
        add(Room_numberText);
        this.TimeText = new JTextField("");
        add(TimeText);
        this.CaseText = new JTextField("");
        add(CaseText);
        this.Start_bookingText = new JTextField("");
        add(Start_bookingText);
        add(btn);
        add(p);
        PhysicianText.setEditable(false);
        Room_numberText.setEditable(false);
        Start_bookingText.setEditable(false);
        Needed_medicationsArea.setEditable(false);
        Needed_medicationsArea.setVisible(false);
        Needed_medicationsLabel.setVisible(false);
        Date cdate = new Date();
                SimpleDateFormat cdf = new SimpleDateFormat("dd/MM/yyyy");
                String strDate = cdf.format(cdate);
                Start_bookingText.setText(strDate);

        Health_problemsLabe.setBounds(FnameLabel.getBounds().x + 350, FnameLabel.getBounds().y, LW, LH);
        PhysicianLabel.setBounds(Health_problemsLabe.getBounds().x, FnameLabel.getBounds().y + 40, LW, LH);

        Checkup_dateLabel.setBounds(FnameLabel.getBounds().x, FnameLabel.getBounds().y + 320, LW, LH);
        HeightLabel.setBounds(Health_problemsLabe.getBounds().x, FnameLabel.getBounds().y + 80, LW, LH);
        WeightLabel.setBounds(Health_problemsLabe.getBounds().x, FnameLabel.getBounds().y + 120, LW, LH);
        Room_numberLabel.setBounds(Health_problemsLabe.getBounds().x, FnameLabel.getBounds().y + 160, LW, LH);
        TimeLabel.setBounds(Health_problemsLabe.getBounds().x, FnameLabel.getBounds().y + 200, LW, LH);
        CaseLabel.setBounds(Health_problemsLabe.getBounds().x, FnameLabel.getBounds().y + 240, LW, LH);
        Start_bookingLabel.setBounds(FnameLabel.getBounds().x, FnameLabel.getBounds().y + 360, LW, LH);
        Needed_medicationsLabel.setBounds(Health_problemsLabe.getBounds().x, FnameLabel.getBounds().y + 280, LW, LH);

        Health_problemsText.setBounds(FnameLabel.getBounds().x + 450, FnameLabel.getBounds().y, LW + 100, LH);
        PhysicianText.setBounds(FnameLabel.getBounds().x + 450, FnameLabel.getBounds().y + 40, LW + 100, LH);

        Checkup_dateText.setBounds(FnameLabel.getBounds().x + 100, FnameLabel.getBounds().y + 320, LW + 100, LH);
        HeightText.setBounds(FnameLabel.getBounds().x + 450, FnameLabel.getBounds().y + 80, LW + 100, LH);
        WeightText.setBounds(FnameLabel.getBounds().x + 450, FnameLabel.getBounds().y + 120, LW + 100, LH);
        Room_numberText.setBounds(FnameLabel.getBounds().x + 450, FnameLabel.getBounds().y + 160, LW + 100, LH);
        TimeText.setBounds(FnameLabel.getBounds().x + 450, FnameLabel.getBounds().y + 200, LW + 100, LH);
        CaseText.setBounds(FnameLabel.getBounds().x + 450, FnameLabel.getBounds().y + 240, LW + 100, LH);
        Start_bookingText.setBounds(FnameLabel.getBounds().x + 100, FnameLabel.getBounds().y + 360, LW + 100, LH);
        Needed_medicationsArea.setBounds(FnameLabel.getBounds().x + 450, FnameLabel.getBounds().y + 280, LW + 100, LH);

        btn.setBounds(FnameLabel.getBounds().x + 670, FnameLabel.getBounds().y + 180, 150, 30);
        p.setBounds(FnameLabel.getBounds().x + 670, FnameLabel.getBounds().y, 150, 180);

        SubmitButton.setBounds(TitleLable.getBounds().x + 270, TitleLable.getBounds().y + 550, 100, 40);
        resetButton.setBounds(TitleLable.getBounds().x + 470, TitleLable.getBounds().y + 550, 100, 40);
        BackButton.setBounds(TitleLable.getBounds().x + 670, TitleLable.getBounds().y + 550, 100, 40);
    }

    public void actionPerformed(ActionEvent e) {

         
        boolean f = true;
        int x = 0;
        String valid = new String();
        if (e.getSource() == btn) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                pic.setIcon(new ImageIcon(selectedFile.getAbsolutePath()));
                pat.Image = fileChooser.getSelectedFile();
            }
        }
        if (e.getActionCommand().equals("Submit")) {
            if (ExeptionHandling.checkEmpty(FnameText.getText(), LameText.getText(), FanameText.getText(), AgeText.getText(), PhoneText.getText(), AddressArea.getText(), Checkup_dateText.getText(), HeightText.getText(), WeightText.getText(),IdText.getText()) || (!Start_bookingText.getText().equals("") && !TimeText.getText().equals("") && !CaseText.getText().equals(""))) {
                valid = myExceptions.IsStrValid(FnameText.getText(), LameText.getText(), FanameText.getText());
                if (valid != null) {
                    JOptionPane.showMessageDialog(null, valid, "Error", JOptionPane.ERROR_MESSAGE);
                    f = false;
                } else if (true) {
                    valid = myExceptions.IsAgeValid(AgeText.getText());
                    if (valid != null) {
                        JOptionPane.showMessageDialog(null, valid, "Error", JOptionPane.ERROR_MESSAGE);
                        f = false;
                    } else if (true) {
                        valid = myExceptions.IsValidPhone(PhoneText.getText());
                        if (valid != null) {
                            JOptionPane.showMessageDialog(null, valid, "Error", JOptionPane.ERROR_MESSAGE);
                            f = false;
                        } 
                        else if (true) {
                            x = myExceptions.isValidDate(Checkup_dateText.getText());
                            if (x == -1) {
                                f = false;
                                JOptionPane.showMessageDialog(null, "Invalid Date", "Error", JOptionPane.ERROR_MESSAGE);
                            } else if (true) {
                                valid = myExceptions.IsHieghtValid(HeightText.getText());
                                if (valid != null) {
                                    JOptionPane.showMessageDialog(null, valid, "Error", JOptionPane.ERROR_MESSAGE);
                                    
                                    f = false;
                                } else if (true) {
                                    valid = myExceptions.IsWieghtValid(WeightText.getText());
                                    if (valid != null) {
                                        JOptionPane.showMessageDialog(null, valid, "Error", JOptionPane.ERROR_MESSAGE);
                                        f = false;
                                    } else if (true) {
                                        valid = myExceptions.IsStrValid(CaseText.getText(), "as", "as");
                                        if (valid != null) {
                                            JOptionPane.showMessageDialog(null, "Error Case Must Be Only Characters Or It Contain Spaces", "Error", JOptionPane.ERROR_MESSAGE);
                                      f = false;
                                        }
                                    }
                                }

                            }
                        }

                    }

                }

                if (male.isSelected()) {
                    pat.setGender("Male");
                } else if (female.isSelected()) {
                    pat.setGender("Female");
                } else {
                    JOptionPane.showMessageDialog(null, "You Must Select Gender ", "Error", JOptionPane.ERROR_MESSAGE);
                    if (x == -1) {
                        f = false;
                    }
                }
                Doctor.loadAllData();
                Recipt.loadAllData();

                
                PhysicianText.setText(recep.Get_Physician(Health_problemsText.getSelectedItem().toString()));

                if (f) {

                    Rooms r = new Rooms();
                    int g = 0;

                    pat.setFname(FnameText.getText());
                    pat.setLname(LameText.getText());
                    pat.setFaname(FanameText.getText());
                    pat.setAge(Integer.parseInt(AgeText.getText()));
                    pat.setPhone(PhoneText.getText());
                    pat.setAddress(AddressArea.getText());
                    pat.setHealth_problems(Health_problemsText.getSelectedItem().toString());
                    pat.setPhysician(PhysicianText.getText());
                    pat.setCheckup_date(Checkup_dateText.getText());
                    pat.setHeight(Integer.parseInt(HeightText.getText()));
                    pat.setWeight(Integer.parseInt(WeightText.getText()));
                    pat.setTime(TimeText.getText());
                    pat.setCase(CaseText.getText());
                    pat.setStart_booking(Start_bookingText.getText());
                    try {
                        g = recep.Book_room(r, pat.getHealth_problems());
                    } catch (IOException ex) {
                        Logger.getLogger(PatientFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Room_numberText.setText("" + g);

                    pat.setRoom_number(g);
                    pat.setId(hosp_System.generateUId("Patient"));
                    recep.addData(pat);
                    fail.setVisible(false);
                    sucess.setVisible(true);
                    resetPInfo();
                    

                    JOptionPane.showMessageDialog(null, "ID :" + pat.getId() + "You Must Keep It Memorable");
                }

            } else {
                JOptionPane.showMessageDialog(null, "You Must Fill All Fiedls", "Error", JOptionPane.ERROR_MESSAGE);

            }

            IdText.setText(hosp_System.generateUId("Patient") + "");
            IdText.setEditable(false);
            Date cdate = new Date();
                SimpleDateFormat cdf = new SimpleDateFormat("dd/MM/yyyy");
                String strDate = cdf.format(cdate);
                Start_bookingText.setText(strDate);
        }
        if (e.getActionCommand().equals("Update")){
            
            String temp = null;
        temp = Health_problemsText.getSelectedItem().toString();
        if (ExeptionHandling.checkEmpty(FnameText.getText(), LameText.getText(), FanameText.getText(), AgeText.getText(), PhoneText.getText(), AddressArea.getText(), Checkup_dateText.getText(), HeightText.getText(), WeightText.getText(),IdText.getText()) || (!Start_bookingText.getText().equals("") && !TimeText.getText().equals("") && !CaseText.getText().equals(""))) {
                valid = myExceptions.IsStrValid(FnameText.getText(), LameText.getText(), FanameText.getText());
                if (valid != null) {
                    JOptionPane.showMessageDialog(null, valid, "Error", JOptionPane.ERROR_MESSAGE);
                    f = false;
                } else if (true) {
                    valid = myExceptions.IsAgeValid(AgeText.getText());
                    if (valid != null) {
                        JOptionPane.showMessageDialog(null, valid, "Error", JOptionPane.ERROR_MESSAGE);
                        f = false;
                    } else if (true) {
                        valid = myExceptions.IsValidPhone(PhoneText.getText());
                        if (valid != null) {
                            JOptionPane.showMessageDialog(null, valid, "Error", JOptionPane.ERROR_MESSAGE);
                            f = false;
                        } 
                        else if (true) {
                            x = myExceptions.isValidDate(Checkup_dateText.getText());
                            if (x == -1) {
                                f = false;
                                JOptionPane.showMessageDialog(null, "Invalid Date", "Error", JOptionPane.ERROR_MESSAGE);
                            } else if (true) {
                                valid = myExceptions.IsHieghtValid(HeightText.getText());
                                if (valid != null) {
                                    JOptionPane.showMessageDialog(null, valid, "Error", JOptionPane.ERROR_MESSAGE);
                                    
                                    f = false;
                                } else if (true) {
                                    valid = myExceptions.IsWieghtValid(WeightText.getText());
                                    if (valid != null) {
                                        JOptionPane.showMessageDialog(null, valid, "Error", JOptionPane.ERROR_MESSAGE);
                                        f = false;
                                    } else if (true) {
                                        valid = myExceptions.IsStrValid(CaseText.getText(), "as", "as");
                                        if (valid != null) {
                                            JOptionPane.showMessageDialog(null, "Error Case Must Be Only Characters Or It Contain Spaces", "Error", JOptionPane.ERROR_MESSAGE);
                                      f = false;
                                        }
                                    }
                                }

                            }
                        }

                    }

                }

                if (male.isSelected()) {
                    pat.setGender("Male");
                } else if (female.isSelected()) {
                    pat.setGender("Female");
                } else {
                    JOptionPane.showMessageDialog(null, "You Must Select Gender ", "Error", JOptionPane.ERROR_MESSAGE);
                    if (x == -1) {
                        f = false;
                    }
                }
                Doctor.loadAllData();
                Recipt.loadAllData();

                if(!temp.equals(Health_problemsText.getSelectedItem().toString()))
                PhysicianText.setText(recep.Get_Physician(Health_problemsText.getSelectedItem().toString()));

                if (f) {

                    Rooms r = new Rooms();
                    int g = 0;

                    pat.setFname(FnameText.getText());
                    pat.setLname(LameText.getText());
                    pat.setFaname(FanameText.getText());
                    pat.setAge(Integer.parseInt(AgeText.getText()));
                    pat.setPhone(PhoneText.getText());
                    pat.setAddress(AddressArea.getText());
                    pat.setHealth_problems(Health_problemsText.getSelectedItem().toString());
                    pat.setPhysician(PhysicianText.getText());
                    pat.setCheckup_date(Checkup_dateText.getText());
                    pat.setHeight(Integer.parseInt(HeightText.getText()));
                    pat.setWeight(Integer.parseInt(WeightText.getText()));
                    pat.setTime(TimeText.getText());
                    pat.setCase(CaseText.getText());
                    pat.setStart_booking(Start_bookingText.getText());
                    pat.setId(Integer.parseInt(IdText.getText()));
                    

                    pat.setRoom_number(Integer.parseInt(Room_numberText.getText()));
                    
                    recep.editData(pat, Integer.parseInt(IdText.getText()));
                    fail.setVisible(false);
                    sucess.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Data Updated Successfuly !!");
                    resetPInfo();
                    

                    
                }

            } else {
                JOptionPane.showMessageDialog(null, "You Must Fill All Fiedls", "Error", JOptionPane.ERROR_MESSAGE);

            }

           
            
           
        }
                 if (e.getActionCommand().equals("Delete")) {
            if (!IdText.getText().equals("")) {
                int q = JOptionPane.showConfirmDialog(rootPane, "Are You Sure ? ");
                if (q != 1) {
                    if (recep.removeData(Integer.parseInt(IdText.getText()))) {
                        fail.setVisible(false);
                        sucess.setVisible(true);
                        resetPInfo();
                    } else {
                        sucess.setVisible(false);
                        fail.setVisible(true);
                    }

                }
            } 

        }
           if (e.getActionCommand().equals("reset")) {
            fail.setVisible(false);
            sucess.setVisible(false);
            resetPInfo();
            if(male.isSelected()||female.isSelected()){
            male.setSelected(false);
            female.setSelected(false);}
        }
        if (e.getSource() == BackButton) {
            this.setVisible(false);
            new MenuReceptionist("<<<Receptionist>>>").setVisible(true);
        }

    }

    public static void view(Patient x) {
        PatientFrame p = new PatientFrame("View Patient Data");
        
        FnameText.setText(x.getFname());
        LameText.setText(x.getLname());
        FanameText.setText(x.getFaname());
        IdText.setText(x.getId() + "");
        AgeText.setText(x.getAge() + "");
        PhoneText.setText(x.getPhone());
        if (x.getGender().equals("Male")) {
            male.setSelected(true);
        } else {
            female.setSelected(true);
        }
        AddressArea.setText(x.getAddress());
        Health_problemsText.setSelectedItem(x.getHealth_problems());
        PhysicianText.setText(x.getPhysician());
        Needed_medicationsArea.setText(x.getNeeded_medications());
        Checkup_dateText.setText(x.getCheckup_date());
        HeightText.setText(x.getHeight() + "");
        WeightText.setText(x.getWeight() + "");
        Room_numberText.setText(x.getRoom_number() + "");
        TimeText.setText(x.getTime() + "");
        CaseText.setText(x.getCase());
        Start_bookingText.setText(x.getStart_booking());
        pic.setIcon(new ImageIcon(x.Image.getAbsolutePath()));
         SubmitButton.setText("Update");
        resetButton.setText("Delete");

        

        p.setVisible(true);

    }
    public  void resetPInfo(){
    
    reset();
    Health_problemsText.setSelectedItem(null);
                    PhysicianText.setText("");
                    pic.setIcon(null);
        Checkup_dateText.setText("");
        HeightText.setText("");
        WeightText.setText("");
        Room_numberText.setText("");
        TimeText.setText("");
        CaseText.setText("");
    }
}
