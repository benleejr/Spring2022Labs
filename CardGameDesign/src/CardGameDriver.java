
import javax.swing.*;

public class CardGameDriver {
    
    public static void main(String[] args) {
        
        Card card1 = new Card ("Clubs", "8");
        Card card2 = new Card ("Spades", "10");
        
        Deck deck = new Deck();
        
        System.out.println("Card 1: "+card1);
        System.out.println("Card 2: "+card2);
        System.out.println("Deck: "+ deck);
        
        JOptionPane.showMessageDialog(null, card1, "Card Test", 1);
        JOptionPane.showMessageDialog(null, card2, "Card Test", 1);
        
    }
    
}
