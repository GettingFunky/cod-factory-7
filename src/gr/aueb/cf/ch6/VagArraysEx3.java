package gr.aueb.cf.ch6;

import java.util.Scanner;

public class VagArraysEx3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int [6];
        int evenCounter = 0;
        int oddCounter = 0;

        System.out.println("Please provide 6 integers from 1 to 49");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter integer " + (i + 1) + " of 6");
            array[i] = in.nextInt();
            while (array[i] > 49 || array[i] < 1) {
                System.out.println("Not an acceptable integer. Values from 1 to 49 are accepted. Try again");
                array[i] = in.nextInt();
            }
            if (array[i] % 2 == 0) {
                evenCounter++;
                if (evenCounter > 3) {
                    System.out.println("Περισσότεροι από 3 άρτιοι αριθμοί");
                    break;
                }
            } else {
                oddCounter++;
                if (oddCounter > 3) {
                    System.out.println("Περισσότεροι από 3 περιττοί αριθμοί");
                    break;
                }
            }
            if (i >= 3) {
                if (array[i] == array[i-1] + 1 && array[i-1] == array[i-2] + 1 && array[i-2] == array[i-3] + 1) {
                    System.out.println("Βρέθηκαν πάνω από 3 συνεχόμενοι αριθμοί");
                    break;
                }
            }


        }
    }
}
