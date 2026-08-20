// 10/27/24
// Ian Lewis
// CSD 405
// Module 1 Assignment

// The purpose of this program is to write a program with a class titled Fan. This class contains:

    // Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3 respectively.
    // A private field named speed that holds one of the constant values with the default being STOPPED.
    // A private Boolean field titled on that specifies whether the fan is on or off.
    // A private field named radius that holds the radius of the fan with a default value of 6.
    // A String field that holds the color, with the default being white.
    // Setter and getter methods for all mutable fields.
    // A no-argument constructor that sets all fields with a default value.
    // A constructor taking arguments and setting values.
    // A toString() method that returns a description of the Fans state.
    // Test code that creates two instances of the Fan class, one using the default constructor and the other using the argument constructor.
        // Code that displays the functionality of the Fan class methods.



public class Fan {
    // Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor with default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "White";
    }

    // Constructor that allows setting values for all fields
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and setter for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method returns Fan's state
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON, Speed: " + speed + ", Radius: " + radius + ", Color: " + color;
        } else {
            return "Fan is OFF, Radius: " + radius + ", Color: " + color;
        }
    }

    // Main method tests Fan class
    public static void main(String[] args) {
        // Creates Fan object using no-argument constructor
        Fan defaultFan = new Fan();
        System.out.println("Default Fan: " + defaultFan.toString());

        // Creates Fan object using argument constructor
        Fan customFan = new Fan(Fan.MEDIUM, true, 9, "Black");
        System.out.println("Custom Fan: " + customFan.toString());

        // Tests setter and getter methods
        defaultFan.setSpeed(Fan.FAST);
        defaultFan.setOn(true);
        defaultFan.setRadius(7.0);
        defaultFan.setColor("Red");

        System.out.println("Updated Default Fan: " + defaultFan.toString());
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