package swing;

import javax.swing.JComboBox;
import java.awt.Color;

public class RoundComboBox extends JComboBox<String> {

    public RoundComboBox() {
        setBackground(new Color(217, 217, 217));
        setForeground(Color.BLACK);
        addItem("Pria");
        addItem("Wanita");
        
    }
}
