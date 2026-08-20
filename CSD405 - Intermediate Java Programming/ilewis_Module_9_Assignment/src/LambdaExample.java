// 11/29/24
// Ian Lewis
// CSD 405
// Module 9 Assignment
// Java Lambda

/*
    The point of this program is to illustrate an example of Java Lambda in action.
*/

import java.util.*;
import java.util.function.*;

public class LambdaExample {
    public static void main(String[] args) {
        // Example 1: No Parameters
        Runnable greet = () -> System.out.println("Hello, Lambda");
        greet.run();

        // Example 2: Lambda with Parameters
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Addition: " + add.apply(5, 10));

        // Example 3: Using Lambda in Collections
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        list.forEach(fruit -> System.out.println(fruit));

        // Example 4: Sorting with Lambda
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted List: " + list);
    }
}

// W3Schools. (n.d.). Java lambda expressions. W3Schools. Retrieved November 29, 2024, from https://www.w3schools.com/java/java_lambda.asp

// Oracle. (n.d.). Lambda expressions (The Java™ Tutorials > Learning the Java Language > Lambda Expressions). Oracle. Retrieved November 29, 2024, from https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html

// GeeksforGeeks. (10/04/24). Lambda expressions in Java 8. GeeksforGeeks. Retrieved November 29, 2024, from https://www.geeksforgeeks.org/lambda-expressions-java-8/

// Oracle. (n.d.). Architecting for lambda expressions – Part 1. Oracle. Retrieved November 29, 2024, from https://www.oracle.com/technical-resources/articles/java/architect-lambdas-part1.html

// JavaTpoint. (n.d.). Java lambda expressions. JavaTpoint. Retrieved November 29, 2024, from https://www.javatpoint.com/java-lambda-expressions

// DigitalOcean. (02/28/24). How to use lambdas in Java. DigitalOcean. Retrieved November 29, 2024, from https://www.digitalocean.com/community/tutorials/how-to-use-lambdas-in-java