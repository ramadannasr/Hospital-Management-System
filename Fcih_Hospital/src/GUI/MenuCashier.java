package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class MenuCashier extends MYFrameTitle {

    JButton BackButton;

    JButton SubmitButton;

    JButton resetButton;

    public MenuCashier(String s) {
        super(s);
        resetButton = new JButton("viewBll");
        resetButton.addActionListener(this);
        add(resetButton);
        resetButton.setBounds(100, 200, 80, 30);
        SubmitButton = new JButton("addbill");
        SubmitButton.addActionListener(this);
        add(SubmitButton);
        SubmitButton.setBounds(200, 200, 100, 30);
        BackButton = new JButton("Back");
        add(BackButton);
        BackButton.setBounds(325, 200, 70, 30);
        BackButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SubmitButton) {
            this.setVisible(false);
            new BillFrame("add new payient bill").setVisible(true);

        } else if (e.getSource() == resetButton) {
            this.setVisible(false);
            new generatebill("view bill of patient").setVisible(true);

        } else if (e.getSource() == BackButton) {

            this.setVisible(false);
            new Login("back").setVisible(true);
        }
    }

    
}
