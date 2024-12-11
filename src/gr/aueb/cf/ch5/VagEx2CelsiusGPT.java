package gr.aueb.cf.ch5;

import java.util.Scanner;

public class VagEx2CelsiusGPT {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean isValidInput;

        // Input and validation loop handled in main
        do {
            System.out.println("Please enter Celsius degrees to be converted to Fahrenheit (-99 to 1000):");

            if (in.hasNextDouble()) { // Check if input is a valid number
                celsius = in.nextDouble();

                // Check if the input is within the acceptable range
                if (celsius >= -99 && celsius <= 1000) {
                    isValidInput = true; // Valid input, exit loop
                } else {
                    System.out.println("Error: Temperature must be between -99 and 1000. Try again.");
                    isValidInput = false;
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                isValidInput = false;
                in.next(); // Consume the invalid input to avoid an infinite loop
            }
        } while (!isValidInput);

        // Convert Celsius to Fahrenheit using the method
        double fahrenheit = celsiusToFahrenheit(celsius);

        // Display the result
        System.out.printf("The converted temperature is %.2f Fahrenheit degrees.%n", fahrenheit);
    }

    // Conversion method handles only the conversion logic
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}