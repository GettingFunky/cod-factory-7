package gr.aueb.cf.ch3;

/**
 * Calculate the sum and mul of the first 10 integers
 * Starting from 1
 */
public class SumMul {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;
        int j = 1;

        while (i <= 10) {
            // sum = sum + i;
            sum += i;
            i++;

        }

        while  (j <= 10) {
            //mul = mul * j;
            mul *= j;
            j++;
        }
        System.out.printf("Αθροισμα: %d, Γινόμενο: %d", sum, mul);
    }
}
