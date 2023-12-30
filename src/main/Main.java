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

public class Main extends JFrame{
    
    private JPanel cards;

    public JPanel getCards() {
        return cards;
    }

    public void setCards(JPanel cards) {
        this.cards = cards;
    }
    public Main() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException |
                InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 470);
        setLocationRelativeTo(null);
        setResizable(true);
        
        cards = new JPanel(new CardLayout());
        CardLayout cardLayout = (CardLayout) cards.getLayout();
        
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
        
        add(cards);
        setVisible(true);  
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    } 
}
