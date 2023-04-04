import java.util.*;
import javax.swing.JOptionPane;

public class Hand {
    
    ArrayList<Card> cards;
    
    public Hand() {
        cards=new ArrayList<>(); //Diamond inference shortcut
    }
    
    public void add(Card car) {
        cards.add(car);
    }
    
    public void addInOrder(Card car) {
        int counter = 0;
        int limit = cards.size();
        while (counter<limit) {
            if(cards.get(counter).getRank() > car.getRank()) {
                cards.add(counter, car);
                return;
            }
            if(cards.get(counter).getRank() == car.getRank()) {
                if(cards.get(counter).getOrder() > car.getOrder()) {
                    cards.add(counter,car);
                    return;
                }
            }
            counter++;
        }
        cards.add(car);
    }
    
    public String toString() {
        String display = "";
        
        for(int car=0; car<cards.size();car++) {
            display += cards.get(car)+"\n";
        }
        return display;
    }
    
    public static void main (String[] args) {
        
        Hand myHand = new Hand();
        
        myHand.addInOrder(new Card("8", "clubs"));
        myHand.addInOrder(new Card("2", "spade"));
        myHand.addInOrder(new Card("King", "Clubs"));
        myHand.addInOrder(new Card("7", "Diamonds"));
        myHand.addInOrder(new Card("8", "Hearts"));
        
        JOptionPane.showMessageDialog(null, myHand, "Card Test" , 1); 
    }
    
}
