package swing;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import Controller.Database;

public class RightSideProfilePic extends JPanel {
    private Database db = Database.getInstance();
    private BufferedImage image;
    private String pic = db.getDefaults();

    public RightSideProfilePic() {
        loadImage(pic);
    }

    public void setPic(String pic) {
        this.pic = pic;
        loadImage(pic);
    }

    private void loadImage(String pic) {
        try {
            image = ImageIO.read(new File(pic));
            repaint();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            int diameter = Math.min(getWidth(), getHeight());
            int imageSize = diameter;

            int x = getWidth() - imageSize;
            int y = (getHeight() - diameter) / 2;

            Ellipse2D circle = new Ellipse2D.Double(x, y, diameter, diameter);
            g2d.setClip(circle);
            g2d.drawImage(image, x, y, diameter, diameter, this);
            g2d.dispose();
        }
    }
    
}

