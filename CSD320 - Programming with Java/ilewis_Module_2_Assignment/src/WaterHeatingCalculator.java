// 08/21/2024
// Ian Lewis
// Module 2 Assignment


/*
 The purpose of this program is to calculate the energy needed to heat water from an
 initial temperature to a final temperature. The program prompts the user to enter
 the amount of water in kilograms and the initial and final temperature of the water.

 The formula used for this program is:
    • Q = waterMass ( finalTemperature – initialTemperature ) x 4184
    • waterMass is water weight in kilograms
    • finalTemperature and initialTemperature are temperatures in Celsius
    • Q is the results in Joules
*/


import java.util.Scanner;

public class WaterHeatingCalculator {
    public static void main(String[] args) {
        // Creates Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompts user to enter amount of water in kilograms
        System.out.print("Enter amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompts user to enter initial temperature in Celsius
        System.out.print("Enter initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // Prompts user to enter final temperature in Celsius
        System.out.print("Enter final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculates energy needed using the formula Q = waterMass * (finalTemperature - initialTemperature) * 4184
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Displays result
        System.out.println("The energy needed to heat the water is " + energy + " Joules.");

        // Closes scanner
        input.close();


        /*
         “The joule is a derived unit of energy in the International System of Units.
         It is equal to the energy transferred to (or work done on) an object when a
         force of one newton acts on that object in the direction of the force's motion
         through a distance of one metre (1 newton metre or N·m). It is also the energy
         dissipated as heat when an electric current of one ampere passes through a
         resistance of one ohm for one second. It is named after the English physicist
         James Prescott Joule.”
         – Wikipedia Encyclopedia
        */
    }
}

// Cite: w3schools.com, module "Java Tutorial"
// Cite: w3schools.com, article "Java User Input (Scanner)"
// Cite: oracle.com, article "[Java] Class Scanner"
// Cite: wikipedia.org, article "Joule"