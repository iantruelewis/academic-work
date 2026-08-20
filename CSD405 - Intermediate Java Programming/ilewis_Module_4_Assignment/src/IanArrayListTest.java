// 11/09/24
// Ian Lewis
// CSD 405
// Module 4 Assignment

/* The purpose of this program is to create a class titled <yourName>ArrayListTest .
Examples:
    • TomArrayListTest
    • SueArrayListTest
    • CindyArrayListTest
    • Etc.

This class contains:
    • A method that receives an ArrayList populated with an Integer data type holding the integers received from user input.
    • The user input accepts Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList.
    • The ArrayList is then to be sent to the method.
    • The method then returns the largest value in the ArrayList.
    • If the ArrayList is sent in empty, the method returns 0.
    • The method signature is: public static Integer max (ArrayList list).
    • Has additional code for testing method.
    • The method returns the largest value that is displayed to the user.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class IanArrayListTest {

    // Method finds largest number in list
    public static Integer max(ArrayList<Integer> list) {
        // If list is empty, returns 0
        if (list.isEmpty()) {
            return 0;
        }

        // Starts with first number as the maximum
        Integer maxValue = list.get(0);

        // Loops through each number in list to find the largest
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue; // Returns largest value found
    }

    public static void main(String[] args) {
        // Scanner reads user input
        Scanner scanner = new Scanner(System.in);

        // Creates an ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 0 to end):");

        // Loops to get numbers from user
        while (true) {
            int input = scanner.nextInt(); // Reads an integer
            numbers.add(input); // Adds it to list
            if (input == 0) {
                break; // Stops if user enters 0
            }
        }

        // Calls max method and prints largest number
        Integer largestValue = max(numbers);
        System.out.println("The largest value in the list is: " + largestValue);

        scanner.close();
    }
}


// Cite: w3schools.com, module "Java Tutorial"
// Cite: w3schools.com, Article "Java ArrayList"
// Cite: geeksforgeeks.org, Article "ArrayList in Java"
// Cite: oracle.com, module "ArrayList (Java)"
// Cite: javatpoint.com, Article "Java Integer max() Method"
// Cite: geeksforgeeks.org, Article "Integer.MAX_VALUE and Integer.MIN_VALUE in Java"
// CIte: geeksforgeeks.org, Article "Java Program to Empty an ArrayList in Java"
