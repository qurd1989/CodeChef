package begginerLvevelSecondHalf;

import java.util.Scanner;

public class BreakTheStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("Yes");
            }else if (n % 2 ==1 && d % 2 == 1) {
                System.out.println("Yes");
            }else if (n % 2 ==1 && d % 2 == 0)
                System.out.println("No");
        }
    }
}
