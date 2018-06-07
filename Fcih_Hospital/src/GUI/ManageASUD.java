package GUI;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public abstract class ManageASUD extends MYFrameTitle {

    public JLabel loggedUser;
    
    public JLabel loggedUserName;
    
    public JButton AddButton;
    
    public JButton SearchButton;
    
    public JButton BackButton;
    
    public ManageASUD(String s) {
         super(s+" Manipolation");
        t= s;


        this.AddButton = new JButton("Adding++");
        add(AddButton);
        AddButton.addActionListener(this);

        this.SearchButton = new JButton("Searching##");
        add(SearchButton);
        SearchButton.addActionListener(this);

        this.BackButton = new JButton("Back !");
        add(BackButton);
        BackButton.addActionListener(this);
        this.loggedUser = new JLabel("User :  ");
        add(loggedUser);
        loggedUser.setVisible(true);

         this.loggedUserName = new JLabel(Login.logedPerson );
        add(loggedUserName);
        loggedUserName.setVisible(true);

        AddButton.setBounds(TitleLable.getBounds().x+50, TitleLable.getBounds().y + 160, 170, 70);
        SearchButton.setBounds(TitleLable.getBounds().x + 300, TitleLable.getBounds().y + 160, 170, 70);
        BackButton.setBounds(TitleLable.getBounds().x + 170, TitleLable.getBounds().y + 330, 150, 50);
        loggedUser.setBounds(TitleLable.getBounds().x + 400, TitleLable.getBounds().y, 150, 40);
        loggedUserName.setBounds(TitleLable.getBounds().x + 440, TitleLable.getBounds().y, 150, 40);
    }

    @Override
    public abstract void actionPerformed(ActionEvent e);
}
