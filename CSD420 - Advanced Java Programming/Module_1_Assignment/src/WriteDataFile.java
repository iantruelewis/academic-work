// 01/10/25
// Ian Lewis
// CSD 420
// Module 1 Assignment

/*
    This program stores:
        • An array of five random integers
        • A Date objective instance using the current date
        • An array of five random double values
    Writes the data in a file titled <yourname> datafile.dat.

    There is a second program that will read the file and display the data.

    The program was tested to ensure the code functions correctly.
*/

import java.io.*;
import java.util.*;
import java.text.*;

public class WriteDataFile {
    public static void main(String[] args) {
        // Creates an array of five random integers
        Random random = new Random();
        int[] randomIntegers = new int[5];
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = random.nextInt(100);
        }

        // Gets current date
        Date currentDate = new Date();

        // Creates an array of five random double values
        double[] randomDoubles = new double[5];
        for (int i = 0; i < randomDoubles.length; i++) {
            randomDoubles[i] = random.nextDouble() * 100;
        }

        // Writes all data to a file
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("Ian Lewis datafile.dat"))) {
            // Writes integers to file
            for (int i = 0; i < randomIntegers.length; i++) {
                outputStream.writeInt(randomIntegers[i]);
            }

            // Writes date to file as a long value
            outputStream.writeLong(currentDate.getTime());

            // Writes doubles to file
            for (int i = 0; i < randomDoubles.length; i++) {
                outputStream.writeDouble(randomDoubles[i]);
            }

            System.out.println("Data successfully written to Ian Lewis datafile.dat");
        } catch (IOException e) {
            // Prints an error message
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
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