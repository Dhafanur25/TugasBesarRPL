package main;

import Panel.DoCounP;
import Panel.BioUserP;
import Panel.ChangeProfileP;
import Panel.FeedbackP;
import Panel.LoginP;
import Panel.RegisterP;
import Panel.WelcomeP;
import java.awt.CardLayout;
import javax.swing.*;

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
        
        RegisterP card2 = new RegisterP(cards, (CardLayout) cards.getLayout());
        WelcomeP card3 = new WelcomeP(cards, (CardLayout) cards.getLayout());
        DoCounP card4 = new DoCounP(cards, (CardLayout) cards.getLayout());
        FeedbackP card5 = new FeedbackP(cards, (CardLayout) cards.getLayout());
        BioUserP card6 = new BioUserP(cards, (CardLayout) cards.getLayout());
        
        LoginP card1 = new LoginP(cards, (CardLayout) cards.getLayout(), card6, card3);
        ChangeProfileP card7 = new ChangeProfileP(cards, (CardLayout) cards.getLayout(),card6, card3);  
       

        cards.add(card1, "LoginC");
        cards.add(card2, "RegisterC");
        cards.add(card3, "WelcomeC");
        cards.add(card4, "DoCounC");
        cards.add(card5, "FeedbackC");
        cards.add(card6, "BioUserC");
        cards.add(card7, "ChangeProfileC");
        
        add(cards);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    } 
}
