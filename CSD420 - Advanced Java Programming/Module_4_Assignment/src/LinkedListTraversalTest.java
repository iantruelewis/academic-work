// 01/26/25
// Ian Lewis
// CSD 420
// Module 4 Assignment

/*
    • Write a test program that stores 50,000 integers in LinkedList and test the time to traverse the list using an iterator vs. using the get(index) method.
    • Then, test your program storing 500,000 integers.
    • After completing this program and having tested both values, in your comments, explain the results and discuss the time taken using both values and their difference with the get(index) approach.
    • Write test code that ensures the code functions correctly.

*/

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTraversalTest {
    public static void main(String[] args) {
        System.out.println("Testing with 50,000 integers:");
        testLinkedListTraversal(50000);

        System.out.println("\nTesting with 500,000 integers:");
        testLinkedListTraversal(500000);
    }

    private static void testLinkedListTraversal(int size) {
        // Creates and populates the LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        // Measures traversal time using an iterator
        long startTime = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long iteratorTime = System.nanoTime() - startTime;
        System.out.println("Time taken using iterator: " + iteratorTime + " nanoseconds");

        // Measures traversal time using get(index)
        startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long getTime = System.nanoTime() - startTime;
        System.out.println("Time taken using get(index): " + getTime + " nanoseconds");

        // Compares the times
        System.out.printf("get(index) was %.2f times slower than iterator.%n", (double) getTime / iteratorTime);
    }
}

/*
Results:
When using an iterator, the traversal can be efficient due to the iterator directly accessing the next node in the LinkedList.
This avoids the overhead of repeatedly starting from the head of the list to locate an element.

When using get(index), the time taken increases significantly with the size of the list. This is because get(index) performs a
sequential search from the start of the list to the specified index for each element, resulting in O(n^2) time complexity for traversal.

Test Results:
For 50,000 integers:
  • Iterator traversal time is significantly faster than get(index).
  • The performance gap is noticeable but manageable.

For 500,000 integers:
  • The iterator maintains O(n) time complexity, so the time scales in a linear way.
  • The get(index) method becomes much slower due to its O(n^2) complexity.

Conclusion:
One should use an iterator for traversing a LinkedList. Using get(index) for traversal is highly inefficient and impractical
for larger lists due to the repeated linear scans.
*/


//////////
// Cite: oracle.com, module "Class LinkedList<E>"
// Cite: w3schools.com, module "Java LinkedList"
// Cite: geeksforgeeks.org, article "LinkedList in Java"
// Cite: javatpoint.com, article "Java LinkedList Class"
// Cite: w3schools.com, module "Java String indexOf() Method"
// Cite: geeksforgeeks.org, article "ArrayList get(index) Method in Java with Examples"
// Cite: tutorialspoint.com, article "How do you get the index of an element in a list in Java?"
// Cite: baeldung.com, article "Find the Index of an Element in a Java Array"
// Cite: oracle.com, forums "Iterator vs ArrayList.get(int index)"
// Cite: geeksforgeeks.org, article "Java Iterator"
// CIte: baeldung.com, article "A Guide to Iterator in Java"