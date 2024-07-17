package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndTheWildCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String s1 = sc.next();
            int count = 0;
            if (s1.length() != s.length()) {
                System.out.println("No");
                break;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == s1.charAt(i) || s.charAt(i) == '?' || s1.charAt(i) == '?') {
                    count++;
                }
            }
            if (count == s.length()) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }
}
