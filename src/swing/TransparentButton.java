package swing;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;

public class TransparentButton extends JButton {
    public TransparentButton() {
        setOpaque(false); // Set the button to be transparent
        setBackground(new Color(0, 0, 0, 0)); // Set the background color to transparent
        setContentAreaFilled(false); // Make sure content area is not painted
        setBorderPainted(false); // Make sure the border is not painted
        
        // Set the layout to FlowLayout with right alignment
        setLayout(new FlowLayout(FlowLayout.RIGHT));

        // Adjust the text alignment to right-aligned
        setHorizontalAlignment(RIGHT);
    }
}