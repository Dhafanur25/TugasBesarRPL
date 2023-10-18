package swing;
import javax.swing.JButton;
import java.awt.Color;

public class TransparentButton extends JButton {
    public TransparentButton() {
        setOpaque(false); // Set the button to be transparent
        setBackground(new Color(0, 0, 0, 0)); // Set the background color to transparent
        setContentAreaFilled(false); // Make sure content area is not painted
        setBorderPainted(false); // Make sure border is not painted
    }
}

