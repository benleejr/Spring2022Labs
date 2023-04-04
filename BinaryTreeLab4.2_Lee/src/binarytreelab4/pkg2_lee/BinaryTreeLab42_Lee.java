package binarytreelab4.pkg2_lee;

import java.util.Objects;

/*
 * Name: Benedict Lee
 * Class: CSCI308-A-ADV DATA STRUCTURS,ALGORTHMS I, FALL 2022
 * Date: 07 OCT 2022 2000
 *  Driver class for Binary Tree lab
 */

public class BinaryTreeLab42_Lee {

    public static void main(String[] args) {
        BinaryTree_Lee tree = new BinaryTree_Lee();
        if (!Objects.isNull(tree)) {
            UserInterface_Lee.Interface(tree);
        } else {
            System.out.println("Error: There is a problem with the list.");
            System.exit(0);
        }
    }
    
    
}
