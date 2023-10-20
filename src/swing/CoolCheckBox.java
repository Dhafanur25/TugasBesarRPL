package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoolCheckBox extends JCheckBox {
    
    private static final Color TRANSPARENT = new Color(0, 0, 0, 0);

    public CoolCheckBox( ) {
        super("Saya setuju dengan syarat dan ketentuan");
        setOpaque(false); // Make the checkbox transparent
        setForeground(Color.WHITE); // Set text color to white

        // Add an ActionListener to update the checkbox color
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Paint the background
        g.setColor(TRANSPARENT); // Transparent background
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); 

        // Paint the checkbox
        if (isSelected()) {
            g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); 
        }

        super.paintComponent(g);
    }
    
}
