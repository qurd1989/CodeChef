package begginerLevel;

import javax.sound.midi.MidiFileFormat;
import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class EasyPronunciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            if (inPresent(s)){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }

    }
    public static boolean inPresent(String s) {

        int consecutiveConsonants = 0;
        for (char c : s.toCharArray()){
            if (solve(c)) {
                consecutiveConsonants++;
                if (consecutiveConsonants > 4) {
                    return false;
                }
            }else
                    consecutiveConsonants =0;
            }

        return true;
    }

    public static  boolean solve(char s ) {
        // Check if the character is a vowel
        return "bcdfghjklmnpqrstvwxyz".contains(String.valueOf(s));
    }
}