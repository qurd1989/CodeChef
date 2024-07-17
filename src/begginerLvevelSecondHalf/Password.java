package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            if (isSecure(s)){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }

    private static boolean isSecure(String str) {
        int n = str.length();
        if (n < 10) {
            return false;
        }
        boolean hasLower = false;
        boolean hasUpperInside = false;
        boolean hasDigitInside = false;
        boolean hasSpecialInside = false;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                hasLower = true;
            }
            if (i > 0 && i < n - 1) {
                if (Character.isUpperCase(ch)) {
                    hasUpperInside = true;
                } else if (Character.isDigit(ch)) {
                    hasDigitInside = true;
                } else if (ch == '@' || ch == '#' || ch == '%' || ch == '&' || ch == '?') {
                    hasSpecialInside = true;
                }
            }
        }
            return hasLower && hasDigitInside && hasSpecialInside && hasUpperInside;
        }
    }
