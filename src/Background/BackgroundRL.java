package Background;


import addOns.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import com.twelvemonkeys.image.ImageUtil;

public class BackgroundRL extends JComponent {
    private Icon image;
    private BufferedImage bufferedImage;
    private String pic = "bgLogReg.jpg";
    private Component blur;
    
    public BackgroundRL() {
        image = new ImageIcon(getClass().getResource(pic));
    }
    
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

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }
    
    public void setPic(String pic) {
        this.pic = pic;
        loadImage();
        repaint();
    }
    public String getPic() {
        return pic;
    }

    public void loadImage() {
        image = new ImageIcon(getClass().getResource(pic));
        createImage();
    }

    public void createImage() {
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

    public void createBlurImage(Graphics2D g) {
        int x = blur.getX();
        int y = blur.getY();
        int width = blur.getWidth();
        int height = blur.getHeight();
        int shadow = 8;
        if (width > 0 && height > 0) {
            BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = img.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Shape shape = new FancyBorderRadius(width, height, "26% 74% 51% 49% / 49% 18% 82% 51%").getShape();
            g2.fill(shape);
            g2.setComposite(AlphaComposite.SrcIn);
            g2.drawImage(ImageUtil.blur(bufferedImage.getSubimage(x, y, width, height), 30f), 0, 0, null);
            g2.setComposite(AlphaComposite.SrcOver);
            g2.setColor(new Color(255, 255, 255, 20));
            g2.fill(shape);
            g2.dispose();
            g.drawImage(new ShadowRenderer(shadow, 0.3f, new Color(0, 0, 0)).createShadow(img), (int) (x - shadow * 0.8f), (int) (y - shadow * 0.8f), null);
            g.drawImage(img, x, y, null);
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (bufferedImage != null) {
            BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = img.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.fillRect(0, 0, getWidth(), getHeight()); // Rectangle instead of rounded rectangle
            g2.setComposite(AlphaComposite.SrcIn);
            g2.drawImage(bufferedImage, 0, 0, null);
            g2.dispose();
            grphcs.drawImage(img, 0, 0, null);
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

    public Rectangle getAutoSize(Icon image) {
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