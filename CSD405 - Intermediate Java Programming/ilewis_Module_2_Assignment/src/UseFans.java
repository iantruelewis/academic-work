// 11/02/24
// Ian Lewis
// CSD 405
// Module 2 Assignment

/* The purpose of this program is to build upon code from Module 1 by creating the
   new class titled UseFans. Additionally, the program incorporates the following:

    • Create a collection of Fan instances.
    • Create a method taking a collection of Fan instances for displaying without using the toString() method.
    • Create a method that takes a single instance of a Fan for displaying without using the toString() method.
    • Use the this reference throughout the Fan class where allowed.
    • Write test code that creates a collection of Fans and displays the functionality of all of the Fan instances in the collection.
*/

import java.util.ArrayList;
import java.util.List;

public class UseFans {

    // Method displays each Fan's details in a collection without using toString()
    public static void displayFans(List<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    // Method displays single Fan instance without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("----------------------");
    }

    // Test code creates collection of Fans and displays each Fan's state
    public static void main(String[] args) {
        // Creates list to hold multiple Fan instances
        List<Fan> fans = new ArrayList<>();

        // Adds different Fans to the list
        fans.add(new Fan());  // A default fan with default settings
        fans.add(new Fan(Fan.MEDIUM, true, 9.0, "Black"));  // A custom fan
        fans.add(new Fan(Fan.FAST, true, 7.0, "Red"));  // Another custom fan

        // Displays each Fan's details in collection
        System.out.println("Displaying all fans:");
        displayFans(fans);
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: eduactive.io, Article, "How to declare constants in Java"
// Cite: scaler.com, Article, "What is Constant in Java?"
// Cite: javarevisited.blogspot.com, Article, "Private in Java: Why should you always keep fields and methods private?"
// Cite: w3schools.com, module "Java Booleans"
// Cite: w3schools.com, module "Getter and Setter in Java"
// Cite: geeksforgeeks.org, module "Java Constructors"
// Cite: w3schools.com, module "Java Class Methods"
// Cite: oracle.com, module "Java Classes"
// Cite: geeksforgeeks.org, module "Classes and Objects in Java"
// Cite: oracle.com, module "Lesson: Introduction to Collections"
// Cite: geeksforgeeks.org, module "ArrayList in Java"