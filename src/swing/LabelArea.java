package swing;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.border.EmptyBorder;

public class LabelArea extends JTextArea {

    public LabelArea() {
        // Set the text area to non-editable
        setEditable(false);

        // Set the background color to #E4E9FF
        setBackground(Color.decode("#E4E9FF"));

        // Set the text color to black
        setForeground(Color.BLACK);

        // Create an empty border for padding
        setBorder(new EmptyBorder(10, 10, 10, 10));

        // Allow text to wrap down if it's out of bounds
        setLineWrap(true);
        setWrapStyleWord(true);
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
