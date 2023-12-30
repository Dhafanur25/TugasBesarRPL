package swing;

import java.awt.*;
import javax.swing.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import Controller.ImageController;
import java.io.InputStream;

public class RightSideProfilePic extends JPanel {
    private ImageController IC = new ImageController();
    private BufferedImage image;
    private InputStream imageStream = IC.retrieveImage(1, "defaultpic");

    public RightSideProfilePic() {
        loadImage(imageStream);
    }

    public void setPic(InputStream imageStream) {
        this.imageStream = imageStream;
        loadImage(imageStream);
    }

    public InputStream getImageStream() {
        return imageStream;
    }

    private void loadImage(InputStream imageStream) {
        try {
            if (imageStream != null) {
                image = ImageIO.read(imageStream);
                imageStream.close();
            } else {
                try (InputStream defaultStream = IC.retrieveImage(1, "defaultpic")) {
                    image = ImageIO.read(defaultStream);
                }
            }
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

            // Use higher-quality rendering hints
            RenderingHints renderingHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            renderingHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            renderingHints.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2d.setRenderingHints(renderingHints);

            g2d.setClip(circle);
            g2d.drawImage(image, x, y, diameter, diameter, this);
            g2d.dispose();
        }
    }
}
