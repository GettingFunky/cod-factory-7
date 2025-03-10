package gr.codeWars.java;

public class NumbersToLetters {

    public static String switcher(String[] arr) {
        StringBuilder result = new StringBuilder();

        for (String s : arr) {
            if (s.equals("27")) {
                result.append("!");
            } else if (s.equals("28")) {
                result.append("?");
            } else if (s.equals("29")) {
                result.append(" ");
            } else {
                // Μετατροπή του string σε ακέραιο
                int num = Integer.parseInt(s);
                // Εφαρμογή του τύπου: (27 - num) + 96 για να βρούμε το ASCII
                int asciiCode = (27 - num) + 96;
                result.append((char) asciiCode);
            }
        }

        return result.toString();
    }
}