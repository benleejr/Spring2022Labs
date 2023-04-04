/* Purpose: To continue working with loops and procedural programming as well as
 * working with JOptionPane. 
 *
 * This program will aceept user input of a color, shape, or color and shape, compare the input to a randomly generated and 
 * return the relevant score.
 * 
 * Cameron Boddie & Benedict Lee
 * 
 * 15 March 2022
 */

import javax.swing.*;
import java.util.*;

public class PerceptionTest {

    public static void main(String[] args) {

        final ImageIcon questionIcon = new ImageIcon("psi_cards/question.png");
        final ImageIcon unknownIcon = new ImageIcon("psi_cards/unknown.png");

        int perceptions = 0;
        int score = 0;
        int fiveMoreTrials = 0;

        String chosenColor = "";
        String randomChosenColor = "";
        String chosenShape = "";
        String randomChosenShape = "";
        
        String introductionPrompt = "Welcome to this extra-sensory perception test,"
                + "\nyou will be given the choice to either partake in the perception"
                + "\nof colors, shapes, or both shapes and colors simultaneously."
                + "\nUsing your mouse, select the button labelled with the corresponding"
                + "\nshape or color that you would like to choose. For example, to choose"
                + "\nthe color \"red\", click on the button with the words\"red\""
                + "\nin the selection box."
                + "\nYou will earn one point if you choose correctly, and zero"
                + "\npoints if you choose incorrectly."
                + "\nGood Luck!";
        
        JOptionPane.showMessageDialog(null, introductionPrompt, "Welcome!", 0, questionIcon);

        String choicePrompt = "Choose the perception test that you would"
                + " like to perform.";
        String[] choices = {"Quit", "Both", "Color", "Shape"};
        int testChoice = JOptionPane.showOptionDialog(null, choicePrompt,
                "Please Choose a test", 0, 0, questionIcon, choices, choices[0]);

        String[] colors = {"red", "blue", "green", "yellow", "black"};
        String[] shapes = {"square", "circle", "star", "wavy", "plus"};
        Random randomGenerator = new Random();
        int color = 0;
        int shape = 0;
        
        String terminationPrompt = "This program will now exit, thank you for"
                + " your participation!";

        String[] continueOrQuit = {"Another 5 Trials", "Quit"};

        if (testChoice == 0) {
            JOptionPane.showMessageDialog(null, terminationPrompt,
                    "This Program will Now Exit", 0);
            return;
        }

        if (testChoice == 1) {

            int colorScore = 0;
            int shapeScore = 0;

            String colorQuestionPrompt = "Your card has been generated,\n"
                    + "You have chosen to test on both color and shape!\n"
                    + "Your first perception response will be color."
                    + "\nWhich color do you perceieve?";
            String shapeQuestionPrompt = "What do you percieve the shape to be?";

            while (fiveMoreTrials == 0) {
                int iterator = 0;

                while (iterator < 5) {
                    int colorChoice = JOptionPane.showOptionDialog(null,
                            colorQuestionPrompt, "Choose a color", 0, 0, unknownIcon,
                            colors, colors[0]);

                    int shapeChoice = JOptionPane.showOptionDialog(null,
                            shapeQuestionPrompt, "Choose a shape", 0, 0, unknownIcon,
                            shapes, shapes[0]);

                    color = randomGenerator.nextInt(5);
                    shape = randomGenerator.nextInt(5);

                    String fileName = "psi_cards/" + colors[color] + "AND"
                            + shapes[shape] + ".png";
                    ImageIcon icon = new ImageIcon(fileName);

                    String colorResultPrompt = "Color Perception:\n  You percieved"
                            + " \"" + colors[colorChoice] + "\"\n  The color was \""
                            + colors[color] + "\"";

                    String shapeResultPrompt = "Shape Perception:\n  You perceived"
                            + " \"" + shapes[shapeChoice] + "\"\n  The shape was \""
                            + shapes[shape] + "\"";

                    if (colorChoice == color && shapeChoice == shape) {
                        JOptionPane.showMessageDialog(null, colorResultPrompt + "\n"
                                + "Congratulations you have a good perception of"
                                + " color!\n" + shapeResultPrompt + "\nCongratulations,"
                                + " you have a good perception of shape!"
                                + "\nYou were very accurate with your perception"
                                + " of both color and shape!", "Card Result",
                                0, icon);
                        score++;
                        shapeScore++;
                        colorScore++;
                        
                    }
                    
                    else if (colorChoice == color && shapeChoice != shape) {
                        JOptionPane.showMessageDialog(null, colorResultPrompt + "\n"
                                + "Congratulations you have a good perception of"
                                + " color!\n" + shapeResultPrompt + "\nSorry, you were "
                                + "incorrect about the shape."
                                + "\nYou were accurate with your perception"
                                + " of color only!", "Card Result", 0, icon);

                        colorScore++;

                    } 
                    
                    else if (colorChoice != color && shapeChoice == shape) {
                        JOptionPane.showMessageDialog(null, colorResultPrompt + "\n"
                                + "Sorry you were incorrect about the color.\n"
                                + shapeResultPrompt + "\nCongratulations,"
                                + " you have a good perception of shape!"
                                + "\nYou were accurate with your perception"
                                + " of shape only.", "Card Result",
                                0, icon);

                        shapeScore++;

                    } 
                    
                    else {
                        JOptionPane.showMessageDialog(null, colorResultPrompt + "\n"
                                + "Sorry, you were incorrect about the color.\n"
                                + shapeResultPrompt + "\nSorry, you were incorrect about"
                                + " the shape." + "\nYou were incorrect for both color"
                                + " and shape this time.\n No points were"
                                + " awarded.", "Card Result", 0, icon);
                    }

                    iterator++;

                }

                perceptions += 5;
                
                String resultPrompt = "";
                
                if (score!= 1) {
                    
                    resultPrompt = "You have entered " + perceptions + ""
                        + " perceptions:\n    Your color score is " + colorScore
                        + "\n    Your shape score is " + shapeScore + "\nYou got both"
                        + " correct " + score + " times";
                
                }
                
                else {
                    resultPrompt = "You have entered " + perceptions + ""
                        + " perceptions:\n    Your color score is " + colorScore
                        + "\n    Your shape score is " + shapeScore + "\nYou got both"
                        + " correct " + score + " time";
                    
                }

                fiveMoreTrials = JOptionPane.showOptionDialog(null,
                        resultPrompt, "Results so Far", 0, 0, questionIcon,
                        continueOrQuit, continueOrQuit[0]);

            }
            
            JOptionPane.showMessageDialog(null, terminationPrompt,
                    "This Program will Now Exit", 0);

        }

        if (testChoice == 2) {

            String questionPrompt = "Your card has been generated,\n"
                    + "Which color do you perceieve?";

            while (fiveMoreTrials == 0) {
                int iterator = 0;

                while (iterator < 5) {
                    int choice = JOptionPane.showOptionDialog(null,
                            questionPrompt, "Choose a color", 0, 0, unknownIcon,
                            colors, colors[0]);

                    color = randomGenerator.nextInt(5);
                    shape = randomGenerator.nextInt(5);

                    String fileName = "psi_cards/" + colors[color] + "AND"
                            + shapes[shape] + ".png";
                    ImageIcon icon = new ImageIcon(fileName);

                    String cardResultPrompt = "Color Perception:\n  You percieved"
                            + " \"" + colors[choice] + "\"\n   The color was \""
                            + colors[color] + "\"";

                    if (choice == color) {
                        JOptionPane.showMessageDialog(null, cardResultPrompt + "\n"
                                + "Congratulations you have a good perception of"
                                + " color!", "Card Result", 0, icon);
                        score++;
                    } 
                    
                    else {
                        JOptionPane.showMessageDialog(null, cardResultPrompt + "\n"
                                + "Sorry, you were incorrect this round",
                                "Card Result", 0, icon);
                    }

                    iterator++;

                }

                perceptions += 5;

                String resultPrompt = "You have entered " + perceptions + ""
                        + " perceptions,\n   your color score is " + score;

                fiveMoreTrials = JOptionPane.showOptionDialog(null,
                        resultPrompt, "Results so Far", 0, 0, questionIcon,
                        continueOrQuit, continueOrQuit[0]);

            }
            
            JOptionPane.showMessageDialog(null, terminationPrompt,
                    "This Program will Now Exit", 0);

        }
        
        if (testChoice == 3) {

            String questionPrompt = "Your card has been generated,\n"
                    + "Which shape do you perceieve?";

            while (fiveMoreTrials == 0) {
                int iterator = 0;

                while (iterator < 5) {
                    int choice = JOptionPane.showOptionDialog(null,
                            questionPrompt, "Choose a shape", 0, 0, unknownIcon,
                            shapes, shapes[0]);

                    color = randomGenerator.nextInt(5);
                    shape = randomGenerator.nextInt(5);

                    String fileName = "psi_cards/" + colors[color] + "AND"
                            + shapes[shape] + ".png";
                    ImageIcon icon = new ImageIcon(fileName);

                    String cardResultPrompt = "Shape Perception:\n  You percieved"
                            + " \"" + shapes[choice] + "\"\n   The shape was \""
                            + shapes[shape] + "\"";

                    if (choice == shape) {
                        JOptionPane.showMessageDialog(null, cardResultPrompt + "\n"
                                + "Congratulations you have a good perception of"
                                + " shape!", "Card Result", 0, icon);
                        score++;
                    } 
                    
                    else {
                        JOptionPane.showMessageDialog(null, cardResultPrompt + "\n"
                                + "Sorry, you were incorrect this round",
                                "Card Result", 0, icon);
                    }

                    iterator++;

                }

                perceptions += 5;

                String resultPrompt = "You have entered " + perceptions + ""
                        + " perceptions,\n   your shape score is " + score;

                fiveMoreTrials = JOptionPane.showOptionDialog(null,
                        resultPrompt, "Results so Far", 0, 0, questionIcon,
                        continueOrQuit, continueOrQuit[0]);
                
            }
            
            JOptionPane.showMessageDialog(null, terminationPrompt,
                    "This Program will Now Exit", 0);
        }
    }
}
