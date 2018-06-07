package GUI;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
public abstract class MYFrame extends MYFrameTitle {

    public JLabel loggedUser;

    public JLabel loggedUserName;

    public JButton BackButton;

    public static JButton SubmitButton;

    public  static JButton resetButton;

    public MYFrame(String s) {
        super(s);
         this.SubmitButton = new JButton("Submit");
        add(SubmitButton);
        SubmitButton.addActionListener(this);

        this.resetButton = new JButton("reset");
        add(resetButton);
        resetButton.addActionListener(this);

        this.BackButton = new JButton("Back");
        add(BackButton);
        BackButton.addActionListener(this);

        this.loggedUser = new JLabel("User :  ");
        add(loggedUser);
        loggedUser.setVisible(true);

        this.loggedUserName = new JLabel(Login.logedPerson );
        add(loggedUserName);
        loggedUserName.setVisible(true);

        SubmitButton.setBounds(TitleLable.getBounds().x + 260, TitleLable.getBounds().y + 440, 100, 40);
        resetButton.setBounds(TitleLable.getBounds().x + 410, TitleLable.getBounds().y + 440, 100, 40);
        BackButton.setBounds(TitleLable.getBounds().x + 570, TitleLable.getBounds().y + 440, 100, 40);
        loggedUser.setBounds(TitleLable.getBounds().x + 680, TitleLable.getBounds().y, 150, 40);
        loggedUserName.setBounds(TitleLable.getBounds().x + 750, TitleLable.getBounds().y, 150, 40);
    }

    public abstract void actionPerformed(ActionEvent e);
}
