package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefInFantasyLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int p[] = new int[n];
            int type[] = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                type[i] = sc.nextInt();
            }
            int minDefender = Integer.MAX_VALUE;
            int minForward = Integer.MAX_VALUE;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (type[i] == 0) {
                    minDefender = Math.min(minDefender, p[i]);
                } else {
                    minForward = Math.min(minForward, p[i]);
                }
            }
            if (minForward != Integer.MAX_VALUE && minDefender != Integer.MAX_VALUE &&
                    (minForward + minDefender + s) <= 100) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }
}
