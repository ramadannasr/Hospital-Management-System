package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.WindowListener;
public abstract class MYFrameTitle extends JFrame implements ActionListener{
    
    protected int LW = 100, LH = 30, TW = 200, TH = 30;

   public JLabel TitleLable;

    JLabel sucess;

    JLabel fail;

    String t="";

    public MYFrameTitle(String s) {
        super(s);
           t = s;
        setLocation(200, 50);
        setSize(1000, 800);

        this.TitleLable = new JLabel(t);
        add(TitleLable);
        this.sucess = new JLabel("Request Done successflly !!! ");
        add(sucess);
        sucess.setVisible(false);
        this.fail = new JLabel("Sorry, Invalid Request !!! ");
        add(fail);
        fail.setVisible(false);

        setLayout(null);
        TitleLable.setBounds(50, 10, 200, 40);

        sucess.setBounds(TitleLable.getBounds().x + 270, TitleLable.getBounds().y, 150, 40);
        fail.setBounds(TitleLable.getBounds().x + 270, TitleLable.getBounds().y, 150, 40);


        setBackground(Color.black);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener( new Closing());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
