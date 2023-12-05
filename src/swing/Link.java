package swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Link extends JButton {
    private String state1 = "<html><font color='white'>Don't Have an Account? <font color='white'>Register</font></font></html>";
    private String state2 = "<html><font color='white'>Don't Have an Account? <font color='#3dabf5'>Register</font></font></html>";

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState1() {
        return state1;
    }

    public String getState2() {
        return state2;
    }
    
    public Link() {
        setText(state1);
        setBackground(new Color(0, 0, 0, 0));
        setBorder(null);
        setOpaque(false);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setText(state2);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setText(state1);
            }
        });
    }
}
//<html><font color='white'>Already have an account? <font color='white'>Log in</font></font></html>
//<html><font color='white'>Already have an account? <font color='#3dabf5'>Log in</font></font></html>

//<html><font color='purple'>&#9664; HOME</font></html>
//<html><font color='blue'>&#9664; HOME</font></html>

//<html><font color='black'><u>Feedback</u></font></html>
//<html><font color='blue'><u>Feedback</u></font></html>