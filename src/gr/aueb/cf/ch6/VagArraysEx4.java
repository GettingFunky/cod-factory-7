package gr.aueb.cf.ch6;

import java.util.Scanner;

public class VagArraysEx4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int[] arr2 = {0, 0};
        System.out.println("Please provide a key: ");
        int key = in.nextInt();

        arr2 = getLowAndHighIndexOf(arr, key);

        if (arr2[0] == -1) {
            System.out.println("Specified number not found");
        } else {
            System.out.println("Lowest: " + ++arr2[0]);
            System.out.println("Highest: " + ++arr2[1]);
        }
    }

    private static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int lowPosition = -1;
        int highPosition = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (lowPosition == -1) {
                    lowPosition = i;
                }
                highPosition = i;
            }
        }
        return new int[]{lowPosition, highPosition};
    }

}
