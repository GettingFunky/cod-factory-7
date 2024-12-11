package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PowerAppVag {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int exponent = 0;
        int powerResult;
        int powerMathResult = 0;
        int i;
        int times = 1;

        while (times <= 5) {
            System.out.println("Please provide the base and the exponent");
            base = in.nextInt();
            exponent = in.nextInt();

            powerResult = 1;
            i = 1;

            while (i <= exponent) {
                powerResult = base * powerResult;
                i++;
            }
            powerMathResult = (int) Math.pow(base, exponent);

            System.out.printf("Looping gets %d as a result, while math also gets %d \n", powerResult, powerMathResult);

            times++;
        }
    }
}