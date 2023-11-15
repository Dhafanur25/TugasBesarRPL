package swing;

import javax.swing.JTextArea;
import java.awt.Color;

public class InvisibleTextArea extends JTextArea {
    public InvisibleTextArea() {
        setOpaque(false);
        setForeground(new Color(0, 0, 0, 0));
    }
}

