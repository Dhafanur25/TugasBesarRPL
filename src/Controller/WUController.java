package Controller;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Kelas WUController berisi metode-metode yang terkait dengan pengendalian kuis.
 */
public class WUController {

    /**
     * Metode ini membuka browser default pengguna untuk mengakses tautan kuis online.
     * Tautan kuis diberikan dalam bentuk URI.
     */
    public void doQuiz(){
        try {
            // Membuat objek URI dengan tautan kuis online
            URI uri = new URI("https://forms.gle/325XJWCqV8c6ZHSq6");

            // Membuka browser default untuk mengakses tautan kuis
            Desktop.getDesktop().browse(uri);

        } catch (IOException | URISyntaxException ex) {
            // Menangani IOException atau URISyntaxException dengan mencetak informasi ke konsol
            ex.printStackTrace();
        }
    }
}
