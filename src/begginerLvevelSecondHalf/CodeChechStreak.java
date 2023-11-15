package begginerLvevelSecondHalf;

import javax.sound.midi.MidiFileFormat;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CodeChechStreak {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int countAddy = 0;
            int countOm = 0;
            int maxCountAddy = 0; // Track the maximum count for Addy
            int maxCountOm = 0;   // Track the maximum count for Om

            int addy[] = new int[n];
            int om[] = new int[n];

            for (int i = 0; i < n; i++) {
                addy[i] = sc.nextInt();
                if (addy[i] != 0) {
                    countAddy++;
                    // Update maxCountAddy if the current count is greater
                    maxCountAddy = Math.max(maxCountAddy, countAddy);
                } else {
                    countAddy = 0;
                }
            }

            for (int i = 0; i < n; i++) {
                om[i] = sc.nextInt();
                if (om[i] != 0) {
                    countOm++;
                    // Update maxCountOm if the current count is greater
                    maxCountOm = Math.max(maxCountOm, countOm);
                } else {
                    countOm = 0;
                }
            }

            // Compare the maximum counts
            if (maxCountOm < maxCountAddy) {
                System.out.println("Om");
            } else if (maxCountOm > maxCountAddy) {
                System.out.println("Addy");
            } else {
                System.out.println("Draw");
            }
        }

        sc.close();
    }
}