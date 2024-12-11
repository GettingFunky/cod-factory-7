package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MinAppVag {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please provide 2 integers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num1 < num2) {
            min = num1;
            System.out.println("Min number is " + min);
        } else if (num1 > num2) {
            min = num2;
            System.out.println("Min number is " + min);
        } else {
            System.out.println("Not a min number to be displayed");
        }
    }
}