package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class SearchingFrame extends MYFrame {

    public JLabel SearchKeyLable;

    public JTextField SearchKeyText;

    public SearchingFrame(String s) {
        super(s);
        this.SearchKeyLable = new JLabel("Enter Search Key ");
        add(SearchKeyLable);

        this.SearchKeyText = new JTextField("");
        SearchKeyText.setBackground(java.awt.Color.cyan);
        add(SearchKeyText);

        SearchKeyLable.setBounds(TitleLable.getBounds().x + 190, 200, LW + 5, LH);
        SearchKeyText.setBounds(SearchKeyLable.getBounds().x + 210, SearchKeyLable.getBounds().y, TW, TH);
    }

    public abstract void actionPerformed(ActionEvent e);

    protected void reset() {
         SearchKeyText.setText("");
    }
}
