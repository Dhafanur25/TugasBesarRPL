package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Link3 extends JButton {

    public Link3() {
        // Use HTML to set the text with a left arrow inside a circle
        String buttonText = "<html><font color='purple'>&#9664; Kembali</font></html>";
        setText(buttonText);

        // Set the background color to be transparent
        setBackground(new Color(0, 0, 0, 0));

        // Set the border to be empty
        setBorder(null);

        // Make the button opaque
        setOpaque(false);

        // Add a mouse listener to change the text color on hover
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the text color to blue when the mouse hovers over the button
                setText("<html><font color='blue'>&#9664; Kembali</font></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Change the text color back to purple when the mouse leaves the button
                setText("<html><font color='purple'>&#9664; Kembali</font></html>");
            }
        });
    }
}
