// 11/16/24
// Ian Lewis
// CSD 405
// Module 6 Assignment
// PT.II: InternationalDivision

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

    * InternationalDivision *
*/


// Subclass for international divisions
public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Implements abstract method
    @Override
    public void display() {
        System.out.println("International Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }
}

// Cite: w3schools.com, module "Java Tutorials"
// Cite: w3schools.com, Article "Java Abstraction"
// Cite: geeksforgeeks.org, Article "Abstract Class in Java"
// Cite: oracle.com, module "Abstract Methods and Classes"
// Cite: w3schools.com, Article "Java Inheritance"
// Cite: geeksforgeeks.org, Article "Inheritance in Java"
// Cite: oracle.com, module "Inheritance (Java)"