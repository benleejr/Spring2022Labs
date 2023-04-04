/* M1_Assignment1_BenedictLee_CameronBoddie.java
 * Program will simulate the dice game High-Low between the user and program
 * User is required to enter H for high or L for low after their dice roll 
   depending on whether they think if the program's dice roll will be lower or
   higher than the user's dice roll respectively
 * Program will then execute the second dice roll for the program and print
   "Congratulations, you called "lower" correctly and won!" if the user wins
   by calling Lower
   or "Congratulations, you called "higher" correctly and won!" if the user wins
   by calling Higher
 * Otherwise if the user lost, the program will print either
   "Sorry, you called "lower" incorrectly and lost."
   "Sorry, you called "higer" incorrectly and lost."
 * If both dice rolls have the same total value, then the program will print
   "It's a draw, the program rolled the same number."
 * Benedict Lee & Cameron Boddie
 * Date modified: February 1, 2022
 */

import java.util.*;

public class M1_Assignment1_BenedictLee_CameronBoddie {
    public static void main(String[] args) {
        
        System.out.println("This is the game High-Low involving 5 6-sided dice."
                +"\n\nLet Us Begin.\n");
        
        String dieLine1And2 = "+-----+ ";
        
        String die1Line2 = "|     | ";
        String die1Line3 = "|  o  | ";
        String die1Line4 = "|     | ";
        
        String die2Line2 = "| o   | ";
        String die2Line3 = "|     | ";
        String die2Line4 = "|   o | ";
        
        String die3Line2 = "| o   | ";
        String die3Line3 = "|  o  | ";
        String die3Line4 = "|   o | ";

        String die4Line2 = "| o o | ";
        String die4Line3 = "|     | ";
        String die4Line4 = "| o o | ";
        
        String die5Line2 = "| o o | ";
        String die5Line3 = "|  o  | ";
        String die5Line4 = "| o o | ";
      
        String die6Line2 = "| o o | ";
        String die6Line3 = "| o o | ";   
        String die6Line4 = "| o o | ";  
        
        Random randomDiceRoll = new Random();
        
        int roll1 = randomDiceRoll.nextInt(6)+1;
        int roll2 = randomDiceRoll.nextInt(6)+1;
        int roll3 = randomDiceRoll.nextInt(6)+1;
        int roll4 = randomDiceRoll.nextInt(6)+1;
        int roll5 = randomDiceRoll.nextInt(6)+1;
        
        int total1 = roll1+roll2+roll3+roll4+roll5;
        
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;
        
        System.out.println("You rolled the following values:\n");
        
        int n=1;
        
        while (n<=5)
        {
            System.out.print(dieLine1And2);
            n = n + 1;
        }
        
        System.out.println("");
        

        if (roll1==n1)
            System.out.print(die1Line2);
        else if (roll1==n2)
            System.out.print(die2Line2);
        else if (roll1==n3)
            System.out.print(die3Line2);
        else if (roll1==n4)
            System.out.print(die4Line2);
        else if (roll1==n5)
            System.out.print(die5Line2);
        else if (roll1==n6)
            System.out.print(die6Line2);

        if (roll2==n1)
            System.out.print(die1Line2);
        else if (roll2==n2)
            System.out.print(die2Line2);
        else if (roll2==n3)
            System.out.print(die3Line2);
        else if (roll2==n4)
            System.out.print(die4Line2);
        else if (roll2==n5)
            System.out.print(die5Line2);
        else if (roll2==n6)
            System.out.print(die6Line2);

        if (roll3==n1)
            System.out.print(die1Line2);
        else if (roll3==n2)
            System.out.print(die2Line2);
        else if (roll3==n3)
            System.out.print(die3Line2);
        else if (roll3==n4)
            System.out.print(die4Line2);
        else if (roll3==n5)
            System.out.print(die5Line2);
        else if (roll3==n6)
            System.out.print(die6Line2);
        if (roll4==n1)
            System.out.print(die1Line2);
        else if (roll4==n2)
            System.out.print(die2Line2);
        else if (roll4==n3)
            System.out.print(die3Line2);
        else if (roll4==n4)
            System.out.print(die4Line2);
        else if (roll4==n5)
            System.out.print(die5Line2);
        else if (roll4==n6)
            System.out.print(die6Line2);

        if (roll5==n1)
            System.out.print(die1Line2);
        else if (roll5==n2)
            System.out.print(die2Line2);
        else if (roll5==n3)
            System.out.print(die3Line2);
        else if (roll5==n4)
            System.out.print(die4Line2);
        else if (roll5==n5)
            System.out.print(die5Line2);
        else if (roll5==n6)
            System.out.print(die6Line2);
            
            System.out.println("");

        if (roll1==n1)
            System.out.print(die1Line3);
        else if (roll1==n2)
            System.out.print(die2Line3);
        else if (roll1==n3)
            System.out.print(die3Line3);
        else if (roll1==n4)
            System.out.print(die4Line3);
        else if (roll1==n5)
            System.out.print(die5Line3);
        else if (roll1==n6)
            System.out.print(die6Line3);

        if (roll2==n1)
            System.out.print(die1Line3);
        else if (roll2==n2)
            System.out.print(die2Line3);
        else if (roll2==n3)
            System.out.print(die3Line3);
        else if (roll2==n4)
            System.out.print(die4Line3);
        else if (roll2==n5)
            System.out.print(die5Line3);
        else if (roll2==n6)
            System.out.print(die6Line3);

        if (roll3==n1)
            System.out.print(die1Line3);
        else if (roll3==n2)
            System.out.print(die2Line3);
        else if (roll3==n3)
            System.out.print(die3Line3);
        else if (roll3==n4)
            System.out.print(die4Line3);
        else if (roll3==n5)
            System.out.print(die5Line3);
        else if (roll3==n6)
            System.out.print(die6Line3);

        if (roll4==n1)
            System.out.print(die1Line3);
        else if (roll4==n2)
            System.out.print(die2Line3);
        else if (roll4==n3)
            System.out.print(die3Line3);
        else if (roll4==n4)
            System.out.print(die4Line3);
        else if (roll4==n5)
            System.out.print(die5Line3);
        else if (roll4==n6)
            System.out.print(die6Line3);

        if (roll5==n1)
            System.out.print(die1Line3);
        else if (roll5==n2)
            System.out.print(die2Line3);
        else if (roll5==n3)
            System.out.print(die3Line3);
        else if (roll5==n4)
            System.out.print(die4Line3);
        else if (roll5==n5)
            System.out.print(die5Line3);
        else if (roll5==n6)
            System.out.print(die6Line3);
        
        System.out.println("");

        if (roll1==n1)
            System.out.print(die1Line4);
        else if (roll1==n2)
            System.out.print(die2Line4);
        else if (roll1==n3)
            System.out.print(die3Line4);
        else if (roll1==n4)
            System.out.print(die4Line4);
        else if (roll1==n5)
            System.out.print(die5Line4);
        else if (roll1==n6)
            System.out.print(die6Line4);

        if (roll2==n1)
            System.out.print(die1Line4);
        else if (roll2==n2)
            System.out.print(die2Line4);
        else if (roll2==n3)
            System.out.print(die3Line4);
        else if (roll2==n4)
            System.out.print(die4Line4);
        else if (roll2==n5)
            System.out.print(die5Line4);
        else if (roll2==n6)
            System.out.print(die6Line4);
  
        if (roll3==n1)
            System.out.print(die1Line4);
        else if (roll3==n2)
            System.out.print(die2Line4);
        else if (roll3==n3)
            System.out.print(die3Line4);
        else if (roll3==n4)
            System.out.print(die4Line4);
        else if (roll3==n5)
            System.out.print(die5Line4);
        else if (roll3==n6)
            System.out.print(die6Line4);

        if (roll4==n1)
            System.out.print(die1Line4);
        else if (roll4==n2)
            System.out.print(die2Line4);
        else if (roll4==n3)
            System.out.print(die3Line4);
        else if (roll4==n4)
            System.out.print(die4Line4);
        else if (roll4==n5)
            System.out.print(die5Line4);
        else if (roll4==n6)
            System.out.print(die6Line4);

        if (roll5==n1)
            System.out.print(die1Line4);
        else if (roll5==n2)
            System.out.print(die2Line4);
        else if (roll5==n3)
            System.out.print(die3Line4);
        else if (roll5==n4)
            System.out.print(die4Line4);
        else if (roll5==n5)
            System.out.print(die5Line4);
        else if (roll5==n6)
            System.out.print(die6Line4);

        System.out.println("");
        
        n = 1;
        
        while (n<=5)
        {
            System.out.print(dieLine1And2);
            n = n + 1;
        }
        
        System.out.println("\n\nDie 1 is "+roll1);
        System.out.println("Die 2 is "+roll2);
        System.out.println("Die 3 is "+roll3);
        System.out.println("Die 4 is "+roll4);
        System.out.println("Die 5 is "+roll5);
        System.out.println("\nThe total is "+total1);
        
        System.out.print("\nPlease enter H or h if you believe the program's "
                + "\n   roll will be higher than your roll.\nOr enter L or l "
                + "if you believe the program's roll will "
                + "\n   be lower than your roll \n---> ");
        
        Scanner keyboardInput = new Scanner (System.in);
        
        String highOrLow = keyboardInput.next();
        
        roll1 = randomDiceRoll.nextInt(6)+1;
        roll2 = randomDiceRoll.nextInt(6)+1;
        roll3 = randomDiceRoll.nextInt(6)+1;
        roll4 = randomDiceRoll.nextInt(6)+1;
        roll5 = randomDiceRoll.nextInt(6)+1;
        int total2 = roll1+roll2+roll3+roll4+roll5;
        
        System.out.println("\nThe program rolled the following values:\n");
        
        n=1;
        
                while (n<=5)
        {
            System.out.print(dieLine1And2);
            n = n + 1;
        }
        
        System.out.println("");
        

        if (roll1==n1)
            System.out.print(die1Line2);
        else if (roll1==n2)
            System.out.print(die2Line2);
        else if (roll1==n3)
            System.out.print(die3Line2);
        else if (roll1==n4)
            System.out.print(die4Line2);
        else if (roll1==n5)
            System.out.print(die5Line2);
        else if (roll1==n6)
            System.out.print(die6Line2);

        if (roll2==n1)
            System.out.print(die1Line2);
        else if (roll2==n2)
            System.out.print(die2Line2);
        else if (roll2==n3)
            System.out.print(die3Line2);
        else if (roll2==n4)
            System.out.print(die4Line2);
        else if (roll2==n5)
            System.out.print(die5Line2);
        else if (roll2==n6)
            System.out.print(die6Line2);

        if (roll3==n1)
            System.out.print(die1Line2);
        else if (roll3==n2)
            System.out.print(die2Line2);
        else if (roll3==n3)
            System.out.print(die3Line2);
        else if (roll3==n4)
            System.out.print(die4Line2);
        else if (roll3==n5)
            System.out.print(die5Line2);
        else if (roll3==n6)
            System.out.print(die6Line2);
        if (roll4==n1)
            System.out.print(die1Line2);
        else if (roll4==n2)
            System.out.print(die2Line2);
        else if (roll4==n3)
            System.out.print(die3Line2);
        else if (roll4==n4)
            System.out.print(die4Line2);
        else if (roll4==n5)
            System.out.print(die5Line2);
        else if (roll4==n6)
            System.out.print(die6Line2);

        if (roll5==n1)
            System.out.print(die1Line2);
        else if (roll5==n2)
            System.out.print(die2Line2);
        else if (roll5==n3)
            System.out.print(die3Line2);
        else if (roll5==n4)
            System.out.print(die4Line2);
        else if (roll5==n5)
            System.out.print(die5Line2);
        else if (roll5==n6)
            System.out.print(die6Line2);
            
            System.out.println("");

        if (roll1==n1)
            System.out.print(die1Line3);
        else if (roll1==n2)
            System.out.print(die2Line3);
        else if (roll1==n3)
            System.out.print(die3Line3);
        else if (roll1==n4)
            System.out.print(die4Line3);
        else if (roll1==n5)
            System.out.print(die5Line3);
        else if (roll1==n6)
            System.out.print(die6Line3);

        if (roll2==n1)
            System.out.print(die1Line3);
        else if (roll2==n2)
            System.out.print(die2Line3);
        else if (roll2==n3)
            System.out.print(die3Line3);
        else if (roll2==n4)
            System.out.print(die4Line3);
        else if (roll2==n5)
            System.out.print(die5Line3);
        else if (roll2==n6)
            System.out.print(die6Line3);

        if (roll3==n1)
            System.out.print(die1Line3);
        else if (roll3==n2)
            System.out.print(die2Line3);
        else if (roll3==n3)
            System.out.print(die3Line3);
        else if (roll3==n4)
            System.out.print(die4Line3);
        else if (roll3==n5)
            System.out.print(die5Line3);
        else if (roll3==n6)
            System.out.print(die6Line3);

        if (roll4==n1)
            System.out.print(die1Line3);
        else if (roll4==n2)
            System.out.print(die2Line3);
        else if (roll4==n3)
            System.out.print(die3Line3);
        else if (roll4==n4)
            System.out.print(die4Line3);
        else if (roll4==n5)
            System.out.print(die5Line3);
        else if (roll4==n6)
            System.out.print(die6Line3);

        if (roll5==n1)
            System.out.print(die1Line3);
        else if (roll5==n2)
            System.out.print(die2Line3);
        else if (roll5==n3)
            System.out.print(die3Line3);
        else if (roll5==n4)
            System.out.print(die4Line3);
        else if (roll5==n5)
            System.out.print(die5Line3);
        else if (roll5==n6)
            System.out.print(die6Line3);
        
        System.out.println("");

        if (roll1==n1)
            System.out.print(die1Line4);
        else if (roll1==n2)
            System.out.print(die2Line4);
        else if (roll1==n3)
            System.out.print(die3Line4);
        else if (roll1==n4)
            System.out.print(die4Line4);
        else if (roll1==n5)
            System.out.print(die5Line4);
        else if (roll1==n6)
            System.out.print(die6Line4);

        if (roll2==n1)
            System.out.print(die1Line4);
        else if (roll2==n2)
            System.out.print(die2Line4);
        else if (roll2==n3)
            System.out.print(die3Line4);
        else if (roll2==n4)
            System.out.print(die4Line4);
        else if (roll2==n5)
            System.out.print(die5Line4);
        else if (roll2==n6)
            System.out.print(die6Line4);
  
        if (roll3==n1)
            System.out.print(die1Line4);
        else if (roll3==n2)
            System.out.print(die2Line4);
        else if (roll3==n3)
            System.out.print(die3Line4);
        else if (roll3==n4)
            System.out.print(die4Line4);
        else if (roll3==n5)
            System.out.print(die5Line4);
        else if (roll3==n6)
            System.out.print(die6Line4);

        if (roll4==n1)
            System.out.print(die1Line4);
        else if (roll4==n2)
            System.out.print(die2Line4);
        else if (roll4==n3)
            System.out.print(die3Line4);
        else if (roll4==n4)
            System.out.print(die4Line4);
        else if (roll4==n5)
            System.out.print(die5Line4);
        else if (roll4==n6)
            System.out.print(die6Line4);

        if (roll5==n1)
            System.out.print(die1Line4);
        else if (roll5==n2)
            System.out.print(die2Line4);
        else if (roll5==n3)
            System.out.print(die3Line4);
        else if (roll5==n4)
            System.out.print(die4Line4);
        else if (roll5==n5)
            System.out.print(die5Line4);
        else if (roll5==n6)
            System.out.print(die6Line4);

        System.out.println("");
        
        n = 1;
        
        while (n<=5)
        {
            System.out.print(dieLine1And2);
            n = n + 1;
        }
        
        System.out.println("\n\nDie 1 is "+roll1);
        System.out.println("Die 2 is "+roll2);
        System.out.println("Die 3 is "+roll3);
        System.out.println("Die 4 is "+roll4);
        System.out.println("Die 5 is "+roll5);
        System.out.println("\nThe total is "+total2);
        
        
        if ((highOrLow.equals("L") || highOrLow.equals("l") && total1 > total2))            
        {
            System.out.println("\nCongratulations, you called \"lower\" correctly and won!");
        }
        
        else if ((highOrLow.equals("H") || highOrLow.equals("h") && total1 < total2))  
        {
            System.out.println("\nCongratulations, you called \"higher\" correctly and won!");
        }
        
        else if ((highOrLow.equals("L") || highOrLow.equals("l") && total1 < total2))
        {
            System.out.println("\nSorry, you called \"lower\" incorrectly and lost.");
        }
        
        else if ((highOrLow.equals("H") || highOrLow.equals("h") && total1 > total2))
        {
            System.out.println("\nSorry, you called \"higher\" incorrectly and lost.");
        }
                        
        else if ((highOrLow.equals("L") || highOrLow.equals("l") && total1 == total2) ||
               (highOrLow.equals("H") || highOrLow.equals("h") 
                && total1 == total2)) 
        {            
            System.out.println("\nIt's a draw, the program rolled the same number.");
        }

            
        System.out.println("\nThis program will now terminate.");
    }
}
