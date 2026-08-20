// 09/28/2024
// Ian Lewis
// Module 8 Assignment

/*
 The purpose of this program is to write a program with four methods
 for calculating the cost of a yearly auto service visit.
 The methods will be titled yearlyService.

    1. yearlyService(no parameters) - Will return the standard service charge.
    2. yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
    3. yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge.
    4. yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, a tire rotation charge, along with a coupon amount that will be deducted from the total cost.

The main method will test each of these methods two times.
 */



public class AutoService {

    // Constants for charges
    static final double STANDARD_SERVICE_CHARGE = 150.0;
    static final double OIL_CHANGE_FEE = 30.0;
    static final double TIRE_ROTATION_FEE = 40.0;

    // Method 1: yearlyService with no parameters
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

    // Method 2: yearlyService with one parameter (oil change)
    public static double yearlyService(boolean oilChange) {
        double total = STANDARD_SERVICE_CHARGE;
        if (oilChange) {
            total += OIL_CHANGE_FEE;
        }
        return total;
    }

    // Method 3: yearlyService with two parameters (oil change, tire rotation)
    public static double yearlyService(boolean oilChange, boolean tireRotation) {
        double total = STANDARD_SERVICE_CHARGE;
        if (oilChange) {
            total += OIL_CHANGE_FEE;
        }
        if (tireRotation) {
            total += TIRE_ROTATION_FEE;
        }
        return total;
    }

    // Method 4: yearlyService with three parameters (oil change, tire rotation, coupon)
    public static double yearlyService(boolean oilChange, boolean tireRotation, double coupon) {
        double total = STANDARD_SERVICE_CHARGE;
        if (oilChange) {
            total += OIL_CHANGE_FEE;
        }
        if (tireRotation) {
            total += TIRE_ROTATION_FEE;
        }
        total -= coupon; // Apply the coupon deduction
        return total;
    }

    public static void main(String[] args) {
        // Test the methods two times each

        // Test 1: No parameters
        System.out.println("Test 1 - No parameters: $" + yearlyService());
        System.out.println("Test 2 - No parameters: $" + yearlyService());

        // Test 2: One parameter (oil change)
        System.out.println("Test 1 - One parameter (Oil Change): $" + yearlyService(true));
        System.out.println("Test 2 - One parameter (Oil Change): $" + yearlyService(true));

        // Test 3: Two parameters (oil change, tire rotation)
        System.out.println("Test 1 - Two parameters (Oil Change, Tire Rotation): $" + yearlyService(true, true));
        System.out.println("Test 2 - Two parameters (Oil Change, Tire Rotation): $" + yearlyService(true, false));

        // Test 4: Three parameters (oil change, tire rotation, coupon)
        System.out.println("Test 1 - Three parameters (Oil Change, Tire Rotation, Coupon): $" + yearlyService(true, true, 20.0));
        System.out.println("Test 2 - Three parameters (Oil Change, Tire Rotation, Coupon): $" + yearlyService(false, true, 10.0));
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: w3schools.com, article "Java Methods"
// Cite: w3schools.com, article "Java Method Parameters"
// Cite: geeksforgeeks,org, article "Java Methods"
// Cite: geeksforgeeks,org, article "Java Method Parameters"
// Cite: github.com, article "Checking that a method was called twice with different values #326"