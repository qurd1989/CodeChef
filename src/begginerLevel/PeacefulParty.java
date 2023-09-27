package begginerLevel;

import java.util.Scanner;

public class PeacefulParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Number of test cases

        for (int t = 0; t < T; t++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a + c > b) {
                System.out.println(c + a);
            }else
                System.out.println(b);
        }
    }
}
