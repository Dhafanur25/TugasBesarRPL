package swing;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class RoundTextArea extends JTextArea {

    public RoundTextArea() {
        // Set the background color to light gray
        setBackground(new Color(217, 217, 217)); // You can adjust the RGB values as needed

        // Set the text color to white
        setForeground(Color.BLACK);

        // Make the text area editable
        setEditable(true);
    }
    @Override
    protected void paintComponent(Graphics g) {
        // Enable anti-aliasing for smoother edges
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the background color
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); // Adjust the radius for the desired roundness

        super.paintComponent(g);
    }
}
