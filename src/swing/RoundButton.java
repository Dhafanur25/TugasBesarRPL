package swing;

import java.awt.*;
import javax.swing.JButton;

public class RoundButton extends JButton {
    private Color backgroundColor = new Color(217, 217, 217);

    public RoundButton() {
        setContentAreaFilled(false);
        setButtonText("Default Text");
        setForeground(Color.BLACK);
        setHorizontalAlignment(CENTER); 
        setVerticalAlignment(CENTER); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(backgroundColor);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
    }

    public void setButtonText(String text) {
        setText(text);
    }

    public void setBackgroundColor(String colorString) {
        Color color = Color.decode(colorString);
        backgroundColor = color;
        repaint();
    }
}

