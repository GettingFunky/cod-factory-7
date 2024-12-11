//package gr.aueb.cf.ch2;
//
//public class TwoDicesRandom {
//
//    public static void main(String[] args) {
//        int die1 = 0;
//        int die2 = 0;
//
//        die1 = (int) (Math.random() * 6) + 1;
//        die2 = (int) (Math.random() * 6) + 1;
//
//        System.out.printf("Die1: %d \nDie2: %d", die1, die2);
//    }
//}

package gr.aueb.cf.ch2;

public class TwoDicesRandom {

    public static void main(String[] args) {
        int die1;
        int die2;
        int rollCount = 0;

        do {
            // Generate random values for both dice
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            rollCount++;

            System.out.printf("Roll %d - Die1: %d, Die2: %d%n", rollCount, die1, die2);

        } while (die1 != 6 || die2 != 6); // Keep rolling until both are 6

        System.out.printf("It took %d rolls to get both dice to show 6.", rollCount);
    }
}
