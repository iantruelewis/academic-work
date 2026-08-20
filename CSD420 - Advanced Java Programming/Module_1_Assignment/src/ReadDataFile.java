// 01/10/25
// Ian Lewis
// CSD 420
// Module 1 Assignment

/*
    This is the second program that will read the file and display the data from the first program.

    The program was tested to ensure the code functions correctly.
*/

import java.io.*;
import java.util.*;
import java.text.*;

// Program reads data from file written by WriteDataFile
public class ReadDataFile {
    public static void main(String[] args) {
        // Opens file and reads data
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("Ian Lewis datafile.dat"))) {
            // Reads and prints integers
            int[] randomIntegers = new int[5];
            System.out.println("Random Integers:");
            for (int i = 0; i < randomIntegers.length; i++) {
                randomIntegers[i] = inputStream.readInt();
                System.out.print(randomIntegers[i] + " ");
            }
            System.out.println();

            // Reads and prints date
            long dateLong = inputStream.readLong();
            Date currentDate = new Date(dateLong);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("Date: " + dateFormat.format(currentDate));

            // Reads and prints doubles
            double[] randomDoubles = new double[5];
            System.out.println("Random Doubles:");
            for (int i = 0; i < randomDoubles.length; i++) {
                randomDoubles[i] = inputStream.readDouble();
                System.out.printf("%.2f ", randomDoubles[i]);
            }
            System.out.println();
        } catch (IOException e) {
            // Prints an error message
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}

// Cite: oracle.com, module "Lesson: Basic I/O"
// Cite: oracle.com, module "Package java.io"
// Cite: oracle.com, module "Reading, Writing, and Creating Files"
// Cite: javatpoint.com, module "Java I/O Tutorial"
// Cite: geeksforgeeks.org, article "Java IO : Input-output in Java with Examples"
// Cite: geeksforgeeks.org, article "Java Create and Write To Files"
// Cite: tutorialspoint.com, article "Java - Files and I/O"
// Cite: w3schools.com, article "Java Create and Write To Files"

// Cite: w3schools.com, article "Java Read Files"
// Cite: w3schools.com, article "Different ways of Reading a text file in Java"
