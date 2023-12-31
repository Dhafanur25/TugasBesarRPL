package swing;

import java.awt.Color;
import javax.swing.JTextArea;

public class InvisibleTextArea extends JTextArea {
    public InvisibleTextArea() {
        setOpaque(false);
        setForeground(new Color(0, 0, 0, 0));
    }
}

