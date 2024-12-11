package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumOfDigitsVag {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int digitsSum = 0;
        int tempNum = 0;

        System.out.println("Please insert input number");
        inputNum = in.nextInt();
        tempNum = inputNum;

        while (inputNum != 0) {
            digitsSum = inputNum % 10 + digitsSum;
            inputNum = inputNum / 10;
        }

        System.out.printf("Η πρόσθεση ψηφίων του %d είναι %d", tempNum,digitsSum);

    }
}
