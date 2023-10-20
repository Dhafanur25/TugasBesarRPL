package Background;

import addOns.FancyBorderRadius;
import com.twelvemonkeys.image.ImageUtil;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class Background extends JComponent {

    public Component getBlur() {
        return blur;
    }

    public void setBlur(Component blur) {
        this.blur = blur;
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createImage();
                repaint();
            }
        });
    }

    private Icon image;
    private BufferedImage bufferedImage;
    private String pic = "bgLogReg.jpg";
    private Component blur;

    public void setPic(String pic) {
        this.pic = pic;
        loadImage();
        repaint();
    }

    private void loadImage() {
        image = new ImageIcon(getClass().getResource(pic));
        createImage();
    }

    public Background() {
        image = new ImageIcon(getClass().getResource(pic));
    }

    private void createImage() {
        if (image != null) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2 = bufferedImage.createGraphics();

                // Set rendering quality
                g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                Rectangle rec = getAutoSize(image);
                g2.drawImage(((ImageIcon) image).getImage(), rec.x, rec.y, rec.width, rec.height, null);
                if (blur != null) {
                    createBlurImage(g2);
                }
                g2.dispose();
            }
        }
    }
    private void createBlurImage(Graphics2D g) {
        int x = blur.getX();
        int y = blur.getY();
        int width = blur.getWidth();
        int height = blur.getHeight();
        if (width > 0 && height > 0) {
            BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = img.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Shape shape = new Rectangle2D.Double(0, 0, width, height); // Rectangle shape
            g2.fill(shape);
            g2.setComposite(AlphaComposite.SrcIn);
            g2.drawImage(ImageUtil.blur(bufferedImage.getSubimage(x, y, width, height), 30f), 0, 0, null);
            g2.setComposite(AlphaComposite.SrcOver);
            g2.setColor(new Color(255, 255, 255, 20));
            g2.fill(shape);
            g2.dispose();
            AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.1f);
            g.setComposite(alphaComposite);
            g.drawImage(img, x, y, null);
        }
    }



    @Override
    protected void paintComponent(Graphics grphcs) {
        if (bufferedImage != null) {
            grphcs.drawImage(bufferedImage, 0, 0, null);
        }
        super.paintComponent(grphcs);
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createImage();
                repaint();
            }
        });
    }

    private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        if (width < 1) {
            width = 1;
        }
        if (height < 1) {
            height = 1;
        }
        int x = (w - width) / 2;
        int y = (h - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }
}
