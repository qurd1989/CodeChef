package begginerLvevelSecondHalf;

import java.util.Scanner;

public class PathParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n % 2 == 0 || (n + k) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
