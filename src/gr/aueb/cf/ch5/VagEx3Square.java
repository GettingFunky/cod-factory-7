package gr.aueb.cf.ch5;

import java.util.Scanner;

public class VagEx3Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int result = 0;

        System.out.println("Please enter an integer to get its square");

        inputNum = scanner.nextInt();

        result = square(inputNum);

        System.out.printf("The square of %d is: %d", inputNum, result);
    }
    public static int square(int inputNum) {
        return inputNum*inputNum;
    }
}
