package binarytreelab4.pkg2_lee;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;

/*
 * Name: Benedict Lee
 * Class: CSCI308-A-ADV DATA STRUCTURS,ALGORTHMS I, FALL 2022
 * Date: 07 OCT 2022 2000
 *  User interface class
 */

public class UserInterface_Lee {
    BinaryTreeNode_Lee.bTreeNode root;
    static int randomGeneratorCounter = 0;
    
    //Reads user input
    public static void Interface(BinaryTree_Lee tree) {
        System.out.println("---Welcome to the main menu.---");
        try (Scanner input = new Scanner(System.in)) {
            int option = 0;
            while (option != 6)
            {
                printMenuMessage();
                checkIntegerInput(input);
                option = input.nextInt();
                switch(option) {
                    case 1:
                        System.out.println(" 1 Display Contents\n");
                        if (tree.root == null) {
                            System.out.println("The list is empty! please add "
                                    + "to the list!\n");
                        } else {
                        System.out.print("Values: ");
                        BinaryTree_Lee.inOrderPrint(tree, tree.root);
                        }
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println(" 2 Add to the Contents\n");
                        System.out.println("Please input an integer you would"
                                + " like to store:");
                        checkIntegerInput(input);
                        int data = input.nextInt();
                        BinaryTree_Lee.insert(tree, tree.root, data);
                        BinaryTree_Lee.inOrder(tree, tree.root);
                        BinaryTree_Lee.setRankZero();
                        input.nextLine();
                        break;
                    case 3:
                        System.out.println(" 3 Remove from the Contents\n");
                        System.out.print("Please input an integer to remove: ");
                        int searchNumber = input.nextInt();
                        BinaryTree_Lee.remove(tree, tree.root, searchNumber);                        
                        BinaryTree_Lee.inOrder(tree, tree.root);
                        BinaryTree_Lee.setRankZero();
                        break;
                    case 4:
                        System.out.println(" 4 Generate random input into tree\n");
                        if (randomGeneratorCounter > 0) {
                            System.out.println("I am sorry, you have already "
                                    + "added a set of randomly generated numbers.");
                        } else {
                            random(tree);
                            System.out.println("A set of 50 random numbers have "
                                    + "been inserted into the tree.");
                            BinaryTree_Lee.inOrder(tree, tree.root);
                            BinaryTree_Lee.setRankZero();
                            randomGeneratorCounter++;
                        }
                        
                        break;
                    /*case 5:
                        System.out.println(" 5 Clear the contents\n");
                        break;*/
                    case 6:
                        System.out.println(" 6 Exit Program\n");
                        System.out.println("Thanks for using our program.");
                        System.exit(0);
                    default:
                        System.out.println("Error: " + option + " is not a valid "
                            + "choice please enter a new option.\n");
                        break;
                }
            }
        }
        catch(Exception e) {
            System.out.println("An unknown error occured, contact your administrator "
                + "at 850 - 555 - 4000.");
            System.exit(0);
        }
    }
    
    private static void random(BinaryTree_Lee tree) {
        Random randGen = new Random();
        int maximum = 1000;
        Set<Integer> generatedNumbers = new LinkedHashSet<>();
        while (generatedNumbers.size() != 50) {
            Integer nextNumber = randGen.nextInt(maximum) + 1;
            generatedNumbers.add(nextNumber);
        }
        ArrayList<Integer> numbers = new ArrayList<>(generatedNumbers);
        for(int i = 0; i < numbers.size(); i++) {
            BinaryTree_Lee.insert(tree, tree.root, numbers.get(i));
        }
    }
    
    // Checks for valid input
    public static void checkIntegerInput(Scanner input) {
        while(!input.hasNextInt()) {
            String inp = input.next();
            System.out.println("Error: " + inp + " is not a valid integer.\n");
            printMenuMessage();
        }
    }
    
    //Prints UI menu to console
    public static void printMenuMessage() {
        System.out.println("Please enter an option given below.");
        System.out.println("Option Operation Completed");
        System.out.println("------------------------------");
        System.out.println(" 1 Display Contents");
        System.out.println(" 2 Add to the Contents");
        System.out.println(" 3 Remove from the Contents");
        System.out.println(" 4 Generate random input into tree");
        //System.out.println(" 5 Clear the contents");
        System.out.println(" 6 Exit Program");
    }
    
    //Prints contents
    public static void printObject() {
        System.out.println("Contents: ");
    }
}
