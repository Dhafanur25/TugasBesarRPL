package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Link1 extends JButton {

    public Link1() {
        // Use HTML to set the text and style the "Register" part in blue
        String buttonText = "<html><font color='white'>Don't have an account? <font color='white'>Register</font></font></html>";
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
                // Change the "Register" text color to blue when the mouse hovers over the button
                setText("<html><font color='white'>Don't have an account? <font color='#3dabf5'>Register</font></font></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Change the "Register" text color back to blue when the mouse leaves the button
                setText("<html><font color='white'>Don't have an account? <font color='white'>Register</font></font></html>");
            }
        });
    }
}