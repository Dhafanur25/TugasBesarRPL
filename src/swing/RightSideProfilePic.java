package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class RightSideProfilePic extends JPanel {

    private BufferedImage image;
    private String pic = "C:\\Users\\dhafa\\Downloads\\Java Codes\\YouthWellness\\src\\Background\\imgPic.png";

    public RightSideProfilePic() {
        // Load the initial image
        loadImage(pic);
    }

    public void setPic(String pic) {
        // Set the new image path and load it
        this.pic = pic;
        loadImage(pic);
    }

    private void loadImage(String pic) {
        try {
            image = ImageIO.read(new File(pic));
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
            int imageSize = diameter; // Size of the circular image

            int x = getWidth() - imageSize; // Align to the right
            int y = (getHeight() - diameter) / 2; // Center vertically

            Ellipse2D circle = new Ellipse2D.Double(x, y, diameter, diameter);
            g2d.setClip(circle);
            g2d.drawImage(image, x, y, diameter, diameter, this);
            g2d.dispose();
        }
    }
}

