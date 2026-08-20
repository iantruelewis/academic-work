// 10/03/2024
// Ian Lewis
// Module 9 Assignment

/*
 The purpose of this program is to read and fill an array with 20 integers.
 Then, using the array elements, calculate the data to find and display:

    1. The highest value entered.
    2. The lowest value entered.
    3. The average of the numbers entered.
    4. The sum of the numbers entered.

The program then displays this information in a readable way making the data easy to understand.
*/

import java.util.Scanner;

public class ArrayDataCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int sum = 0;
        int highest, lowest;

        // Reads 20 integers from user and stores them in array
        System.out.println("Please enter 20 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Calculates sum while reading numbers
        }

        // Initializes highest and lowest values
        highest = lowest = numbers[0];

        // Finds highest and lowest values
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        // Calculates average
        double average = (double) sum / numbers.length;

        // Displays results
        System.out.println("\nSummary of the data:");
        System.out.println("----------------------------");
        System.out.println("Highest value: " + highest);
        System.out.println("Lowest value: " + lowest);
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: w3schools.com, article "Java Arrays"
// Cite: oracle.com, article "Class Arrays"
// Cite: geeksforgeeks.org, article "Arrays In Java"
// Cite: w3schools.com, article "Java Data Types"
// Cite: geeksforgeeks.org, article "Java Program to find largest element in an array"
// Cite: geeksforgeeks.org, article "Java Program to Print the Smallest Element in an Array"
// Cite: geeksforgeeks.org, article "Program for average of an array (Iterative and Recursive)"
// Cite: geeksforgeeks.org, article "Java Program to Find Sum of Array Elements"