package gr.aueb.cf.ch3;

import java.util.Scanner;

public class GenericWhileCounterRepeat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;
        int times = 1;

        while (times <= 3) {
            System.out.println("Please insert start value, end value and step");
            start = in.nextInt();
            endValue = in.nextInt();
            step = in.nextInt();


            while (start <= endValue) {
                start = start + step;
                counter++;

        }
        System.out.println("Iterations count: " + counter);
        times++;
    }
}
}