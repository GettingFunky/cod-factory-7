package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOddAppVag {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please provide an integer");
        inputNum = scanner.nextInt();

        System.out.println(inputNum + " is even: " + isEven(inputNum));
        System.out.println(inputNum + " is odd: " + isOdd(inputNum));
    }

    public static boolean isEven(int inputNum) {
        return inputNum % 2 == 0 ;
    }

    public static boolean isOdd(int inputNum) {
        return !isEven(inputNum) ;
    }
}
