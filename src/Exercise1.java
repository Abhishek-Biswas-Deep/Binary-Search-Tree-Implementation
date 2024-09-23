/**
 * This class is acting as the demo class. It creates a binary search tree which stores integers from user input.
 * This class also searches and prints the max, min and the expected output.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        //implementing the scanner
        Scanner in = new Scanner(System.in);

        //Creating binary search tree
        BinarySearchTree<Integer> input = new BinarySearchTree<Integer>();

        //Output
        System.out.print("Enter int or '0': ");

        //Prompting the user to enter integers
        int inputs = in.nextInt();

        //Using a loop that stops if the integer entered is 0.
        //The loop also inserts the integers and prints.
        while (inputs != 0) {
            input.insert(inputs);
            System.out.print("Enter int or '0': ");
            inputs = in.nextInt();
        }

        //Output- printing the maximum integer
        System.out.println("The max data value in the BST is: " + input.findMax());

        //Output- printing the minimum integer
        System.out.println("The min data value in the BST is: " + input.findMin());

        //Output
        System.out.print("What key would you like to search for? ");

        //Prompting the user to type in the integer that needs to be searched.
        inputs = in.nextInt();

        //Using if and else to check if the integer exists or not
        //If it exists, then it prints "Found!"
        //If it does not exist, it prints "Sorry not found."
        if (input.recursiveSearch(inputs).getData().equals(inputs)) {
            System.out.println("Found!");
        } else {
            System.out.println("Sorry not found.");
        }

    }
}
