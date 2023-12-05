import javax.swing.*;
import java.awt.*;

public class evaluator extends GUI {
    //min metod för att evaluera om svaren är rätt eller fel och ger argument
    public static void myMethod() {

        if (Integer.parseInt(text.getText())==svar) {
            label.setForeground(Color.green);
            validator.setText("Du fick rätt! Bra jobbat! Så här många gissningar tog det: " + gissningar);
        }
        else if (Integer.parseInt(text.getText()) < svar) {
            label.setForeground(Color.red);
            validator.setText("Ditt nummer är för lågt, gissa högre!");
            gissningar++;
        } else if (Integer.parseInt(text.getText()) > svar) {
            label.setForeground(Color.red);
            validator.setText("Ditt nummer är för högt, gissa lägre!");
            gissningar++;
        }

    }
}
