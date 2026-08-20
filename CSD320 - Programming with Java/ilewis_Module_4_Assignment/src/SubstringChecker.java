// 08/29/2024
// Ian Lewis
// Module 4 Assignment

/*
 The purpose of this program is to prompt a user to enter two strings and then check
 the strings entered and report if either the first string is a substring of the
 second string, or if the second string is a substring of the first string.
*/


import java.util.Scanner;

public class SubstringChecker {
    public static void main(String[] args) {
        // Creates a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Prompts user to enter first string
        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();

        // Prompts user to enter second string
        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();

        // Checks if first string is a substring of second string
        if (string1.contains(string2)) {
            System.out.println("\"" + string2 + "\" is a substring of \"" + string1 + "\".");
        }
        // Checks if second string is a substring of first string
        else if (string2.contains(string1)) {
            System.out.println("\"" + string1 + "\" is a substring of \"" + string2 + "\".");
        }
        // If neither string is a substring of the other
        else {
            System.out.println("Neither string is a substring of the other.");
        }

        // Closes the scanner
        scanner.close();
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: w3schools.com, article "Java User Input (Scanner)"
// Cite: w3schools.com, article "Java String substring() Method"
// Cite: geeksforgeeks.org, article "Substring in Java"
// Cite: javatpoint.com, article "Java String compare"
// City: oracle.com, article "Comparing Strings and Portions of Strings"