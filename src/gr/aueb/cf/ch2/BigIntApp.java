package gr.aueb.cf.ch2;


import java.math.BigInteger;

/**
 * Big Integer demo
 */

public class BigIntApp {

    public static void main(String[] args) {
        //declarations and initializations
        BigInteger bigNum1 = new BigInteger("6546513654654654");
        BigInteger bigNum2 = new BigInteger("6546546546546546");
        BigInteger result;

        //commands
        result = bigNum1.add(bigNum2);

        //printing the result
        System.out.printf("%,d", result);
    }
}
