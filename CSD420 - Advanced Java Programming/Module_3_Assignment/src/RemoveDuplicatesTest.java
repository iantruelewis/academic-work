// 01/19/25
// Ian Lewis
// CSD 420
// Module 3 Assignment

/*
    This program contains a static method that returns a new ArrayList.
        • The new ArrayList returned will contain all original values with no duplicates from the original ArrayList.
        • The Original ArrayList is filled with 50 random values from 1 to 20.
        • public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)

    Test code is written that ensures code functions correctly.
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RemoveDuplicatesTest {

    // Static method removes duplicates from ArrayList
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        // Uses HashSet to eliminate duplicates
        HashSet<E> set = new HashSet<>(list);
        // Converts HashSet back to ArrayList and returns it
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        // Creates ArrayList with 50 random values between 1 and 20
        ArrayList<Integer> originalList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            originalList.add(random.nextInt(20) + 1);
        }

        // Prints original list
        System.out.println("Original List:");
        System.out.println(originalList);

        // Removes duplicates using static method
        ArrayList<Integer> uniqueList = removeDuplicates(originalList);

        // Prints list after removing duplicates
        System.out.println("\nList After Removing Duplicates:");
        System.out.println(uniqueList);

        // Tests to ensure there are no duplicates in unique list
        boolean noDuplicates = uniqueList.size() == new HashSet<>(uniqueList).size();

        // Prints test results
        System.out.println("\nTest Result: " + (noDuplicates ? "PASS" : "FAIL"));
    }
}

// Cite: w3schools.com, module "Java ArrayList"
// Cite: oracle.com, module "ArrayList"
// Cite: geeksforgeeks.org, article "ArrayList in Java"
// Cite: w3schools.com, article "Java static Keyword"
// Cite: geeksforgeeks.org, article "Static Method in Java With Examples"
// Cite: geeksforgeeks.org, article "Static Method vs Instance Method in Java"
// Cite: geeksforgeeks.org, article "Java Program to Remove Duplicate Elements From the Array"
// Cite: geeksforgeeks.org, article "How to Remove Duplicates from ArrayList in Java"
// Cite: javatpoint.com, article "Java Program to remove duplicate element in an Array"
// Cite: geeksforgeeks.org, article "How to Add Random Number to an Array in Java?"
// Cite: tutorialspoint.com, article "Generate a random array of integers in Java"