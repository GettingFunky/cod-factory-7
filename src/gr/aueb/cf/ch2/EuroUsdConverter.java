package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {

    public static void main(String[] args) {
        int euro = 0 ;
        int exch = 99 ;
        int dollars = 0 ;
        int cents = 0 ;
        Scanner in = new Scanner(System.in) ;

        System.out.println("Dwse ena poso se euros");
        euro = in.nextInt();

        dollars = euro * exch / 100 ;
        cents = euro * exch % 100 ;

        System.out.printf("H metatroph twn %d \u20AC einai \u0024%d kai %d cents", euro, dollars, cents);

    }
}
