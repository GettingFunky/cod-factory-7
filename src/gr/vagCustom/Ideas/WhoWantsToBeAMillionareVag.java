package gr.vagCustom.Ideas;

import java.util.Scanner;

public class WhoWantsToBeAMillionareVag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        timeDelay(1000);
        System.out.println("********************************************");
        timeDelay(1000);
        System.out.println("Καλώς Ορίσατε στο «Ποιος Θέλει να γίνει εκατομμυριούχος;");
        System.out.println();
        timeDelay(1000);
        System.out.println("Πείτε μου πως θέλετε να σας αποκαλώ;");
        String playerName = sc.nextLine();

        System.out.printf("Καλώς Ορίσατε %s ! Ας παίξουμε!\n", playerName);
        timeDelay(1000);

        int question1 = question1(sc);
        System.out.printf("Δώσατε την απάντηση νούμερο %d \n",question1);
        timeDelay(1000);
        System.out.println("Η απάντηση που δώσατε είναι...");
        timeDelay(1000);
        if (question1 == 2) {
            System.out.println("Σωστή Απάντηση!");
        } else {
            wrongAnswer();
        }

        int question2 = question2(sc);
        System.out.printf("Δώσατε την απάντηση νούμερο %d \n",question2);
        timeDelay(1000);
        System.out.println("Η απάντηση που δώσατε είναι...");
        timeDelay(2000);
        if (question2 == 1) {
            System.out.println("Σωστή Απάντηση!");
        } else {
            wrongAnswer();
        }

        int question3 = question3(sc);
        System.out.printf("Δώσατε την απάντηση νούμερο %d \n",question3);
        timeDelay(1000);
        System.out.println("Η απάντηση που δώσατε είναι...");
        timeDelay(3000);
        if (question3 == 2) {
            System.out.println("Σωστή Απάντηση!");
        } else {
            wrongAnswer();
        }

        timeDelay(1000);
        System.out.printf("Πολύ καλά %s!! Φτάσατε ήδη στην τέταρτη ερώτηση. Ας συνεχίσουμε..\n", playerName);
        timeDelay(1000);

        int question4 = question4(sc);
        System.out.printf("Δώσατε την απάντηση νούμερο %d \n",question4);
        timeDelay(1000);
        System.out.println("Η απάντηση που δώσατε είναι...");
        timeDelay(3000);
        if (question4 == 3) {
            System.out.println("Σωστή Απάντηση!");
        } else {
            wrongAnswer();
        }

        int question5 = question5(sc);
        System.out.printf("Δώσατε την απάντηση νούμερο %d \n",question5);
        timeDelay(1000);
        System.out.println("Η απάντηση που δώσατε είναι...");
        timeDelay(4000);
        if (question5 == 2) {
            System.out.println("Σωστή Απάντηση!");
        } else {
            wrongAnswer();
        }

        int question6 = question6(sc);
        System.out.printf("Δώσατε την απάντηση νούμερο %d \n",question6);
        timeDelay(1000);
        System.out.println("Η απάντηση που δώσατε είναι...");
        timeDelay(3000);
        System.out.println("Ας μας δώσετε την σωστή απάντηση παρακαλώ..");
        timeDelay(3000);
        if (question6 == 2) {
            System.out.println("Σωστή Απάντηση!");
        } else {
            wrongAnswer();
        }

        timeDelay(1000);
        System.out.printf("Εξαιρετικά!!! %s!! 3 ερωτήσεις έμειναν..\n", playerName);
        timeDelay(1000);
        System.out.println("Από εδώ και πέρα το παιχνίδι γίνεται δύσκολο.. Ας προχωρήσουμε");
        timeDelay(1000);

        int question7 = question7(sc);
        System.out.printf("Δώσατε την απάντηση νούμερο %d \n",question7);
        timeDelay(2000);
        System.out.println("Η απάντηση που δώσατε είναι...");
        timeDelay(6000);
        if (question7 == 1) {
            System.out.println("Σωστή Απάντηση!");
        } else {
            System.out.println("Δυστυχώς.....");
            timeDelay(1000);
            wrongAnswer();
        }

        timeDelay(1000);
        System.out.println("Είστε πολύ κοντά!!! Μόλις 2 ερωτήσεις έμειναν..");
        timeDelay(1000);
        System.out.println("Ελάχιστοι παίκτες φτάνουμε έως αυτό το σημείο. Για να δούμε...");
        timeDelay(1000);

        int question8 = question8(sc);
        System.out.printf("Δώσατε την απάντηση νούμερο %d \n",question8);
        timeDelay(1000);
        System.out.println("Η απάντηση που δώσατε είναι...");
        timeDelay(4000);
        System.out.println("Ας δούμε τη σωστή απάντηση παρακαλώ...");
        timeDelay(4000);
        if (question8 == 2) {
            System.out.println("Σωστή Απάντηση!!!!!!!!");
        } else {
            System.out.println("Όοοοοχιιιι! Τόσο κοντά αλλά τόσο μακριά.....");
            timeDelay(100);
            System.out.println("Ρισκάρατε αλλά δεν σας βγήκε");
            wrongAnswer();
        }

        timeDelay(1000);
        System.out.println("Εξαιρετικά!!! Μια τελευταία ερώτηση έμεινε!..");
        timeDelay(1000);
        System.out.printf("Δώσε μας ό,τι έχεις %s!\n", playerName);
        System.out.println("Για τα 50.000 ευρώ. Είστε ο μόνος παίκτης που έχει φτάσει φέτος έως εδώ");
        timeDelay(1000);
        System.out.println("Ας δούμε την ερώτηση. Μια σωστή απάντηση και είστε ο μεγάλος νικητής!!");
        timeDelay(1000);

        int question9 = question9(sc);
        System.out.printf("Δώσατε την απάντηση νούμερο %d \n",question9);
        System.out.println("Η απάντηση που δώσατε είναι...");
        timeDelay(8000);
        System.out.println("Ας μας δώσετε την σωστή απάντηση παρακαλώ..Για τα 50.000 ευρώ..........");
        timeDelay(8000);
        if (question9 == 4) {
            System.out.println("Σωστή Απάντηση!");
            timeDelay(100);
            System.out.println("Εξαιρετικά!!! Είστε ο μεγάλος νικητής!!!..");
            timeDelay(500);
            System.out.println("50.000 ευρώ!!!!!!!!!");
            timeDelay(100);
            System.out.println("Συγχαρητήρια!!");
            timeDelay(500);
            System.out.println("Ευχαριστούμε που παίξατε!! Καλό βράδυ!!!");
        } else {
            System.out.println("Όοοοοχιιιι! Τόσο κοντά αλλά τόσο μακριά.....");
            timeDelay(100);
            System.out.println("Ρισκάρατε αλλά δεν σας βγήκε");
            wrongAnswer();
        }


    }


    public static void timeDelay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void wrongAnswer() {
        System.out.println("Λάθος Απάντηση.. Λυπάμαι");
        timeDelay(100);
        System.out.println("Ευχαριστούμε που παίξατε");
        System.exit(0);
    }

    public static int[] fiftyFifty(int correctAnswer) {
        int[] arr = new int[2];
        arr[0] = correctAnswer;
        do {
            int rand = (int) ((Math.random() * 4) + 1);
            arr[1] = rand;
        }  while (arr[1] == correctAnswer) ;

        if (Math.random() < 0.5) { // 50% πιθανότητα
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        return arr;

    }

    public static int question1(Scanner sc) {
        System.out.println("Πρώτη Ερώτηση για τα 100 ευρώ..");
        timeDelay(500);
        System.out.println("Ποιο είναι το κύριο συστατικό για την παρασκευή ψωμιού;");
        System.out.println("1. Ζάχαρη");
        System.out.println("2. Αλεύρι");
        System.out.println("3. Νερό");
        System.out.println("4. Λάδι");
        System.out.println();
        System.out.println("Για βοήθεια 50/50 πατήστε το 9");
        if (sc.nextInt() == 9) {
            int[] options = fiftyFifty(2);
            System.out.println("Πλέον οι σωστή απάντηση μπορεί να είναι είτε η " + options[0] + " είτε η " + options[1]);
        }

        return sc.nextInt();
    }

    public static int question2(Scanner sc) {
        System.out.println("Δεύτερη Ερώτηση για τα 200 ευρώ..");
        timeDelay(500);
        System.out.println("Ποιο ζώο είναι γνωστό ως \"βασιλιάς της ζούγκλας\";");
        System.out.println("1. Λιοντάρι");
        System.out.println("2. Τίγρης");
        System.out.println("3. Ελέφαντας");
        System.out.println("4. Λεοπάρδαλη");
        System.out.println();
        System.out.println("Για βοήθεια 50/50 πατήστε το 9");
        if (sc.nextInt() == 9) {
            int[] options = fiftyFifty(1);
            System.out.println("Πλέον οι σωστή απάντηση μπορεί να είναι είτε η " + options[0] + " είτε η " + options[1]);
        }
        return sc.nextInt();
    }

    public static int question3(Scanner sc) {
        System.out.println("Τρίτη Ερώτηση για τα 500 ευρώ..");
        timeDelay(500);
        System.out.println("Πόσα πόδια έχει μια αράχνη;");
        System.out.println("1. 6");
        System.out.println("2. 8");
        System.out.println("3. 10");
        System.out.println("4. 12");
        System.out.println();
        System.out.println("Για βοήθεια 50/50 πατήστε το 9");
        if (sc.nextInt() == 9) {
            int[] options = fiftyFifty(2);
            System.out.println("Πλέον οι σωστή απάντηση μπορεί να είναι είτε η " + options[0] + " είτε η " + options[1]);
        }
        return sc.nextInt();
    }

    public static int question4(Scanner sc) {
        System.out.println("Τέταρτη Ερώτηση για τα 1.000 ευρώ..");
        timeDelay(1000);
        System.out.println("Ποιο είναι το μεγαλύτερο σε έκταση κράτος στον κόσμο;");
        System.out.println("1. Καναδάς");
        System.out.println("2. Ηνωμένες Πολιτείες");
        System.out.println("3. Ρωσία");
        System.out.println("4. Κίνα");
        System.out.println();
        System.out.println("Για βοήθεια 50/50 πατήστε το 9");
        if (sc.nextInt() == 9) {
            int[] options = fiftyFifty(3);
            System.out.println("Πλέον οι σωστή απάντηση μπορεί να είναι είτε η " + options[0] + " είτε η " + options[1]);
        }
        return sc.nextInt();
    }

    public static int question5(Scanner sc) {
        System.out.println("Πέμπτη Ερώτηση για τα 2.500 ευρώ..");
        timeDelay(1000);
        System.out.println("Ποιο στοιχείο έχει το χημικό σύμβολο 'O';");
        System.out.println("1. Χρυσός");
        System.out.println("2. Οξυγόνο");
        System.out.println("3. Υδρογόνο");
        System.out.println("4. Νάτριο");
        System.out.println();
        System.out.println("Για βοήθεια 50/50 πατήστε το 9");
        if (sc.nextInt() == 9) {
            int[] options = fiftyFifty(2);
            System.out.println("Πλέον οι σωστή απάντηση μπορεί να είναι είτε η " + options[0] + " είτε η " + options[1]);
        }
        return sc.nextInt();
    }

    public static int question6(Scanner sc) {
        System.out.println("Έκτη Ερώτηση για τα 5.000 ευρώ..");
        timeDelay(1000);
        System.out.println("Ποιο έτος συνέβη η πτώση του Τείχους του Βερολίνου;");
        System.out.println("1. 1985");
        System.out.println("2. 1989");
        System.out.println("3. 1991");
        System.out.println("4. 1993");
        System.out.println();
        System.out.println("Για βοήθεια 50/50 πατήστε το 9");
        if (sc.nextInt() == 9) {
            int[] options = fiftyFifty(2);
            System.out.println("Πλέον οι σωστή απάντηση μπορεί να είναι είτε η " + options[0] + " είτε η " + options[1]);
        }
        return sc.nextInt();
    }

    public static int question7(Scanner sc) {
        System.out.println("Έβδομη Ερώτηση για τα 10.000 ευρώ..");
        timeDelay(1000);
        System.out.println("Ποιος έγραψε το έργο \"Οδυσσέας\";");
        System.out.println("1. Τζέιμς Τζόις");
        System.out.println("2. Όμηρος");
        System.out.println("3. Τολστόι");
        System.out.println("4. Κάφκα");
        System.out.println();
        System.out.println("Για βοήθεια 50/50 πατήστε το 9");
        if (sc.nextInt() == 9) {
            int[] options = fiftyFifty(1);
            System.out.println("Πλέον οι σωστή απάντηση μπορεί να είναι είτε η " + options[0] + " είτε η " + options[1]);
        }
        return sc.nextInt();
    }

    public static int question8(Scanner sc) {
        System.out.println("Όγδοη και Προτελευταία Ερώτηση για τα 20.000 ευρώ..");
        timeDelay(1000);
        System.out.println("Ποια είναι η πρωτεύουσα του Καζακστάν;");
        System.out.println("1. Αλμάτι");
        System.out.println("2. Αστάνα (Νουρσουλτάν)");
        System.out.println("3. Τασκένδη");
        System.out.println("4. Μπισκέκ");
        System.out.println();
        System.out.println("Για βοήθεια 50/50 πατήστε το 9");
        if (sc.nextInt() == 9) {
            int[] options = fiftyFifty(2);
            System.out.println("Πλέον οι σωστή απάντηση μπορεί να είναι είτε η " + options[0] + " είτε η " + options[1]);
        }
        return sc.nextInt();
    }

    public static int question9(Scanner sc) {
        System.out.println("Τελευταία Ερώτηση για τα 50.000 ευρώ..");
        timeDelay(1000);
        System.out.println("Ποια είναι η ταυτότητα του συγγραφέα που υπογράφει ως \"Λογοτέχνης\";");
        System.out.println("1. Κ. Π. Καβάφης");
        System.out.println("2. Αλέξανδρος Παπαδιαμάντης");
        System.out.println("3. Νίκος Καζαντζάκης");
        System.out.println("4. Αντώνης Σαμαράκης");
        System.out.println();
        System.out.println("Για βοήθεια 50/50 πατήστε το 9");
        if (sc.nextInt() == 9) {
            int[] options = fiftyFifty(4);
            System.out.println("Πλέον οι σωστή απάντηση μπορεί να είναι είτε η " + options[0] + " είτε η " + options[1]);
        }
        return sc.nextInt();
    }




}
