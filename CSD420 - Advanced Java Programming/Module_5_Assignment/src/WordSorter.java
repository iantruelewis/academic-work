// 02/02/25
// Ian Lewis
// CSD 420
// Module 5 Assignment

/*
    Write a test program that reads words from a text file and displays all non-duplicate words in ascending order and then in descending order.
       • The file is to be referenced in the program, not needing to be used as a command line reference.
       • The word file is to be titled collection_of_words.txt and included in your submission.
    Write test code that ensures the code functions correctly.
*/

import java.io.*;
import java.util.*;

public class WordSorter {
    public static void main(String[] args) {
        // File name
        String fileName = "collection_of_words.txt";

        // Reads words from file
        Set<String> uniqueWords = readWordsFromFile(fileName);

        if (uniqueWords != null) {
            // TreeSet
            System.out.println("Words in Ascending Order: " + uniqueWords);

            // Converts list and reverses for descending order
            List<String> descendingList = new ArrayList<>(uniqueWords);
            Collections.reverse(descendingList);
            System.out.println("Words in Descending Order: " + descendingList);
        }
    }

    public static Set<String> readWordsFromFile(String fileName) {
        Set<String> words = new TreeSet<>(); // Uses TreeSet to avoid duplicates and sort automatically
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return null;
        }
        return words;
    }
}

//Cite: w3schools.com, article, "Java Read Files"
//Cite: geeksforgeeks.org, article,"Different ways of Reading a text file in Java"
//Cite: digitalocean.com, article "Java read text file"
//Cite: daniweb.com, forum "reading duplicate records in text file"
//Cite: daniweb.com, forum "Assist with displaying Non-Duplicate Words"
//Cite: geeksforgeeks.org, article "Java Program to Sort Names in an Alphabetical Order"
//Cite: tutorialspoint.com, article "Java program to sort words of sentence in ascending order"
//Cite: geeksforgeeks.com, article "Sort a String in Java (2 different ways)"
//Cite: javatpoint.com, article "How to Sort String Array in Java"
//Cite: geeksforgeeks.org, article, "Java Program to Sort the Elements of an Array in Descending Order"
//Cite: geeksforgeeks.org, article, "Program to sort string in descending order"
//Cite: geeksforgeeks.org, article "TreeSet in Java"
//Cite: oracle.com, article "Class TreeSet<E>"