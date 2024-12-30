package gr.ChristmasRevCF;

import java.util.Scanner;

public class Ch6VagExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the size of the array to be randomized");
        int arraySize = sc.nextInt();

        int[] randomArray = randomizeArray(new int[arraySize]);
        int maxPosition = getMaxPosition(randomArray, 0, randomArray.length);
        System.out.printf("Max array Position (starting from 0): %d \n", maxPosition);
        System.out.printf("Max array Value: %d \n", randomArray[maxPosition]);
        System.out.println();

        int minPosition = findSecondMin(randomArray);

        System.out.printf("Second Min array Position (starting from 0): %d \n", minPosition);
        System.out.printf("Second Min array Value: %d \n", randomArray[minPosition]);
        System.out.println();

        System.out.println("Please specify a number to be searched inside the array");
        int userRandomChoice = sc.nextInt();
        int positionFound = searchArray(userRandomChoice, randomArray);
        System.out.println();
        if (positionFound == -1) {
            System.out.printf("Number %d not found \n", userRandomChoice);
        } else System.out.printf("Number %d was found in position %d \n", userRandomChoice, positionFound);
        System.out.println();

        System.out.println("Filtering only even numbers from the list");
        evenNumFilter(randomArray);
        System.out.println();

        int[] doubledArray = doubleNumMapping(randomArray);
        System.out.println("Doubled values of the array:");
        for (int array : doubledArray) {
            System.out.print(array + " ");
        }
        System.out.println();

        System.out.println("Positive integers in array: " + isPositive(randomArray));
        System.out.println();

        System.out.println("ALL Positive integers in array: " + isAllPositive(randomArray));
        System.out.println();


    }

    public static int[] randomizeArray(int[] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();
        return randomArray;
    }
    public static int getMaxPosition (int[] arr, int low, int high) {
        int maxPosition = low;
        for (int i = low; i < high; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    public static int findSecondMin(int[] arr) {
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                minPosition = i;
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < secondMin) && (arr[i] != min)) {
                minPosition = i;
                secondMin = arr[minPosition];
            }
        }

        return minPosition;
    }

    public static int searchArray(int userRandomChoice, int[] randomArray) {
        int positionFound = -1;
        for (int i = 0; i < randomArray.length; i++) {
            if (userRandomChoice == randomArray[i]) {
                positionFound = i; // Store the index of the found element
                break; // Exit the loop once the element is found
            }
        }
        return positionFound;
    }

    public static void evenNumFilter(int[] randomArray) {
        for (int array : randomArray) {
            if (array % 2 == 0) {
                System.out.printf(array + " ");
            }
        }
        System.out.println();
    }

    public static int[] doubleNumMapping(int[] randomArray) {
        int[] doubledArray = new int[randomArray.length];
        for (int i = 0; i < randomArray.length; i++) {
            doubledArray[i] = randomArray[i] * 2;
        }
        return doubledArray;

}
    public static boolean isPositive(int[] randomArray) {
        boolean isPos = false;
        for(int array : randomArray) {
            if (array > 0) {
                isPos = true;
                break;
            }
        }
        return isPos;
    }

    public static boolean isAllPositive(int[] randomArray) {
        boolean isAllPos = true;
        for(int array : randomArray) {
            if (array <= 0) {
                isAllPos = false;
                break;
            }
        }
        return isAllPos;
    }
}


