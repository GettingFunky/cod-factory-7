package gr.aueb.cf.ch2;

/**
 * Counts steps up, distance down by one
 */
public class CounterApp {

    public static void main(String[] args) {
        int steps = 0;
        int distance = 3;

        System.out.printf("You took %d steps! %d to go!\n", steps++, distance--);
        System.out.printf("You took %d step! %d to go!\n", steps++, distance--);
        System.out.printf("You took %d steps! %d to go!\n", steps++, distance--);
        System.out.printf("You took %d steps! %d to go!\n", steps++, distance--);
    }
}
