import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class GUI {
    public static Random guess;
    public static int gissningar = 1;
    public static JLabel label, validator;
    public static JButton button,button2;
    public static JTextField text;
    public  static final int MAX = 100;
    public static int svar;

    GUI() {
        JFrame frame = new JFrame("The Guessing Game");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(head(), BorderLayout.NORTH);
        frame.add(playingfield.game(), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public JPanel head() {
        guess = new Random();

        //svar är det nummer vi vill gissa oss fram till som är det slumpmässiga talet
        //svar = (int) Math.round(Math.random()*100);
        svar = guess.nextInt(MAX + 1);


        JPanel panel = new JPanel(new FlowLayout());
        JLabel header = new JLabel("Gissa ett nummer mellan 0-100: ");


        text = new JTextField();
        text.setPreferredSize(new Dimension(50, 20));

        button = new JButton("submit");
        button.addActionListener(new ButtonListener());

        button2 = new JButton("change number");
        button2.addActionListener(new ButtonListener());

        panel.add(header);
        panel.add(text);
        panel.add(button);
        panel.add(button2);


        return panel;
    }


    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton press = (JButton) e.getSource();

            if (press.equals(button)) {
                label.setText(text.getText());
                System.out.println(svar);
                evaluator.myMethod();
            }

             if (press.equals(button2)){
                newrandom();
                gissningar = 1;
            }

        }
    }

    private void newrandom(){
        guess = new Random();
        svar = guess.nextInt(MAX + 1);

    }
}

