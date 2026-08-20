// 10/11/2024
// Ian Lewis
// Module 11 Assignment: 2

/*
The following series of programs write methods using the following headers that returns the
location of the largest element in the array passed to the method returning a one-dimensional
array that contains two location elements.

    public static int [] locateLargest (double [][] arrayParam)
    public static int [] locateLargest (int [][] arrayParam)

Programs in the series then write methods using the following headers that returns the location
of the smallest element in the array passed to the method returning a one-dimensional array that
contains two location elements.

    public static int [] locateSmallest (double [][] arrayParam)
    public static int [] locateSmallest (int [][] arrayParam)

*/

public class LocateLargestInt {

    // Method locates largest element in a 2D double array
    public static int[] locateLargest(int[][] arrayParam) {
        // Array holds location of the largest element (row and column)
        int[] location = new int[2];

        // Checks if input array is empty
        if (arrayParam.length == 0 || arrayParam[0].length == 0) {
            return location; // Returns (0, 0) if array is empty
        }

        // Initializes maxVal to the first element and its location
        int maxVal = arrayParam[0][0];
        location[0] = 0; // Row index
        location[1] = 0; // Column index

        // Loops through each row of the array
        for (int i = 0; i < arrayParam.length; i++) {
            // Loops through each column of the current row
            for (int j = 0; j < arrayParam[i].length; j++) {
                // Checks if current element is larger than maxVal
                if (arrayParam[i][j] > maxVal) {
                    maxVal = arrayParam[i][j]; // Updates maxVal
                    location[0] = i; // Updates row index
                    location[1] = j; // Updates column index
                }
            }
        }
        return location; // Returns location of the largest element
    }

    public static void main(String[] args) {
        int[][] array = {{1, 3, 5}, {7, 9, 4}};
        int[] location = locateLargest(array); // Calls method to find largest
        // Prints location of the largest element
        System.out.println("Largest in int array: row " + location[0] + ", column " + location[1]);
    }
}


// Cite: w3schools.com, module "Java Tutorial"
// Cite: w3schools.com, article "Java Arrays"
// Cite: geeksforgeeks.org, article "Java Program to find largest element in an array"
// Cite: geeksforgeeks.org, article "How to Pass an Array to a Function in Java"
// Cite: geeksforgeeks.org, article "Multidimensional Arrays in Java"
// Cite: oracle.com, chapter "Chapter 10. Arrays"
// Cite: oracle.com, chapter "Naming a Package"