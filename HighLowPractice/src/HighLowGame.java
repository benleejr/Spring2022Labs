/* 

 */
import java.util.*;

public class HighLowGame {
    public static void main(String[] args) {
        
        Scanner keyboardInput = new Scanner(System.in);
        String introduction = "Welcome to the High Low Game";
        
        System.out.println(introduction);
        
        Random randomNumber = new Random();
        
        int random = randomNumber.nextInt(101);
        
        String prompt = "Please guess an integer between 1 - 100. Enter 69 if "
                + "your guess is 69\n--> ";
        
        System.out.print(prompt);
        
        int userGuess = keyboardInput.nextInt();
        
        if (userGuess==random)
            System.out.println("Congratulations, you guessed correctly!");
            
    }
}
