// 11/16/24
// Ian Lewis
// CSD 405
// Module 6 Assignment
// PT.IV: UseDivision

/*
    Create an abstract Division class with fields for a company's division name and account
    number, and an abstract display() method that will be defined in the subclasses.

    Use a constructor in the superclass that requires values for both fields.

    Create two subclasses named InternationalDivision and DomesticDivision.
        • The InternationalDivision class includes a field for the country in which the
        division is located, a field for the language spoken, and a constructor that requires
        all fields when created.
        • The DomesticDivision class includes a field for the state in which the division
        is located and a constructor that requires all fields when created.

    Write an application named UseDivision that creates two instances of each of these
    concrete classes (4 total instances).

    Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.

    * UseDivision *
*/


// Main application class
public class UseDivision {
    public static void main(String[] args) {
        // Creates instances of InternationalDivision
        InternationalDivision intlDiv1 = new InternationalDivision("Global Sales", 101, "France", "French");
        InternationalDivision intlDiv2 = new InternationalDivision("Asia Operations", 102, "Japan", "Japanese");

        // Creates instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision("East Coast Sales", 201, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Operations", 202, "California");

        // Displays information for each division
        intlDiv1.display();
        System.out.println();
        intlDiv2.display();
        System.out.println();
        domDiv1.display();
        System.out.println();
        domDiv2.display();
    }
}

// Cite: w3schools.com, module "Java Tutorials"
// Cite: w3schools.com, Article "Java Abstraction"
// Cite: geeksforgeeks.org, Article "Abstract Class in Java"
// Cite: oracle.com, module "Abstract Methods and Classes"
// Cite: w3schools.com, Article "Java Inheritance"
// Cite: geeksforgeeks.org, Article "Inheritance in Java"
// Cite: oracle.com, module "Inheritance (Java)"