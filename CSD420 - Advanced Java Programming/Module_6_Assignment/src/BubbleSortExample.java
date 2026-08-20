// 02/09/25
// Ian Lewis
// CSD 420
// Module 6 Assignment

/*
    Write a program with the two following generic methods using a bubble sort. The first method sorts the elements using the Comparable interface, and the second uses the Comparator interface.

        • public static <E extends Comparable<E>>
           void bubbleSort(E[] list)
          public static <E> void bubbleSort(E[] list,
           Comparator<? super E> comparator)

        •Attached in the module was a solution zip file for review.
    Write test code that ensures your code functions correctly.
*/

import java.util.Comparator;

public class BubbleSortExample {
    // Sorts array with bubble sort using Comparable
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    // Sorts array with bubble sort using Comparator
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (comparator.compare(list[j], list[j + 1]) > 0) {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    // Main method for testing bubble sort
    public static void main(String[] args) {
        // Tests integers
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        System.out.println("Before sorting integers:");
        printArray(intArray);
        bubbleSort(intArray);
        System.out.println("After sorting integers:");
        printArray(intArray);

        // Tests strings
        String[] strArray = {"banana", "apple", "cherry", "watermelon"};
        System.out.println("Before sorting strings:");
        printArray(strArray);
        bubbleSort(strArray, String::compareToIgnoreCase);
        System.out.println("After sorting strings:");
        printArray(strArray);
    }

    // Helper method prints array
    private static <E> void printArray(E[] array) {
        for (E e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}

//Cite: geeksforgeeks.org, article "Bubble Sort Algorithm"
//Cite: geeksforgeeks,org, article "Java Program for Bubble Sort"
//Cite: javatpoint.com, module "Bubble Sort in Java"
//Cite: w3schools.com, article "Java Advanced Sorting (Comparator and Comparable)"
//Cite: oracle.com, article "Interface Comparable<T>"
//Cite: geeksforgeeks.org, article "Java Comparable Interface"
//Cite: jenkov.com, article "Java Comparable"
//Cite: javatpoint.com, module "Java Comparable interface"
//Cite: oracle.com, article "Interface Comparator<T>"
//Cite: geeksforgeeks.org, article "Java Comparator Interface"
//Cite: baeldung.com, article "Comparator and Comparable in Java"