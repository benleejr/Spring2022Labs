/* M2_Lab3_RomanNumerals.java
 *
 * This program will accept user input of an integer, validate the integer
 * entered and produce the resultant roman numeral representation of the input 
 * integer.
 * 
 * Benedict Lee & Cameron Boddie
 * Last modified: 14 February 2022
 */

import java.util.*;

public class M2_Lab3_RomanNumerals {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String prompt = "\nPlease enter any integer in the range between 1 to "
                + "999."
                + "\nIf you would like to enter 325, input 325 using the keyboard"
                + "\nand press the enter key.\n"
                + "---->";
        
        System.out.print(prompt);
        
        int number = keyboard.nextInt();
        
        if (number>999 || number<1) {
            System.out.println("\nYou have entered an integer outside the specified"
                    + " range. This program will now terminate.");
            System.exit(0);
        }
        
        int originalNumber=number;
        
        int unitDigit = number%10;
        number = number/10;
        int tenthDigit = number%10;
        number = number/10;
        int hundredthDigit = number%10;
        
        System.out.print("\nThe isolated digits are: "+hundredthDigit+"    "
                +tenthDigit+"    "+ unitDigit+"\n\n");
        
        String romanNumeral = "";
        
        switch (hundredthDigit) {
            case 1:
                romanNumeral += "C";
                break;
            case 2:
                romanNumeral += "CC";
                break;
            case 3:
                romanNumeral += "CCC";
                break;
            case 4:
                romanNumeral += "CD";
                break;
            case 5:
                romanNumeral += "D";
                break;    
            case 6:
                romanNumeral += "DC";
                break;    
            case 7:
                romanNumeral += "DCC";
                break;    
            case 8:
                romanNumeral += "DCCC";
                break;
            case 9:
                romanNumeral += "CM";
                break;
            }
        
        switch (tenthDigit) {
            case 1:
                romanNumeral += "X";
                break;
            case 2:
                romanNumeral += "XX";
                break;
            case 3:
                romanNumeral += "XXX";
                break;
            case 4:
                romanNumeral += "XL";
                break;
            case 5:
                romanNumeral += "L";
                break;    
            case 6:
                romanNumeral += "LX";
                break;    
            case 7:
                romanNumeral += "LXX";
                break;    
            case 8:
                romanNumeral += "LXXX";
                break;
            case 9:
                romanNumeral += "XC";
                break;
            }
        
        switch (unitDigit) {
            case 1:
                romanNumeral += "I";
                break;
            case 2:
                romanNumeral += "II";
                break;
            case 3:
                romanNumeral += "III";
                break;
            case 4:
                romanNumeral += "IV";
                break;
            case 5:
                romanNumeral += "V";
                break;    
            case 6:
                romanNumeral += "VI";
                break;    
            case 7:
                romanNumeral += "VII";
                break;    
            case 8:
                romanNumeral += "VIII";
                break;
            case 9:
                romanNumeral += "IX";
                break;
            }
        
        System.out.println("The the value of "+originalNumber+" in roman "
                + "numerals is: "+romanNumeral);
    }
}
