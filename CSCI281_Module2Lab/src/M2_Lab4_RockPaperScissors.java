/*
 * 
 */

import java.util.*;
import javax.swing.*;
import java.io.*;

public class M2_Lab4_RockPaperScissors {
    
    public static void main(String[] args) {
        
        Random randomGenerator = new Random();
        
        final ImageIcon startingIcon = new ImageIcon("handsrockpaperscissors.png");
        
        String beginGamePrompt = "You will now play the game "
                + "\"Rock, Paper, Scissors\". On the next popup, \nyou will have"
                + " three options labelled \"Rock\", \"Paper\", "
                + "or \"Scissors\". \nUsing your mouse, click on the button that "
                + "corresponds to the \nmove you would like to play."
                + "\n\nFor example, if you want to play \"Scissors\", click on "
                + "the button that is \nlabelled \"Scissors\"."
                + "\n\nPress continue when you are ready "
                + "to play Rock, Paper, Scissors.";
        
        String[] continueButton = {"Continue"};     
        int introduction = JOptionPane.showOptionDialog(null, beginGamePrompt, 
                "Are you Ready to Play? - C. Boddie & B. Lee", 0, 0, 
                startingIcon, continueButton, continueButton[0]);
        
        int roundCount = 0;
        int wins = 0;
        int losses = 0;
        int ties = 0;
                   
        while (roundCount<3) {
            
            roundCount += 1;
                    
            String prompt = "Please click on one of the following buttons\n "
                    + "corresponding to your play\n";
        
            String[] choices = {"Scissors", "Paper", "Rock"};
        
            int choice = JOptionPane.showOptionDialog(null, prompt,
                "Play \"Rock, Paper, Scissors\" - C.Boddie & B. Lee", 
                0, 0, startingIcon, choices, choices[0]);
            
            ImageIcon resultIcon = new ImageIcon ("");
        
            String player_choice = "";
            String computer_choice = "";
            String comparison = "";
            String roundResult = "";
        
            switch (choice)
            {
                case 2:
                    player_choice = "\"Rock\"";
                    break;
                case 1:
                    player_choice = "\"Paper\"";
                    break;
                case 0:
                    player_choice = "\"Scissors\"";
                    break;
            }
                              
            int computerPlays = randomGenerator.nextInt(3);
            
            switch (computerPlays)
            {
                case 2:
                    computer_choice = "\"Rock\"";
                    break;
                case 1:
                    computer_choice = "\"Paper\"";
                    break;
                case 0:
                    computer_choice = "\"Scissors\"";
            }
            
            if (computer_choice.equals(player_choice)) {
                roundResult = "<html>You both chose <h1>"+computer_choice+
                        "</h1> It is a draw!";
                resultIcon = new ImageIcon ("rockPaperScissors.png");
                ties += 1;
            }
            
            else if (computer_choice.equals("\"Paper\"")&&
                    player_choice.equals("\"Rock\"")) {
                roundResult = "<html> <h1>Paper wraps Rock!"
                        + "</h1><br>You have lost, better luck next time!";
                resultIcon = new ImageIcon ("paperWrapsRock.png");
                losses += 1;
            }               
            
            else if (computer_choice.equals("\"Scissors\"")&&
                    player_choice.equals("\"Paper\"")) {
                roundResult = "<html> <h1>Scissors cut Paper!"
                        + "</h1><br>You have lost, better luck next time!";
                resultIcon = new ImageIcon ("scissorCutPaper.png");
                losses += 1;
            }          
               
            else if (computer_choice.equals("\"Rock\"")&&
                    player_choice.equals("\"Scissors\"")) {
                roundResult = "<html> <h1>Rock crushes Scissors!</h1><br>"
                        + "You have lost, better luck next time!";
                resultIcon = new ImageIcon ("rockCrushScissor.png");
                losses += 1;
            }          
            
            else if (computer_choice.equals("\"Rock\"")&&
                    player_choice.equals("\"Paper\"")) {
                roundResult = "<html> <h1>Paper wraps Rock!"
                        + "</h1><br>You have won!";
                resultIcon = new ImageIcon ("paperWrapsRock.png");
                wins += 1;
            }          
            
            else if (computer_choice.equals("\"Scissors\"")&&
                    player_choice.equals("\"Rock\"")) {
                roundResult = "<html> <h1>Rock crushes Scissors!"
                        + "</h1><br>You have won!";
                resultIcon = new ImageIcon ("rockCrushScissor.png");
                wins += 1;
            }          
            
            else if (computer_choice.equals("\"Paper\"")&&
                    player_choice.equals("\"Scissors\"")) {
                roundResult = "<html> <h1>Scissors cuts Paper!"
                        + "</h1><br>You have won!";
                resultIcon = new ImageIcon ("scissorCutPaper.png");
                wins += 1;
            }                             
                   
            String resultsAccumulator = "<html>You played "+player_choice+
                    " and the computer plays "+computer_choice+".<br>"
                    +roundResult;
                    
            JOptionPane.showMessageDialog(null, resultsAccumulator, 
                    "End of round results - C. Boddie & B. Lee", 0, resultIcon);
                
        }
        
        String endGamePrompt = "<html>The final score for 3 games is as follows:"
                + "<h1>Wins: "+wins+"<br>Losses: "+losses+"<br>Ties: "+ties
                +"</h1>";
        String endStatement = "The game is now over, thank you very "
                + "much for playing!\n This program will now exit.\"";
        
        JOptionPane.showMessageDialog(null, endGamePrompt, 
                "FINAL SCORES - C. Boddie & B. Lee", 0, startingIcon);
        
        JOptionPane.showMessageDialog(null, endStatement,
                "Program will now terminate - C. Boddie & B. Lee", 
                0, startingIcon);
      }
}
