package gr.aueb.cf.ch5;

import java.util.Scanner;

public class VagEx4Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        boolean result = false;

        System.out.println("Please enter an integer to find out if it is a prime number");

        inputNum = scanner.nextInt();

        result = isPrime(inputNum);

        System.out.printf("Number %d is prime: %b", inputNum, result);
    }
    public static boolean isPrime(int inputNum) {
        for (int i = 2; i < inputNum; i++) {
            if (inputNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
