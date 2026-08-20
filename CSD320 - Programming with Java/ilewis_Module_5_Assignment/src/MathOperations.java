// 09/04/2024
// Ian Lewis
// Module 5 Assignment

/*
 The purpose of this program is to use a while loop to display the
 following math operations both in the smaller to larger order and then
 the larger to smaller order with the denominator being 3 through 99.
 The program then displays the mathematical results.

 Math Operations:
 1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0
 1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0
*/


public class MathOperations {

    public static void main(String[] args) {
        // Displays Results in Smaller to Larger / Ascending Order
        System.out.println("Results in Smaller to Larger / Ascending Order:");
        double sumAscending = 0.0;
        int denominator = 3;

        // Smaller to Larger / Ascending Order
        while (denominator <= 99) {
            double result = 1.0 / denominator;
            System.out.println("1/" + denominator + " = " + result);
            sumAscending += result;
            denominator += 2; // Moves to next odd number
        }
        System.out.println("Total Sum (Ascending Order): " + sumAscending);

        // Displays Results in Larger to Smaller / Descending Order
        System.out.println("\nResults in Larger to Smaller / Descending Order:");
        double sumDescending = 0.0;
        denominator = 99;

        // Larger to Smaller / Descending Order
        while (denominator >= 3) {
            double result = 1.0 / denominator;
            System.out.println("1/" + denominator + " = " + result);
            sumDescending += result;
            denominator -= 2; // Moves to previous odd number
        }
        System.out.println("Total Sum (Descending Order): " + sumDescending);
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: w3schools.com, module "Java While Loop"
// Cite: mkyong.com, module "Java – Reverse loop versus Forward loop in Performance"
// Cite: tutorjoes.in, module "While Loop in Java"
// Cite: geeksforgeeks.org, module "Java Program to Sort the Elements of an Array in Ascending Order"
// Cite: geeksforgeeks.org, module "Java Program to Sort the Array Elements in Descending Order"