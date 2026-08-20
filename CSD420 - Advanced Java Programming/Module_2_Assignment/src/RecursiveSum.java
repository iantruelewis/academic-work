// 01/14/25
// Ian Lewis
// CSD 420
// Module 2 Assignment

/*
    This program uses a recursive method that returns the sum of the following type inputs.

        m(i) = 1/2 + 2/3 + 3/4 + 4/5 + 5/6 … i/(i + 1)

        ‘m’ is replaced with the method name you use.

        Examples for testing:
        m(4), m(9), m(14).
*/


public class RecursiveSum {

    // Recursive method calculates sum
    public static double customSum(int i) {
        // Base case: if i is 1, returns 1/2
        if (i == 1) {
            return 1.0 / 2;
        }

        // Recursive case: adds i/(i+1) to sum of previous terms
        return (double) i / (i + 1) + customSum(i - 1);
    }

    public static void main(String[] args) {
        // Tests method with three input values
        int[] testValues = {5, 10, 15};

        // Loops through test values and displays results
        for (int value : testValues) {
            double result = customSum(value);
            System.out.printf("The sum customSum(%d) is: %.4f\n", value, result);
        }
    }
}

// Cite: w3schools.com, module "Java Recursion"
// Cite: geeksforgeeks.org, article "Recursion in Java"
// Cite: programiz.com, module "Java Recursion"
// Cite: javatpoint.com module "Recursion in Java"