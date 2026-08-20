// 11/02/24
// Ian Lewis
// CSD 405
// Module 3 Assignment

/* The purpose of this program is to create a class titled Integer and include the requirements below.
   Examples:
    • AnnaInteger
    • LarryInteger
    • SueInteger
    • Etc.

This class contains:
        • An int data field titled with your first name.
        • A constructor that takes and sets the initial value.
        • Getter and setter methods.
        • Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or false based on the variable’s value.
        • Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with the same basic logic as the previous methods with results based on the parameter.
        • Static methods with signatures isEven( Integer), isOdd( Integer), and isPrime( Integer) with the same basic logic as the previous methods with results based on the parameter.
        • The methods equals(int) and equals( Integer) which returns true if int values are equal and false if they are not.
        • Test code that creates three instances, two with the same value, and one with a different value.
        • Test code that ensures all methods function correctly.
*/

public class IanInteger {
    // This variable holds the integer value
    private int ian;

    // Constructor sets initial value of ian
    public IanInteger(int value) {
        this.ian = value;
    }

    // Getter and setter accesses and changes ian value
    public int getIan() {
        return ian;
    }

    public void setIan(int value) {
        this.ian = value;
    }

    // Non-static methods checks if the number is even, odd, or prime
    public boolean isEven() {
        return ian % 2 == 0;
    }

    public boolean isOdd() {
        return ian % 2 != 0;
    }

    public boolean isPrime() {
        if (ian < 2) return false;
        for (int i = 2; i <= Math.sqrt(ian); i++) {
            if (ian % i == 0) return false;
        }
        return true;
    }

    // Static methods take an integer and do the same checks
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value < 2) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    // Static methods take an IanInteger object and do the same checks
    public static boolean isEven(IanInteger obj) {
        return obj.getIan() % 2 == 0;
    }

    public static boolean isOdd(IanInteger obj) {
        return obj.getIan() % 2 != 0;
    }

    public static boolean isPrime(IanInteger obj) {
        return isPrime(obj.getIan());
    }

    // Methods compare this instance's value to another int or IanInteger
    public boolean equals(int value) {
        return this.ian == value;
    }

    public boolean equals(IanInteger obj) {
        return this.ian == obj.getIan();
    }

    // Main method tests everything
    public static void main(String[] args) {
        // Creates three instances
        IanInteger num1 = new IanInteger(7);
        IanInteger num2 = new IanInteger(7);
        IanInteger num3 = new IanInteger(10);

        // Tests non-static methods
        System.out.println("num1 isEven: " + num1.isEven());    // false
        System.out.println("num1 isOdd: " + num1.isOdd());      // true
        System.out.println("num1 isPrime: " + num1.isPrime());  // true

        // Tests static methods with int parameter
        System.out.println("isEven(10): " + IanInteger.isEven(10));      // true
        System.out.println("isOdd(10): " + IanInteger.isOdd(10));        // false
        System.out.println("isPrime(10): " + IanInteger.isPrime(10));    // false

        // Tests static methods with IanInteger parameter
        System.out.println("isEven(num3): " + IanInteger.isEven(num3));      // true
        System.out.println("isOdd(num3): " + IanInteger.isOdd(num3));        // false
        System.out.println("isPrime(num3): " + IanInteger.isPrime(num3));    // false

        // Tests equals methods
        System.out.println("num1 equals 7: " + num1.equals(7));          // true
        System.out.println("num1 equals num2: " + num1.equals(num2));    // true
        System.out.println("num1 equals num3: " + num1.equals(num3));    // false
    }
}

