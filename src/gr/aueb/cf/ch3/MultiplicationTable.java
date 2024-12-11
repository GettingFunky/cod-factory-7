package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;
        int i = 1;

        System.out.println("Please enter a positive integer");
        inputNum = in.nextInt();
        tempNum = inputNum ;

        while (i <= 10) {
            tempNum = inputNum * i;

            System.out.println(inputNum + " * " + i + " = " + tempNum);
            i++;

        }


    }


}
