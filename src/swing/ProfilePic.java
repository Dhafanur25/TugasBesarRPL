package swing;

import java.awt.*;
import javax.swing.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import Controller.ImageController;
import java.io.InputStream;

public class ProfilePic extends JPanel {
    private ImageController IC = new ImageController();
    private BufferedImage image;
    private InputStream imageStream = IC.retrieveImage(1, "defaultpic");

    public ProfilePic() {
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
            int width = image.getWidth();
            int height = image.getHeight();

            int diameter = Math.min(getWidth(), getHeight());
            int x = (getWidth() - diameter) / 2;
            int y = (getHeight() - diameter) / 2;

            int croppedSize = Math.min(width, height);
            int xOffset = (width - croppedSize) / 2;
            int yOffset = (height - croppedSize) / 2;

            BufferedImage croppedImage = image.getSubimage(xOffset, yOffset, croppedSize, croppedSize);

            RenderingHints renderingHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            renderingHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            renderingHints.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHints(renderingHints);

            Ellipse2D circle = new Ellipse2D.Double(x, y, diameter, diameter);
            g2d.setClip(circle);
            g2d.drawImage(croppedImage, x, y, diameter, diameter, this);
            g2d.dispose();
        }
    }
}
