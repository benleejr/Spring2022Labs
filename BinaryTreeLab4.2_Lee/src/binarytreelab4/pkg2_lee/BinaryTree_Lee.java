package binarytreelab4.pkg2_lee;

import java.util.Objects;

/*
 * Name: Benedict Lee
 * Class: CSCI308-A-ADV DATA STRUCTURS,ALGORTHMS I, FALL 2022
 * Date: 07 OCT 2022 2000
 *  Class for manipulating Binary Tree
 */
public class BinaryTree_Lee {

    BinaryTreeNode_Lee.bTreeNode root;
    BinaryTreeNode_Lee.bTreeNode parent, left, right;
    static int rank;

    //Method for inserting into binary tree when user chooses to add to contents
    public static void insert(BinaryTree_Lee tree, BinaryTreeNode_Lee.bTreeNode currNode,
            int data) {
        if (!Objects.isNull(tree)) {
            BinaryTreeNode_Lee.bTreeNode newNode = new BinaryTreeNode_Lee.bTreeNode(data);
            if (tree.root == null) {
                tree.root = newNode;
            } else if (newNode.data < currNode.data) {
                if (currNode.left != null) {
                    insert(tree, currNode.left, data);
                } else {
                    currNode.left = newNode;
                    newNode.parent = currNode;
                }
            } else if (newNode.data > currNode.data) {
                if (currNode.right != null) {
                    insert(tree, currNode.right, data);
                } else {
                    currNode.right = newNode;
                    newNode.parent = currNode;
                }
            } else if (newNode.data == currNode.data) {
                System.out.println("An node with the value " + newNode.data
                        + " already exists. Please check your input");
            }
        } else {
            System.out.println("Error: There is a problem with the list.");
            System.exit(0);
        }
    }

    //Recurses through tree and assigns inOrderRank
    static void inOrder(BinaryTree_Lee tree, BinaryTreeNode_Lee.bTreeNode currNode) {
        if (!Objects.isNull(tree)) {
            if (currNode.left != null) {
                inOrder(tree, currNode.left);
            }
            currNode.setInOrderRank(rank++);
            if (currNode.right != null) {
                inOrder(tree, currNode.right);
            }
        } else {
            System.out.println("Error: There is a problem with the list.");
            System.exit(0);
        }
    }

    //Prints binary tree in order
    static void inOrderPrint(BinaryTree_Lee tree, BinaryTreeNode_Lee.bTreeNode currNode) {
        if (!Objects.isNull(tree)) {
            if (currNode.left != null) {
                inOrderPrint(tree, currNode.left);
            }
            System.out.print(currNode.data + " ");
            if (currNode.right != null) {
                inOrderPrint(tree, currNode.right);
            }
        } else {
            System.out.print("Error: There is a problem with the list.");
            System.exit(0);
        }
    }

    //removes integer specified by user
    public static BinaryTreeNode_Lee.bTreeNode remove(BinaryTree_Lee tree,
            BinaryTreeNode_Lee.bTreeNode currNode, int number) {
        try {
            if (tree.root == null) {
                System.out.println("The tree is empty!");
                return null;
            } else if (number < currNode.data) {
                currNode.left = remove(tree, currNode.left, number);
            } else if (number > currNode.data) {
                currNode.right = remove(tree, currNode.right, number);
            } else {
                if (currNode.left == null && currNode.right == null) {                    
                    return null;
                } else if (currNode.left == null) {                    
                    return currNode.right;                    
                } else if (currNode.right == null) {
                    return currNode.left;                    
                } else 
                currNode.data = nextLargest(tree, currNode.right);
                currNode.right = remove(tree, currNode.right, currNode.data);
                return currNode;
            }
            return currNode;
        } catch (Exception e) {
            System.out.println("The integer you are looking for does not exist.");
            return null;
        }
    }

    //Recurses left until the next largest node is found
    private static int nextLargest(BinaryTree_Lee tree,
            BinaryTreeNode_Lee.bTreeNode currNode) {
        int number = currNode.data;
        while (currNode.left != null) {
            number = currNode.left.data;
            currNode = currNode.left;
        }
        return number;
    }

    public static void setRankZero() {
        rank = -1;
    }
}
