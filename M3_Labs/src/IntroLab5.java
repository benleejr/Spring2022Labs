
import java.util.*;

public class IntroLab5 {
    
    public static void main(String[] args) {
        
        int highLimit = 10;
        int lowLimit = -10;
        int size = 15;
        
        int [] firstArray = initializeArray(highLimit, lowLimit, size);
        printArray(firstArray);
                
    }
    
    public static void printArray(int[] array) {
        
        for(int dex = 0; dex < array.length; dex++) {  //cannot user abbreviated form (iterator is implied)
            
            String dexStr = String.format("index %2d:  %3d\n", dex, array[dex]);
            
            System.out.print(dexStr);
            
        }
        
    }
    
    public static int[] initializeArray (int upperLimit, int lowerLimit, int num_elements) { //reference to array returned
        
        int[] arrayOfIntegers = new int [num_elements]; //instantiating array
        Random randomGenerator = new Random();
        int numberValues = upperLimit - lowerLimit +1; //inclusive range
        
        for (int dex = 0; dex < num_elements; dex++) { //full for loop abbreviated for loop is allowed as well
            
            arrayOfIntegers[dex] = randomGenerator.nextInt(numberValues) + lowerLimit;
            
        }
        
        return arrayOfIntegers; //method call
    }
    
}
