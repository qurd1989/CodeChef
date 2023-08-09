package begginerLevel;

import java.util.Scanner;

public class PaperCutting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Side length of the entire chart paper
            int k = sc.nextInt(); // Side length of the cutout squares

            // Calculate the maximum number of squares Chef can cut
            int maxSquares = (n / k) * (n / k);

            System.out.println(maxSquares);
        }
    }
}