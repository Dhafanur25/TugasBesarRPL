package swing;

import javax.swing.JTextArea;
import java.awt.Color;

public class textarea extends JTextArea {

    public textarea() {
        // Set the background color to light gray
        setBackground(new Color(217, 217, 217)); // You can adjust the RGB values as needed

        // Set the text color to white
        setForeground(Color.BLACK);

        // Make the text area editable
        setEditable(true);
    }
}
