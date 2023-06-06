package begginerLevel;

import java.util.Map;
import java.util.Scanner;

public class ChefAndCandies {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            if ((a > b) && (a - b) % 4 == 0) {
                System.out.println((a - b) / 4);
            } else if ((a > b) && (a - b) % 4 != 0) {
                System.out.println(((a - b) / 4) + 1);
            } else {
                System.out.println(0);
            }
            t--;
        }
    }
}