package swing;

import java.awt.Color;
import javax.swing.JComboBox;

public class RoundComboBox extends JComboBox<String> {

    public RoundComboBox() {
        setBackground(new Color(217, 217, 217));
        setForeground(Color.BLACK);
        addItem("Pria");
        addItem("Wanita");
        
    }
}
