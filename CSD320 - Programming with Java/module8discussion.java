// Method Signature
public class MethodSignatureExample {
    // Method signature: calculateArea(double radius)
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method signature: calculateArea(double length, double width)
    public double calculateArea(double length, double width) {
        return length * width;
    }
}



// Method Overloading
public class MethodOverloadingExample {
    public void printValue(int value) {
        System.out.println("Integer value: " + value);
    }

    public void printValue(double value) {
        System.out.println("Double value: " + value);
    }

    public void printValue(String value) {
        System.out.println("String value: " + value);
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();
        example.printValue(10);
        example.printValue(15.5);
        example.printValue("Java is so cool.");
    }
}



// Void vs. non-void
public void displayMessage() {
    System.out.println("This is a void method.");
}


public int multiply(int a, int b) {
    return a * b;
}

public static void main(String[] args) {
    int result = multiply(4, 4);  // result is 16
    System.out.println("Result of multiplication: " + result);
}



// Variable Scope
public class VariableScopeExample {
    // Instance variable
    private int instanceVar = 14;

    // Static variable
    private static int classVar = 33;

    public void demonstrateLocalScope() {
        // Local variable
        int localVar = 7;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Class Variable: " + classVar);
    }

    public static void main(String[] args) {
        VariableScopeExample example = new VariableScopeExample();
        example.demonstrateLocalScope();
    }
}