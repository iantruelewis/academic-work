// 11/16/24
// Ian Lewis
// CSD 405
// Module 5 Assignment

/*
    Program 1:
    The purpose of this program is to use an ArrayList filled with a minimum of
    10 Strings. Using a ‘for-each’ loop to print the ArrayList collection. Then asking a
    user which element they would like to see again. Then, attempting to print the element
    in a try/catch format which will result in the element being display. If the element
    value received is invalid, the program will display a message that an Exception has
    been thrown displaying “Out of Bounds”. In this program, the use of Autoboxing/Auto-Unboxing
    is included, working with a user String input.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adds 10 Strings to ArrayList
        for (int i = 1; i <= 10; i++) {
            list.add("Item " + i);
        }

        // Uses a for-each loop to print all elements
        System.out.println("ArrayList contents:");
        for (String item : list) {
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element you want to see (0-9): ");

        // Reads user input
        String input = scanner.nextLine();
        try {
            // Autoboxing: Converts String to Integer
            int index = Integer.parseInt(input);

            // Displays selected element
            System.out.println("Element at index " + index + ": " + list.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }

        scanner.close();
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: w3schools.com, Article "Java ArrayList"
// Cite: geeksforgeeks.org, Article "ArrayList in Java"
// Cite: oracle.com, module "ArrayList (Java)"
// Cite: w3schools.com, Article "Java For Each Loop"
// Cite: geeksforgeeks.org, Article "For-each loop in Java"
// Cite: oracle.com, module "The For-Each Loop (Java)"
// Cite: w3schools.com, Article "Java Exceptions - Try...Catch"
// Cite: geeksforgeeks.org, Article "Exceptions in Java"
// Cite: oracle.com, Article "Lesson: Exceptions (Java)"
// Cite: geeksforgeeks.org, Article "Autoboxing and Unboxing in Java"
// Cite: javatpoint.com, Article, "Autoboxing and Unboxing: Java"