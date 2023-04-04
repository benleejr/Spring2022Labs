
import javax.swing.*;
import java.util.*;

public class IntroductionVideo {
    
    public static void main(String[] args) {
        
         String[] colors = {"red", "blue", "green", "yellow", "black"};
         String[] shapes = {"square", "circle", "star", "wavy", "plus"};
        
         Random randomGenerator = new Random();
         int color = randomGenerator.nextInt(6);
         int shape = randomGenerator.nextInt(6);
         
         String fileName = "psi_cards/"+colors[color]+"AND"+shapes[shape]+".png";
         ImageIcon icon = new ImageIcon(fileName);
         
         icon = new ImageIcon("psi_cards/unknown.png");
         icon = new ImageIcon("psi_cards/question.png");
         
         JOptionPane.showMessageDialog(null, ""+fileName, "image demo", 0,icon);
         
    }
}
