package gr.aueb.cf.ch5;

import java.util.Scanner;

public class VagEx2Celsius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;

        System.out.println("Please give Celsius degrees to be converted to Fahrenheit");

        do {

        celsius = in.nextDouble();

        }
        while (celsius < -99 && celsius > 1000);

        fahrenheit = celsiusToFahrenheit(celsius);

        System.out.printf("%.2f celsius degrees are converted to %.2f Fahrenheit degrees", celsius, fahrenheit);
    }
    public static double celsiusToFahrenheit(double celsius)    {
        return celsius * 9 / 5 + 32;
    }
}
