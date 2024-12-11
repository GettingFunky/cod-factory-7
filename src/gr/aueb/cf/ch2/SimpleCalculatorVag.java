package gr.aueb.cf.ch2;

import java.io.PrintStream;
import java.util.Scanner;

public class SimpleCalculatorVag {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int pow, max, min = 0;

        System.out.println("Παρακαλώ δώστε 2 ακέραιους για τον υπολογισμό");
        num1 = in.nextInt();
        num2 = in.nextInt();
        pow = (int) Math.pow(num1, num2);
        max = Math.max(num1, num2);
        min = Math.min(num1,num2);

        System.out.printf("Πρόσθεση: %d\n", num1 + num2);
        System.out.printf("Αφαίρεση: %d\n", num1 - num2);
        System.out.printf("Γινόμενο: %d\n", num1 * num2);
        System.out.printf("Πηλίκο: %d\n", num1 / num2);
        System.out.printf("Υπολοιπο: %d\n", num1 % num2);
        System.out.printf("Τετράγωνο: %d\n", pow);
        System.out.printf("Μεγαλύτερος Αριθμός: %d\n", max);
        System.out.printf("Μικρότερος Αριθμός: %d\n", min);

    }
}
