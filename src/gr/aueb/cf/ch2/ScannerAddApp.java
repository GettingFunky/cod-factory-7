package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ScannerAddApp {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in) ;

        // Entoles
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2 ;

        //Ektypwsi Apotelesmatwn
        System.out.printf("To athrisma %d kai %d einai %d", num1, num2, sum);
    }
}
