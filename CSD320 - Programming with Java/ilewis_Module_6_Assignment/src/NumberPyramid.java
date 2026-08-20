// 09/12/2024
// Ian Lewis
// Module 6 Assignment

/*
 The purpose of this program is to nest for loops to
 output a similar display format shown:

                                   1               @
                                 1 2 1             @
                               1 2 4 2 1           @
                             1 2 4 8 4 2 1         @
                          1 2 4 8 16 8 4 2 1       @
                       1 2 4 8 16 32 16 8 4 2 1    @
                    1 2 4 8 16 32 64 32 16 8 4 2 1 @
*/


public class NumberPyramid {
    public static void main(String[] args) {
        // Total number of rows in pyramid
        int rows = 7;

        // Outer loop for each row in pyramid
        for (int i = 1; i <= rows; i++) {
            // Prints leading spaces for pyramid
            for (int j = rows - i; j > 0; j--) {
                System.out.print("  ");
            }

            // Prints half of pyramid with numbers increasing
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                // Doubles the number
                num *= 2;
            }

            // Prints half of pyramid with numbers decreasing
            // Starts from last number on left
            num /= 2;
            for (int j = i - 1; j > 0; j--) {
                // Halves numbers in pyramid
                num /= 2;
                System.out.print(num + " ");
            }

            // Prints @ symbol at end of each row
            System.out.println(" @");
        }
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: w3schools.com, module "Java Nested Loops"
// Cite: geeksforgeeks.org, module "Java Nested Loops with Examples"
// Cite: programiz.com, module "Nested Loop in Java"
// Cite: codegym.cc, module "Java Nested Loops"