package swing;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class RoundTextField extends JTextField {

    public RoundTextField() {
        // Set the background color to light gray
        setBackground(new Color(217, 217, 217)); // You can adjust the RGB values as needed

        // Set the text color to black
        setForeground(Color.BLACK);

        // Make the text field editable
        setEditable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Enable anti-aliasing for smoother edges
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the background color
        g.setColor(getBackground());

        // Draw a rounded rectangle as the background
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20); // Adjust the radius for the desired roundness

        super.paintComponent(g);
    }
}
