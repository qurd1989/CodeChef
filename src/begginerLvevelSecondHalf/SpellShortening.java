package begginerLvevelSecondHalf;

import java.util.Scanner;

public class SpellShortening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean modified = false; // Flag to track if a modification occurred

            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) > s.charAt(i + 1)) {
                    s = s.substring(0, i) + s.substring(i + 1); // Remove the larger character
                    modified = true;
                    break;
                }
            }

            if (!modified) { // If no modification happened, remove the last character
                s = s.substring(0, s.length() - 1);
            }

            System.out.println(s);
        }

        sc.close();
    }
}