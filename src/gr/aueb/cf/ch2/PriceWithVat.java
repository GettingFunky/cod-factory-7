package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates price with vat 24%
 */

public class PriceWithVat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double priceInput = 0.0;
        double priceOnlyVat = 0.0;
        double priceFinal = 0.0;
        final double VAT = 0.24;

        System.out.println("Παρακαλώ δώστε ποσό ώστε να μετατραπεί σε τιμή με ΦΠΑ");
        priceInput = in.nextDouble();

        priceOnlyVat = priceInput * VAT;
        priceFinal = priceInput + priceOnlyVat;

        System.out.printf("The amount %.2f, has a VAT of %.2f, which makes a total amount of %.2f"
                , priceInput, priceOnlyVat, priceFinal);

    }
}
