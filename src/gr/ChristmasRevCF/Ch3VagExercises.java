package gr.ChristmasRevCF;

import java.util.Scanner;

public class Ch3VagExercises {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean lightsOn = false;
        int carSpeed = 0;

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("1. Lights are on App");
        System.out.println("*****************************************************************");


        isRaining = getBooleanInput(in, "Is it raining? Please reply with 'true' or 'false'");
        isDark = getBooleanInput(in, "Is it dark? Please reply with 'true' or 'false'");
        carSpeed = getIntInput(in, "What is the current speed in km per hour?");


        System.out.println("Lights are on state: " + lightsOn(isRaining, isDark, carSpeed));

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("2. First 10 Integers Sum");
        System.out.println("*****************************************************************");
        System.out.println(first10IntegersSum());

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("3. First N Integers Sum");
        System.out.println("*****************************************************************");
        System.out.println(firstNIntegersSum(in));

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("4. First N Integers Mul");
        System.out.println("*****************************************************************");
        System.out.println(firstNIntegersMul(in));

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("5. 1st Exercise Leap Year");
        System.out.println("*****************************************************************");
        System.out.println("Year provided is a leap year:" + leapYear(in));

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("6. 2nd Exercise Leap Year");
        System.out.println("*****************************************************************");
        menuExercise(in);


    }

    public static boolean getBooleanInput(Scanner in, String prompt) {
        while (true) {
            System.out.println(prompt);
            if (in.hasNextBoolean()) {
                return in.nextBoolean();
            } else {
                System.out.println("Invalid input. Please reply with 'true' or 'false'.");
                in.next(); // Consume invalid input
            }
        }
    }

    public static int getIntInput(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (in.hasNextInt()) {
                return in.nextInt();
            } else {
                System.out.println("Invalid input. Please provide a valid integer");
                in.next();
            }
        }
    }

    public static boolean lightsOn(boolean isRaining, boolean isDark, int carSpeed) {
        final int MAX_SPEED = 100;
        return isRaining && (isDark || carSpeed > MAX_SPEED);
    }

    public static int first10IntegersSum() {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static int firstNIntegersSum(Scanner in) {
        int sum = 0;
        int i = 1;
        int userNum = getIntInput(in, "Please provide an integer to calculate the sum, starting from number 1 \n");

        while (i <= userNum) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static int firstNIntegersMul(Scanner in) {
        int sum = 1;
        int i = 1;
        int userNum = getIntInput(in, "Please provide an integer to calculate the mul, starting from number 1 \n");
        while (i <= userNum) {
            sum *= i;
            i++;
        }
        return sum;
    }

    public static boolean leapYear(Scanner in) {
        int userNum = getIntInput(in, "Please provide a year to see if it is a leap year \n");
        return ((userNum % 4 == 0) && (userNum % 100 != 0)) || (userNum % 400 == 0);

    }

    public static void menuExercise(Scanner in) {
        while (true) {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            int userChoice = getIntInput(in, "Please select an Option \n");
            if (userChoice > 5 || userChoice < 1) {
                System.out.println("Provide an option between 1 and 5");
                continue;
            }
            if (userChoice == 5) {
                break;
            }
            if (userChoice == 1) {
                System.out.println("Εισαγωγή");
            } else if (userChoice == 2) {
                System.out.println("Διαγραφή");
            } else if (userChoice == 3) {
                System.out.println("Ενημέρωση");
            } else {  // choice == 4
                System.out.println("Αναζήτηση");
            }
        }
    }
}
