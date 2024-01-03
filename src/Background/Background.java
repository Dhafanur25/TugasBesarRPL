package Background;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import com.twelvemonkeys.image.ImageUtil;

/*
 Kelas ini merupakan turunan dari BackgroundRL 
 dan digunakan untuk menampilkan latar belakang 
 dengan efek blur kotak.
*/
public class Background extends BackgroundRL {

    /*
      Override metode createBlurImage dari class 
      BackgroundRL untuk menyediakan 
      implementasi yang khusus.
    */
    @Override
    public void createBlurImage(Graphics2D g) {
        int x = getBlur().getX();
        int y = getBlur().getY();
        int width = getBlur().getWidth();
        int height = getBlur().getHeight();
        if (width > 0 && height > 0) {
            // Membuat BufferedImage baru untuk gambar blur
            BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = img.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Membuat bentuk persegi panjang untuk diisi dan di-blur
            Shape shape = new Rectangle2D.Double(0, 0, width, height);
            g2.fill(shape);

            // Menerapkan efek blur pada gambar latar belakang
            g2.setComposite(AlphaComposite.SrcIn);
            g2.drawImage(ImageUtil.blur(getBufferedImage().getSubimage(x, y, width, height), 30f), 0, 0, null);

            // Mengembalikan ke mode normal dan menambahkan efek transparent
            g2.setComposite(AlphaComposite.SrcOver);
            g2.setColor(new Color(255, 255, 255, 20));
            g2.fill(shape);
            g2.dispose();

            // Mengatur efek transparansi global
            AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.1f);
            g.setComposite(alphaComposite);

            // Menggambar image blur ke komponen
            g.drawImage(img, x, y, null);
        }
    }
}
