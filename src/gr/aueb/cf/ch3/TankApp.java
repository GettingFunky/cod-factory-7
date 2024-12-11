package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean tank1Low, tank2Low;
        boolean orangeLight, redLight = false;

        System.out.println("Παρακαλώ εισάγετε με true/false κατά πόσο η πρώτη δεξαμενή είναι κάτω από 25%");
        tank1Low = in.nextBoolean();

        System.out.println("Παρακαλώ εισάγετε με true/false κατά πόσο η δεύτερη δεξαμενή είναι κάτω από 25%");
        tank2Low = in.nextBoolean();

        orangeLight = tank1Low ^ tank2Low;
        redLight = tank1Low && tank2Low;

        System.out.printf("Κατάσταση orange light: %b \nΚατάσταση red light: %b  ", orangeLight, redLight);

    }
}
