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
    public String pics = "C:\\Users\\dhafa\\Downloads\\Java Codes\\YouthWellness\\src\\Background\\imgPic.png";

    public ProfilePic() {
        // Load the initial image
        loadImage(pics);
    }

    public void setPic(String pics) {
        // Set the new image path and load it
        this.pics = pics;
        loadImage(pics);
    }

    private void loadImage(String pics) {
        try {
            image = ImageIO.read(new File(pics));
            repaint(); // Repaint the component to update the displayed image
        } catch (IOException ex) {
            // Handle the exception (e.g., show a default image)
            ex.printStackTrace();
        }
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