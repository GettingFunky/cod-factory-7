package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TetragwnoKyvosVag {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum, squareNum, cubeNum = 0;

        System.out.println("Παρακαλώ δώστε ακέραιο για να πάρετε τετράγωνο και κύβο");

        inputNum = in.nextInt();
        squareNum = (int) Math.pow(inputNum,2);
        cubeNum = (int) Math.pow(inputNum,3);

        System.out.printf("Το τετράγωνο του %d είναι: %d, ενώ ο κύβος %d", inputNum, squareNum, cubeNum);
    }
}
