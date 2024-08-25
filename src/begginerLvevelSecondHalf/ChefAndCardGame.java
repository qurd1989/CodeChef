package begginerLvevelSecondHalf;

import java.util.Scanner;
public class ChefAndCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean isGood = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    isGood = true;
                    break;
                }
            }

            if (isGood) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}