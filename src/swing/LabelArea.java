package swing;

import java.awt.*;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class LabelArea extends JTextArea {

    public LabelArea() {
        setEditable(false);
        setBackground(Color.decode("#E4E9FF"));
        setForeground(Color.BLACK);
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLineWrap(true);
        setWrapStyleWord(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

        super.paintComponent(g);
    }
}
