package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EyeIcon extends JToggleButton {

    private ImageIcon openEyeIcon;
    private ImageIcon closedEyeIcon;

    private boolean isOpen;

    public EyeIcon() {
        isOpen = false;
        openEyeIcon = new ImageIcon("C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/icon/openEye.png");
        closedEyeIcon = new ImageIcon("C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/icon/closeEye.png");

        // Resize the icons
        openEyeIcon = resizeIcon(openEyeIcon, 20, 20);
        closedEyeIcon = resizeIcon(closedEyeIcon, 20, 20);

        setIcon(closedEyeIcon); // Initial state
        setPreferredSize(new Dimension(50, 30));
        setContentAreaFilled(false); // Make the content area transparent

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleIcon();
            }
        });
        setBorder(null);
    }

    private void toggleIcon() {
        isOpen = !isOpen;
        setIcon(isOpen ? openEyeIcon : closedEyeIcon);
    }

    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Do nothing to prevent painting the border
    }
    public boolean isOpen() {
        return isOpen;
    }

}
