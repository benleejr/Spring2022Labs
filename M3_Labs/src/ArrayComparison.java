/* Purpose: Practice using two arrays to store, print, and compare the two arrays
 *  to each other.
 * Function: Program will initialize two arrays with a set array size and upper
 * and lower limit, print out the two arrays in a uniform manner, and compares the
 * integers in the arrays by value and printing out the number of highs each array
 * has compared to the other array as well as ties.
 * Benedict Lee & Cameron Boddie 
 */

import java.util.*;

public class ArrayComparison {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        
        int high_limit = 0;
        int low_limit = 0;
        int elements = 0;
        
        String highNumber = "Please enter an upper limit: ";
        String lowNumber = "Please enter a lower limit: ";
        String numberOfElements = "Please enter the number of rows you would like "
                + "to print out: ";
        
        System.out.print(numberOfElements);
        elements = keyboard.nextInt();
        System.out.print(highNumber);
        high_limit = keyboard.nextInt();
        System.out.print(lowNumber);
        low_limit = keyboard.nextInt();
               
        int[] firstArray = initializeArrays(high_limit, low_limit, elements);
        int[] secondArray = initializeArrays(high_limit, low_limit, elements);
        
        printTwoArrays(firstArray, secondArray);
        System.out.println();
        compareArrays(firstArray, secondArray);
                
    }
    
    public static void printTwoArrays(int[] array1, int[] array2) {
                
        for(int dex = 0; dex < array1.length; dex++) {
            
            String dexStr = String.format("Index %2d:  %3d  %3d\n", dex,
                    array1[dex], array2[dex]);
            
            System.out.print(dexStr);
            
        }
        
    }
    
    public static int[] initializeArrays (int high_limit, int low_limit, int elements) { 
        
        int[] arrayOfIntegers = new int [elements]; 
        Random randomGenerator = new Random();
        int numberValues = high_limit - low_limit +1; 
        
        for (int dex = 0; dex < elements; dex++) { 
            
            arrayOfIntegers[dex] = randomGenerator.nextInt(numberValues) + low_limit;                              
           
        }       
        
        return arrayOfIntegers;
    }
    
    public static void compareArrays (int[] array1, int[] array2) {
        
        int array1High=0;
        int array2High=0;
        int tie = 0;
                
        for (int index = 0; index < array1.length; index++) {
            
            if (array1[index] < array2[index]) {
                array2High++;
            }
            
            else if (array2[index] < array1[index]) {
                array1High++;
            }
            
            else {
                tie++;
            }
        
        }
        
        String result1 = "Array 1 has "+array1High+" highs";
        String result2 = "Array 2 has "+array2High+" highs";
        String result3 = "There are "+tie+" ties";
            
        System.out.print(result1+"\n"+result2+"\n"+result3+"\n");
        
    }     
         
}
