package swing;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class RoundTextField extends JTextField {

    public RoundTextField() {
        setBackground(new Color(217, 217, 217));
        setForeground(Color.BLACK);
        setEditable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

        super.paintComponent(g);
    }
}
