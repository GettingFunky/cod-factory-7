package gr.ChristmasRevCF;

public class Ch1VagChrAll {

    public static void main(String[] args) {
        int sum = 0;

        menuApp();
        initialsApp();

        sum = sumApp();

        System.out.println("To αποτέλεσμα της πρόσθεσης είναι ίσο με: " + sum);
    }
    public static void menuApp() {
        System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:\n");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
        System.out.println("Δώστε αριθμό επιλογής:\n");
    }

    public static void initialsApp() {
        System.out.println("************    ********");
        System.out.println("*          *    *       *");
        System.out.println("*          *    *        *");
        System.out.println("*          *    *       *");
        System.out.println("************    ********");
        System.out.println("*          *    *       *");
        System.out.println("*          *    *         *");
        System.out.println("*          *    *       *");
        System.out.println("************    ********");

    }
    public static int sumApp() {
        int num1 = 19;
        int num2 = 30;
        return num1 + num2 ;
    }
}
