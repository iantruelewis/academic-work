// 09/19/2024
// Ian Lewis
// Module 7 Assignment

/*
 The purpose of this program is to write a method that checks whether
 a user's input string is a valid password.

 Suppose the password rules are as follows:
    1. A password must have at least eight characters.
    2. A password must contain both letters and digits.
    3. A password must contain at least one uppercase character.
    4. A password must contain at least one lowercase character.
 */


import java.util.Scanner;

public class PasswordValidator {

    // Method checks if a password is valid
    public static boolean isValidPassword(String password) {
        // Checks if password has at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        // Loops through each character in password
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Returns true if all conditions are met
        return hasUpperCase && hasLowerCase && hasDigit;
    }

    public static void main(String[] args) {
        // Creates a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompts user to enter password
        System.out.print("Enter password: ");
        String userInput = scanner.nextLine();

        // Checks if the input password is valid
        if (isValidPassword(userInput)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Error: Password is invalid. \n \nA valid password must contain: \n • At least 8 characters \n • Contain both letters and digits \n • Include one uppercase letter \n • Include one lowercase letter");

        }

        // Closes scanner to prevent resource leaks
        scanner.close();
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: oracle.com, article "How to Use Password Fields"
// Cite: dzone.com, article "Secure Password Hashing in Java: Best Practices and Code Examples"
// Cite: happycoding.io, article "Secure Password Storage"
// Cite: sentry.io, article "Why is char preferred over String for passwords?"
// Cite: geeksforgeeks.org, article "Learn more
// Cite: geeksforgeeks.org, article "How to validate a Password using Regular Expressions in Java"
// Cite: w3schools.com, article "Java User Input (Scanner)"
// Cite: geeksforgeeks.org, article "Loops in Java"