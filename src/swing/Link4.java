package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Link4 extends JButton {

    public Link4() {
        String buttonText = "<html><font color='black'><u>Feedback</u></font></html>";
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
                setText("<html><font color='blue'><u>Feedback</u></font></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setText("<html><font color='black'><u>Feedback</u></font></html>");
            }
        });
    }
}
