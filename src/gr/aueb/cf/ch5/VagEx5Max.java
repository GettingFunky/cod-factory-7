package gr.aueb.cf.ch5;

import java.util.Scanner;

public class VagEx5Max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int int1 = 0;
        int int2 = 0;
        int int3 = 0;

        System.out.println("Please enter 3 integers to find the biggest");
        int1 = sc.nextInt();
        int2 = sc.nextInt();
        int3 = sc.nextInt();

        max = findMax(int1, int2, int3);

        System.out.printf("The biggest number among %d, %d and %d is: %d", int1, int2, int3, max);
    }

    public static int findMax(int int1, int int2, int int3) {
        int max = Math.max(int1, Math.max(int2, int3));
        return max;
    }
}
