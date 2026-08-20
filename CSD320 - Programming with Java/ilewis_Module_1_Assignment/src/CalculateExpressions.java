// 08/15/24
// Ian Lewis
// Module 1 Assignment

// The purpose of this program is to compare and contrast two methods of calculating a sequence of numbers.
// A discussion is included below to determine which method is better and explain why.

public class CalculateExpressions {
    public static void main(String[] args) {

        // Calculates first expression
        double result1 = 4 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0);

        // Calculates second expression
        int result2 = 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13);

        // Displays results of both expressions
        System.out.println("Result of the first expression: " + result1);
        System.out.println("Result of the second expression: " + result2);

        /*
         Discussion about both expressions:
         Expression 1 makes use of floats for all numbers, incorporating their decimal values.
         Expression 2 makes use of ints for all numbers, discarding all fractional values.

         Comparison between both expressions:
         Due to the inclusion of decimal values, the final results of expression 1 are more accurate.
         Because it does not incorporate fractional values, expression 2 is not as precise.

         Which is best and why?
         The best approach is the method utilized in the first expression.
         This approach incorporates fractional values and is a more precise calculation.
        */
    }
}

// Cite: w3schools.com, module "Java Tutorial"