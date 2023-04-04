/*
 * Accepting user input of two integers that represent the upper and lower range
  for random output.
 * User is expected to enter a lower bound integer and an upper bound integer 
  that is larger than the lower bound.
 * Program will output 10 randomly generated integers between the lower and upper
  bound integers entered by the user.
  Benedict Lee & Cameron Boddie
  Last Opened: 28 January 2022
*/

import java.util.*;

public class M1_Lab2 {
    
    public static void main(String[] args) {
        
        Scanner keyboardInput = new Scanner (System.in);
        
        String prompt = "Please enter a lower bound integer between 50 to 61, "
                + "1500 to 1700, and -5 to 5.\nFor example, if you want to "
                + "input 53, type 53 into the console: ";
        System.out.print(prompt+" ");
        int lowerBound = keyboardInput.nextInt();
        
        prompt = "\nPlease enter a lower bound integer between 50 to 61, "
                + "1500 to 1700, and -5 to 5.\nFor example, if you want to "
                + "input 53, type 53 into the console:";
        System.out.print(prompt+" ");
        int upperBound = keyboardInput.nextInt();
        
        Random randomNumber = new Random();
        
        int rand1 = randomNumber.nextInt(upperBound-lowerBound+1)+lowerBound;
        int rand2 = randomNumber.nextInt(upperBound-lowerBound+1)+lowerBound;
        int rand3 = randomNumber.nextInt(upperBound-lowerBound+1)+lowerBound;
        int rand4 = randomNumber.nextInt(upperBound-lowerBound+1)+lowerBound;
        int rand5 = randomNumber.nextInt(upperBound-lowerBound+1)+lowerBound;
        int rand6 = randomNumber.nextInt(upperBound-lowerBound+1)+lowerBound;
        int rand7 = randomNumber.nextInt(upperBound-lowerBound+1)+lowerBound;
        int rand8 = randomNumber.nextInt(upperBound-lowerBound+1)+lowerBound;
        int rand9 = randomNumber.nextInt(upperBound-lowerBound+1)+lowerBound;
        int rand10 = randomNumber.nextInt(upperBound-lowerBound+1)+lowerBound;
        
        System.out.print("\nRandom number: "+rand1+"\n");
        System.out.print("Random number: "+rand2+"\n");
        System.out.print("Random number: "+rand3+"\n");
        System.out.print("Random number: "+rand4+"\n");
        System.out.print("Random number: "+rand5+"\n");
        System.out.print("Random number: "+rand6+"\n");
        System.out.print("Random number: "+rand7+"\n");
        System.out.print("Random number: "+rand8+"\n");
        System.out.print("Random number: "+rand9+"\n");
        System.out.print("Random number: "+rand10+"\n");
        
        
    }
    
}
