package swing;

import javax.swing.JComboBox;
import java.awt.Color;

public class combobox extends JComboBox<String> {

    public combobox() {
        // Set the background color to RGB(217, 217, 217)
        setBackground(new Color(217, 217, 217));

        // Set the text color to black
        setForeground(Color.BLACK);

        // Add the items "Pria" and "Wanita"
        addItem("Pria");
        addItem("Wanita");
        
    }
}
