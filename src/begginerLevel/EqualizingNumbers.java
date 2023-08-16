package begginerLevel;

import java.util.Scanner;

public class EqualizingNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (Math.abs(a-b) % 2 ==0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}