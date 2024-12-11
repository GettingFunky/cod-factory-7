package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuAppVagch3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inpNum = 0;

        while (true) {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            inpNum = sc.nextInt();

            switch (inpNum) {
                case 1:
                    System.out.println("Επιλέξατε Εισαγωγή");
                    break;
                case 2:
                    System.out.println("Επιλέξατε Διαγραφή");
                    break;
                case 3:
                    System.out.println("Επιλέξατε Ενημέρωση");
                    break;
                case 4:
                    System.out.println("Επιλέξατε Αναζήτηση");
                    break;
                case 5:
                    System.out.println("Έξοδος από το πρόγραμμα... ");
                    sc.close();
                    return;
                default:
                    System.out.println("Not a valid option, please repeat.");
                    break;
            }

//            if (inpNum <= 0 || inpNum>5) {
//                System.out.println("Not a valid option, please repeat");
//                continue;
//            }
//            if (inpNum == 5) {
//                System.out.println("Έξοδος από το πρόγραμμα... ");
//                break;
//            }
//            if (inpNum == 1) {
//                System.out.println("Επιλέξατε Εισαγωγή");
//                continue;
//            }
//            if (inpNum == 2) {
//                System.out.println("Επιλέξατε Διαγραφή");
//                continue;
//            }
//            if (inpNum == 3) {
//                System.out.println("Επιλέξατε Ενημέρωση");
//                continue;
//            }
//            if (inpNum == 4) {
//                System.out.println("Επιλέξατε Αναζήτηση");
//                continue;
//        }
    }
}
}
