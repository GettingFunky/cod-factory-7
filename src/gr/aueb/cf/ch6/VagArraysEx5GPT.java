import java.util.*;

public class VagArraysEx5GPT {
    public static void main(String[] args) {
        // Αρχικός δισδιάστατος πίνακας με ώρες άφιξης και αναχώρησης
        int[][] arr = {
                {1012, 1136},
                {1317, 1417},
                {1015, 1020}
        };

        // Δημιουργία νέου δισδιάστατου πίνακα για τα γεγονότα
        // Κάθε γραμμή θα έχει δύο στοιχεία: [ώρα, τύπος (1 για άφιξη, 0 για αναχώρηση)]
        int[][] events = new int[arr.length * 2][2];

        // Μετατροπή των αφίξεων και αναχωρήσεων σε γεγονότα
        int index = 0; // Δείκτης για τον πίνακα events
        for (int i = 0; i < arr.length; i++) {
            events[index][0] = arr[i][0]; // Ώρα άφιξης
            events[index][1] = 1;        // Τύπος 1 (άφιξη)
            index++;

            events[index][0] = arr[i][1]; // Ώρα αναχώρησης
            events[index][1] = 0;         // Τύπος 0 (αναχώρηση)
            index++;
        }

        // Ταξινόμηση του πίνακα events με βάση την ώρα
        // Σε περίπτωση ισοπαλίας, οι αναχωρήσεις (0) προηγούνται των αφίξεων (1)
        Arrays.sort(events, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        // Υπολογισμός του μέγιστου αριθμού αυτοκινήτων
        int maxCars = 0;       // Το μέγιστο πλήθος αυτοκινήτων
        int currentCars = 0;   // Τα αυτοκίνητα που είναι παρόντα τη δεδομένη στιγμή

        for (int i = 0; i < events.length; i++) {
            if (events[i][1] == 1) {
                currentCars++; // Άφιξη: αυξάνουμε τα αυτοκίνητα
            } else {
                currentCars--; // Αναχώρηση: μειώνουμε τα αυτοκίνητα
            }
            // Ενημέρωση του μέγιστου αριθμού αυτοκινήτων
            maxCars = Math.max(maxCars, currentCars);
        }

        // Εκτύπωση του αποτελέσματος
        System.out.println("Μέγιστος αριθμός αυτοκινήτων που ήταν σταθμευμένα ταυτόχρονα: " + maxCars);
    }
}