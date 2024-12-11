package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DigitCountVag {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;
        int count = 0;

        System.out.println("Please insert input number to calculate digit number (not sum)");
        inputNum = in.nextInt();
        tempNum = inputNum;

        do {
            count++;
            tempNum = tempNum / 10;
        }   while (tempNum != 0);

        System.out.printf("Ο αριθμός ψηφίων του %d είναι %d", inputNum,count);
    }
}
