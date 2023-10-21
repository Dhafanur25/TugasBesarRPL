package swing;

import javax.swing.JTextArea;
import java.awt.Color;

public class InvisibleTextArea extends JTextArea {
    public InvisibleTextArea() {
        // Make the JTextArea transparent
        setOpaque(false);

        // Set the text color to be transparent
        setForeground(new Color(0, 0, 0, 0));
    }
}

