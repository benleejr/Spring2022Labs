/* Program Name: BattleShipDisplay
 * Purpose: Program will initialize a battleship game board with a single 5 unit
 * long ship positioned randomly within the confines of the game board in a popup
 * utilizing the JOptionPane class.
 * Benedict Lee & Cameron Boddie
 * Last Modified: 26 April 2022
 */

import java.util.Random;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
        
public class BattleShipDisplay {
    
    public static void main(String[] args) {
        
        String[][] shipGame = battleGround();      
          
        printBattleGround(shipGame); 
        
    }
    
    public static void printBattleGround(String[][] battlefield) {       
                                                                
        final ImageIcon icon = new ImageIcon("battleship.png");       
                  
        String[] keepPlaying = {"Play!", "Quit"};
        
        String prompt = "This program will generate one 5 unit battleship\n"
                + "in a random location on a 10 x 10 game board.\nClick \"Play!\" "
                + "to place the ship in a different location or\nclick \"Quit\" "
                + "to exit the program.";
        
        int gameOptions = JOptionPane.showOptionDialog(null, prompt, "Welcome!", 0, 
                0, icon, keepPlaying, keepPlaying[0]);;
        
        while (gameOptions == 0) {            
            for(int i = 0; i < battlefield.length; i++) {
                Arrays.fill(battlefield[i], "-");
            }   
            
            int shipRow = shipRowRandomizer();
            int shipColumn = shipColumnRandomizer();
            int shipDirection = shipDirectionRandomizer();  
            
            String display = "BATTLESHIP\n\n";
            
            if(shipDirection == 0) { //Vertical ship                
                while(shipRow+5>10) {
                    shipRow = shipRowRandomizer();
                }                
                for(int row = shipRow; row < shipRow+5; row++) {                        
                    battlefield[row][shipColumn] = "x";                    
                }
            }
            
            if(shipDirection == 1) { //Horizontal ship                
                while(shipColumn+5>10) {
                    shipColumn = shipColumnRandomizer();
                }                
                for(int column = shipColumn; column < shipColumn+5; column++) {
                    battlefield[shipRow][column] = "x";
                }
            }                        
        
            for(int row = 0; row < 10; row++) {              
                for(int column = 0; column < 10; column++) {                
                    display += "   " + battlefield[row][column] + " ";                
                }            
                display += "\n";
            }                   
                gameOptions = JOptionPane.showOptionDialog(null, display, "Play!", 0, 
                    0, icon, keepPlaying, keepPlaying[0]);                    
                               
        } 
    
        String terminationPrompt = "Goodbye!";
        
        JOptionPane.showMessageDialog(null, terminationPrompt, "Play!", 0, icon);
    
    }
    
    public static String[][] battleGround() {
        
        String[][] battleshipArray = new String[10][10];
        
        for(int i = 0; i < battleshipArray.length; i++) {
           Arrays.fill(battleshipArray[i], "-");
        }            
                            
        return battleshipArray;
    }
    
    public static int shipRowRandomizer() {
        
        Random randomizer = new Random();  
                
        int shipRowNumber = randomizer.nextInt(10);
                                                      
        return shipRowNumber;
    }
    
    public static int shipColumnRandomizer() {
        
        Random randomizer = new Random();
        
        int shipColumnNumber = randomizer.nextInt(10);  
        
        return shipColumnNumber;
    }
    
    public static int shipDirectionRandomizer() {
        
        Random randomizer = new Random();
        
        int direction = randomizer.nextInt(2);
        
        return direction;
    }
    
}
