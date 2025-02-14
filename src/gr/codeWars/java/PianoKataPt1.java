package gr.codeWars.java;

public class PianoKataPt1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++ ) {
            System.out.println(blackOrWhiteKey(i));
        }


    }
    public static String blackOrWhiteKey(int keyPressCount) {
        // Find the position on the 88-key piano
        int positionOnPiano = keyPressCount % 88;
        if (positionOnPiano == 0) {
            positionOnPiano = 88; // Wrap around to the last key
        }

        // Find the position within the octave (1-12)
        int positionInOctave = positionOnPiano % 12;
        if (positionInOctave == 0) {
            positionInOctave = 12; // Wrap around to the last key in the octave
        }

        // Determine if the key is black
        if (positionInOctave == 2 || positionInOctave == 5 || positionInOctave == 7 || positionInOctave == 10 || positionInOctave == 12) {
            return "black";
        } else {
            return "white";
        }
    }
}
