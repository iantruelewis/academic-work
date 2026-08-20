// 11/16/24
// Ian Lewis
// CSD 405
// Module 5 Assignment

/*
   Program 2:
   The purpose of this program to create a new file titled data.file,
   if the file does not exist. It then writes to a new file, adding 10 randomly
   generated numbers, or appending 10 randomly generated numbers to a previous file.
   Each integer is separated by a space. Close the file, then reopen the file and read
   the data from the file and display it.
 */


import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileProgram {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        try {
            // Checks if file exists
            if (!file.exists()) {
                // Creates new file
                file.createNewFile();
                System.out.println("New file created: " + file.getName());
            }

            // Appends 10 random numbers to the file
            FileWriter fileWriter = new FileWriter(file, true);
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100); // Generate random numbers (0-99)
                fileWriter.write(randomNumber + " ");
            }
            fileWriter.close();
            System.out.println("10 random numbers have been added to the file.");

            // Reads file content
            Scanner fileReader = new Scanner(file);
            System.out.println("File contents:");
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file: " + e.getMessage());
        }
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: programiz.com, Article "Java Program to Create File and Write to the File"
// Cite: w3schools.com, Article "Java Create and Write To Files"
// Cite: geeksforgeeks.org, Article "Different ways of Reading a text file in Java"