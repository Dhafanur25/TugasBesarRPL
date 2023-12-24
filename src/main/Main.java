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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 470);
        setLocationRelativeTo(null);
        setResizable(true);
        
        cards = new JPanel(new CardLayout());
        
        RegisterP card2      = new RegisterP(cards, (CardLayout) cards.getLayout());
        DoCounselingP card4  = new DoCounselingP(cards, (CardLayout) cards.getLayout());
        FeedbackP card5      = new FeedbackP(cards, (CardLayout) cards.getLayout());
        ForgotP card8        = new ForgotP(cards, (CardLayout) cards.getLayout());
        ScheduleP card9      = new ScheduleP(cards, (CardLayout) cards.getLayout());
        WelcomeKonP card10   = new WelcomeKonP(cards, (CardLayout) cards.getLayout());
        
        WelcomeP card3       = new WelcomeP(cards, (CardLayout) cards.getLayout(), card4);
        BioUserP card6       = new BioUserP(cards, (CardLayout) cards.getLayout(), card9);
        LoginP card1         = new LoginP(cards, (CardLayout) cards.getLayout(), card6, card3, card5, card10);
        ChangeProfileP card7 = new ChangeProfileP(cards, (CardLayout) cards.getLayout(),card6, card3);  
       

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
