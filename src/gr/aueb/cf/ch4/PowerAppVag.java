package gr.aueb.cf.ch4;

import java.util.Scanner;

public class PowerAppVag {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int exponent = 0;
        int powerResult = 1;

        System.out.println("Please provide the base and the exponent");
        base = in.nextInt();
        exponent = in.nextInt();

        for (int i = 1; i <= exponent; i++) {
            powerResult = base * powerResult;
        }

        System.out.printf("Looping gets %d as a result", powerResult);
    }
}
