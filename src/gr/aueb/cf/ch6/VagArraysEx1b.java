package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Creates a new array based on user input,
 * populates the array using random Math method,
 * and finds the second lowest value, based on low and high values
 * which are also given by the user.
 */
public class VagArraysEx1b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        int userChoice = 0;
        int low = 0;
        int high = 0;
        int range = 0;
        int minPosition = 0;
        int minValue = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        System.out.println("Please provide the amount of random integers");
        userInput = in.nextInt();

        System.out.printf("You chose %d integers. Randomizing with values between 0 and 99....\n", userInput);

        int[] arr = new int[userInput];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("*******************************");
        System.out.println("Do you need any limit?");
        System.out.println("Type: 1 if you want to search the max at the whole sequence");
        System.out.println("Type: 2 if you want to limit the search at a specific range");

        userChoice = in.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("You chose the whole sequence");
                low = 0;
                high = arr.length;
                break;
            case 2:
                System.out.println("Please provide a low and a high limit to begin the procedure:");
                System.out.println("Low limit of the sequence");
                low = in.nextInt();
                System.out.println("High limit of the sequence");
                high = in.nextInt();
                System.out.printf("Your search area is a number of %d integers\n", (high - low));
                break;
            default:
                System.out.println("Error in choice");
                break;
        }
        minPosition = low;
        minValue = arr[low];

        for (int i = low; i < high; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i];
            }
        }

//        for (int i=low; i <= high - 1; i++) {
//            if (arr[i] < minValue) {
//                minPosition = i;
//                minValue = arr[i];
//
//            }
//        }
//        arr[minPosition] = Integer.MAX_VALUE;
//        minValue = Integer.MAX_VALUE;
//
//        for (int j=low; j <= high - 1; j++) {
//                if (arr[j] < minValue) {
//                    minPosition = j;
//                    minValue = arr[j];
//                }
//        }



        System.out.printf("The second min number between %d and %d is: %d", low, high, min2);
    }




}


