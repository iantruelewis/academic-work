// 08/28/2024
// Ian Lewis
// Module 3 Assignment

/*
 The purpose of this program is to simulate the popular game titled “Rock-Paper-Scissors.”
 The program randomly generates the numbers of 1, 2, or 3 with 1 being Rock, 2 being Paper,
 and 3 being Scissors. Then, the program prompts the user to enter a value of 1, 2, or 3.
 Next, the program displays a clear readable message displaying both the computer’s selection,
 the user’s selection, and the results.
*/


import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Creates Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Creates Random object to generate random numbers
        Random random = new Random();

        // Generates a random number between 1 and 3 for the computer's selection
        int computerChoice = random.nextInt(3) + 1;

        // Prompts the user to enter their choice
        System.out.println("Enter your selection: 1 for Rock, 2 for Paper, 3 for Scissors:");
        int userChoice = scanner.nextInt();

        // Displays the computer's choice
        System.out.println("Computer's selection: " + convertChoiceToString(computerChoice));
        // Displays the user's choice
        System.out.println("Your selection: " + convertChoiceToString(userChoice));

        // Determines and displays the result
        if (userChoice == computerChoice) {
            System.out.println("It's a TIE!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You WIN!");
        } else {
            System.out.println("You LOSE!");
        }

        // Closes scanner
        scanner.close();
    }

    // Method to convert the choice number to a readable string
    public static String convertChoiceToString(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid selection";
        };
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: w3schools.com, article "Java User Input (Scanner)"
// Cite: w3schools.com, article "Java Math random() Method"
// Cite: geeksforgeeks.org, article "Java.util.Random class in Java"
// Cite: oracle.com, article "Class Random"
// Cite: oracle.com, article "Class Choice"
// Cite: stackoverflow.com, article "How to convert Optional<Object> to Optional<String>"
// Cite: wikipedia.org, article "Rock paper scissors"