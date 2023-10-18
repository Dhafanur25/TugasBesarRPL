package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ProfilePic extends JPanel {

    private BufferedImage image;

    public ProfilePic() {
        try {
            this.image = ImageIO.read(getClass().getResource("/Background/imgPic.png"));
        } catch (IOException ex) {
            // Handle the exception (e.g., show default image)
            ex.printStackTrace();
        }
        setOpaque(false); // Set the panel to be transparent
        int size = 100; // Set the size of the circular panel
        setPreferredSize(new Dimension(size, size));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            int diameter = Math.min(getWidth(), getHeight());
            int x = (getWidth() - diameter) / 2;
            int y = (getHeight() - diameter) / 2;
            Ellipse2D circle = new Ellipse2D.Double(x, y, diameter, diameter);
            g2d.setClip(circle);
            g2d.drawImage(image, x, y, diameter, diameter, this);
            g2d.dispose();
        }
    }
}