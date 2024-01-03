package main;

import View.WelcomeKonP;
import View.ForgotP;
import View.WelcomeP;
import View.LoginP;
import View.DoCounselingP;
import View.ChangeProfileP;
import View.ScheduleP;
import View.FeedbackP;
import View.BioUserP;
import View.RegisterP;
import javax.swing.*;
import java.awt.CardLayout;

/**
 * Kelas utama yang berfungsi sebagai entry point untuk aplikasi.
 */
public class Main extends JFrame {

    private JPanel cards;

    // Getter method untuk cards
    public JPanel getCards() {
        return cards;
    }

    public void setCards(JPanel cards) {
        this.cards = cards;
    }

    /**
     * Konstruktor kelas utama.
     */
    public Main() {
        try {
            // Mengatur tampilan Look and Feel menggunakan NimbusLookAndFeel
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException |
                InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        // Pengaturan frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 470);
        setLocationRelativeTo(null);
        setResizable(true);

        // Inisialisasi panel cards dengan CardLayout
        cards = new JPanel(new CardLayout());
        CardLayout cardLayout = (CardLayout) cards.getLayout();

        // Inisialisasi objek-objek panel untuk setiap tampilan
        RegisterP card2      = new RegisterP(cards, cardLayout);
        DoCounselingP card4  = new DoCounselingP(cards, cardLayout);
        FeedbackP card5      = new FeedbackP(cards, cardLayout);
        ForgotP card8        = new ForgotP(cards, cardLayout);
        ScheduleP card9      = new ScheduleP(cards, cardLayout);
        WelcomeKonP card10   = new WelcomeKonP(cards, cardLayout);

        WelcomeP card3       = new WelcomeP(cards, cardLayout, card4);
        BioUserP card6       = new BioUserP(cards, cardLayout, card9);
        LoginP card1         = new LoginP(cards, cardLayout, card6, card3, card5, card10);
        ChangeProfileP card7 = new ChangeProfileP(cards, cardLayout,card6, card3);

        // Menambahkan setiap panel ke panel cards dengan nama unik
        cards.add(card1, "LoginC");
        cards.add(card2, "RegisterC");
        cards.add(card3, "WelcomeC");
        cards.add(card4, "DoCounC");
        cards.add(card5, "FeedbackC");
        cards.add(card6, "BioUserC");
        cards.add(card7, "ChangeProfileC");
        cards.add(card8, "ForgotC");
        cards.add(card9, "ScheduleC");
        cards.add(card10, "WelcomeKonC");

        // Menambahkan panel cards ke frame utama
        add(cards);
        setVisible(true);
    }

    /**
     * Metode utama untuk menjalankan aplikasi.
     *
     * @param args Argumen baris perintah
     */
    public static void main(String[] args) {
        // Memastikan pembuatan GUI dijalankan pada thread Event Dispatch
        SwingUtilities.invokeLater(() -> new Main());
    }
}
