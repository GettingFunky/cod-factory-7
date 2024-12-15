package gr.aueb.cf.ch10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VagArmstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> digitsList = new ArrayList<>();
        int userNum = 0;
        int userNumInit = 0;
        int sum = 0;
        int count = 0;
        int digit = 0;

        System.out.println("Please provide an integer to see if it is an Armstrong Number");
        userNum = in.nextInt();
        userNumInit = userNum;

        do {
            count++;
            digit = userNum % 10;
            digitsList.add(digit);
            userNum = userNum / 10;
        } while (userNum != 0);

        for (int item : digitsList) {
            sum += Math.pow(item, count);
        }

        if (userNumInit == sum) {
            System.out.printf("Number %d is an Armstrong Number, as the sum of its digits raised to %d is also %d\n", userNumInit, count, sum);
        }
        else {
            System.out.printf("Number %d is not an Armstrong Number, as the sum of its digits raised to %d is %d\n", userNumInit, count, sum);
        }
    }
}
