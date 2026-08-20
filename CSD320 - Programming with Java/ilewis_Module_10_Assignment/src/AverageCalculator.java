// 10/06/2024
// Ian Lewis
// Module 10 Assignment

/*
 The purpose of this program is to write four overloaded methods that return the average
 of an array with the following headers:

    1. public static short average(short [] array)
    2. public static int average(int [] array)
    3. public static long average(long [] array)
    4. public static double average(double [] array)

 This program also tests each of these methods and then displays the average value returned
 along with a display of the original array elements. The displays should be easy to read and
 understandable. Lastly, each array sent into the methods are of different sizes to ensure
 the method code is correctly written.
*/

public class AverageCalculator {

    // Method calculates average of short array
    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    // Method calculates average of int array
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method calculates average of long array
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method calculates average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method displays array and results
    public static void displayArrayAndAverage(String dataType, Object array, Object average) {
        System.out.println(dataType + " Array Elements:");
        if (array instanceof short[]) {
            for (short value : (short[]) array) {
                System.out.print(value + " ");
            }
        } else if (array instanceof int[]) {
            for (int value : (int[]) array) {
                System.out.print(value + " ");
            }
        } else if (array instanceof long[]) {
            for (long value : (long[]) array) {
                System.out.print(value + " ");
            }
        } else if (array instanceof double[]) {
            for (double value : (double[]) array) {
                System.out.print(value + " ");
            }
        }
        System.out.println("\nAverage: " + average + "\n");
    }

    // Main method tests averages of methods
    public static void main(String[] args) {
        // Tests short array
        short[] shortArray = {10, 20, 30, 40};
        short shortAvg = average(shortArray);
        displayArrayAndAverage("Short", shortArray, shortAvg);

        // Tests int array
        int[] intArray = {5, 10, 15, 20, 25};
        int intAvg = average(intArray);
        displayArrayAndAverage("Int", intArray, intAvg);

        // Tests long array
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L, 6000L};
        long longAvg = average(longArray);
        displayArrayAndAverage("Long", longArray, longAvg);

        // Tests double array
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5};
        double doubleAvg = average(doubleArray);
        displayArrayAndAverage("Double", doubleArray, doubleAvg);
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: w3schools.com, article "Java Arrays"
// Cite: w3schools.com, article "Java Arrays.sort() Method"
// Cite: geeksforgeeks.org, article "Arrays.sort() in Java with examples"
// Cite: oracle.com, chapter "Chapter 10. Arrays "