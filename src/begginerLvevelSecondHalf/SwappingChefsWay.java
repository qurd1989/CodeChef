package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingChefsWay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            char[] original = s.toCharArray();
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);

            boolean possible = true;
            for (int i = 0; i < n / 2; i++) {
                char origStart = original[i];
                char origEnd = original[n - i - 1];
                char sortedStart = sorted[i];
                char sortedEnd = sorted[n - i - 1];
                if (!canBeSwapped(origStart, origEnd, sortedStart, sortedEnd)) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }

    private static boolean canBeSwapped(char a1, char a2, char b1, char b2) {
        return (a1 == b1 && a2 == b2) || (a1 == b2 && a2 == b1);
    }
}