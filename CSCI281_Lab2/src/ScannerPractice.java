/*
  Practice with SCANNERS and RANDOM and Constants
  B. Lee
  12/20/2020
*/
import java.util.*;

public class ScannerPractice {
    
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner (System.in);
        String prompt = "\nPlease enter any integer in the range of 1 to 9999\n"
                + "If you want to enter 55, simply type in 55 and press the enter\n"
                + "key \n--> ";
        //System.out.print(prompt);
        //int number = keyboardScanner.nextInt();
        //System.out.println("You entered "+number+"\n");
        
        Random randGen = new Random();
        
        System.out.println("Random number: "+(randGen.nextInt(10)+1)+"\n");
        System.out.println("Random number: "+(randGen.nextInt(10)+1)+"\n");
        System.out.println("Random number: "+(randGen.nextInt(10)+1)+"\n");
        System.out.println("Random number: "+(randGen.nextInt(10)+1)+"\n");
        System.out.println("Random number: "+(randGen.nextInt(10)+1)+"\n");
        System.out.println("Random number: "+(randGen.nextInt(10)+1)+"\n");
        System.out.println("Random number: "+(randGen.nextInt(10)+1)+"\n");
        System.out.println("Random number: "+(randGen.nextInt(10)+1)+"\n");
        System.out.println("Random number: "+(randGen.nextInt(10)+1)+"\n");
        System.out.println("Random number: "+(randGen.nextInt(10)+1)+"\n");
        System.out.println("Random number: "+(randGen.nextInt(10)+1)+"\n");
        
        /*prompt = "\nPlease enter any decimal number in the range of "
        + "1 to 999\n"
        + "If you want to enter 3.14, simply type in 3.14 and press "
        + "the enter key \n--> ";
        System.out.print(prompt);
        double decimalNumber = keyboardScanner.nextDouble();
        System.out.println("\nYour decimal number is "+decimalNumber+"\n");
        
        prompt = "\nPlease enter your favorite quote.\n"
                + "If your quote is \"Carpe diem\" type the words in and press\n"
                + "the enter key"
                + "\n--> ";
        System.out.print(prompt);
        keyboardScanner.nextLine(); //Preemptive new line
        String quote = keyboardScanner.nextLine();
        System.out.println("\nYour quote is: \""+quote+"\"\n");
        */
        
        
        
    }
}
