package begginerLevel;

import java.util.Scanner;

public class CountingPrettyNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count  = 0;
            int prettyNumber = 0;
            for (int i = l; i <= r; i++) {
                 prettyNumber = i %10;
                 if (prettyNumber == 2 || prettyNumber == 3 || prettyNumber == 9) {
                     count++;
                 }
            }
            System.out.println(count);
        }
    }
}
