package Controller;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WUController {
    public void doQuiz(){
        try {
            URI uri = new URI("https://forms.gle/325XJWCqV8c6ZHSq6");
            Desktop.getDesktop().browse(uri);
              
        }catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
}
