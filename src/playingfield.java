import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class playingfield extends GUI{
    public static JPanel game() {

        JPanel panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(new Dimension(50,50));
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 5));

        label= new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(100,100));
        label.setFont(new Font(("Times New Roman"), Font.PLAIN,100));

        validator = new JLabel();
        validator.setFont(new Font(("Times New Roman"), Font.PLAIN,20));

        panel.add(label);
        panel.add(validator,BorderLayout.NORTH);
        return panel;
    }
}
