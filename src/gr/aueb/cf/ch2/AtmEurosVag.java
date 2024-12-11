package gr.aueb.cf.ch2;

import java.util.Scanner;

public class AtmEurosVag {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputEuros = 0;
        int notes500 = 0;
        int notes100 = 0;
        int notes50 = 0;
        int notes20 = 0;
        int notes10 = 0;
        int change = 0;

        System.out.println("Παρακαλώ είσάγετε το ποσό που θέλετε σε Euros");
        inputEuros = in.nextInt();

        notes500 = inputEuros/500;
        notes100 = (inputEuros%500)/100;
        notes50 =  ((inputEuros%500)%100)/50;
        notes20 =  (((inputEuros%500)%100)%50)/20;
        notes10 =  ((((inputEuros%500)%100)%50)%20)/10;
        change =  (((((inputEuros%500)%100)%50)%20)%10);

        System.out.printf("Πρόκειται να λάβετε %d χαρτονομίσματα των 500 Euros, %d χαρτονομίσματα των 100 Euros, " +
                "%d χαρτονομίσματα των 50 Euros, %d χαρτονομίσματα των 20 Euros, %d χαρτονομίσματα των 10 Euros, " +
                "καθώς και %d νομίσματα του 1 Euro", notes500,notes100, notes50, notes20, notes10, change);
    }
}
