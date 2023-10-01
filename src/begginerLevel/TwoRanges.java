package begginerLevel;

import java.util.HashSet;
import java.util.Scanner;

public class TwoRanges {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of testcases

        for (int i = 0; i < t; i++) {

            int h = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int c = scanner.nextInt();

            HashSet<Integer> hs = new HashSet<>();
            for (int k = h; k <x; k++) {
                hs.add(i);
            }
            for (int p =y; p < c; p++) {

                hs.add(p);
            }
            System.out.println(hs.size());
        }
    }
}
