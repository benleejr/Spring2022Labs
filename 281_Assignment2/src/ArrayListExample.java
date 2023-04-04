import java.util.*;

public class ArrayListExample {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String namePrompt = "Please enter single name -->";
        String agePrompt = "Please enter age in whole years -->";
        
        ArrayList myList = new ArrayList();
        
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<Integer> ageList = new ArrayList<>();
        
        int counter = 0;
        while (counter < 3) {
            
            System.out.print(namePrompt);
            String name = keyboard.next();
            myList.add(name);
            nameList.add(name);
            
            System.out.print(agePrompt);
            int age = keyboard.nextInt();
            myList.add(age);
            ageList.add(age);
            
            counter++;
            
        }
        
        for (int index = 0; index < ageList.size(); index++) {
            System.out.println(nameList.get(index)+" is "+ageList.get(index));
            
            
        }
        
        System.out.println("\n");
        
        for (int index = 0; index < myList.size(); index++) {
            
            System.out.println(myList.get(index));
        }
        
        System.out.println("\n");
    }
    
}
