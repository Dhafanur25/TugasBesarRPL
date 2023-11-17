package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoolCheckBox extends JCheckBox {
    
    private static final Color TRANSPARENT = new Color(0, 0, 0, 0);

    public CoolCheckBox( ) {
        super("Saya setuju dengan syarat dan ketentuan");
        setOpaque(false); 
        setForeground(Color.WHITE); 

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(TRANSPARENT);
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); 

        if (isSelected()) {
            g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); 
        }

        super.paintComponent(g);
    }
    
}
