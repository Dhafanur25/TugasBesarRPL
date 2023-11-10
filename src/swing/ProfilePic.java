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
    private String pic = "C:\\Users\\dhafa\\Downloads\\Java Codes\\YouthWellness\\src\\Background\\imgPic.png";

    public ProfilePic() {
        loadImage(pic);
    }

    public void setPic(String pic) {
        this.pic = pic;
        loadImage(pic);
    }

    private void loadImage(String pics) {
        try {
            image = ImageIO.read(new File(pics));
            repaint();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            int width = image.getWidth();
            int height = image.getHeight();

            int diameter = Math.min(getWidth(), getHeight());
            int x = (getWidth() - diameter) / 2;
            int y = (getHeight() - diameter) / 2;

            int croppedSize = Math.min(width, height);
            int xOffset = (width - croppedSize) / 2;
            int yOffset = (height - croppedSize) / 2;

            BufferedImage croppedImage = image.getSubimage(xOffset, yOffset, croppedSize, croppedSize);
            Image scaledImage = croppedImage.getScaledInstance(diameter, diameter, Image.SCALE_SMOOTH);

            Graphics2D g2d = (Graphics2D) g.create();
            Ellipse2D circle = new Ellipse2D.Double(x, y, diameter, diameter);
            g2d.setClip(circle);
            g2d.drawImage(scaledImage, x, y, this);
            g2d.dispose();
        }
    }

}