package gr.codeWars.java;

public class PianoKataPt2 {

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
        if (positionInOctave == 1) {
            return "A";
        } else if (positionInOctave == 2) {
            return "A#";
        } else if (positionInOctave == 3) {
            return "B";
        } else if (positionInOctave == 4) {
            return "C";
        } else if (positionInOctave == 5) {
            return "C#";
        } else if (positionInOctave == 6) {
            return "D";
        } else if (positionInOctave == 7) {
            return "D#";
        } else if (positionInOctave == 8) {
            return "E";
        } else if (positionInOctave == 9) {
            return "F";
        } else if (positionInOctave == 10) {
            return "F#";
        } else if (positionInOctave == 11) {
            return "G";
        } else {
            return "G#";}
    }
}
