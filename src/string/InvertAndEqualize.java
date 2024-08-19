package string;

import java.util.Scanner;

public class InvertAndEqualize {
    public static int countOperations(String S) {
        int count0Blocks = 0;
        int count1Blocks = 0;
        int n = S.length();
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == '0') {
                if (i == 0 || S.charAt(i - 1) == '1') {
                    count0Blocks++;
                }
            } else { // S.charAt(i) == '1'
                if (i == 0 || S.charAt(i - 1) == '0') {
                    count1Blocks++;
                }
            }
        }
        // Return the minimum of the two counts
        return Math.min(count0Blocks, count1Blocks);
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int T = scanner.nextInt(); // Read the number of test cases
        scanner.nextLine(); // Consume the newline character

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Read the length of the string
            scanner.nextLine(); // Consume the newline character
            String S = scanner.nextLine(); // Read the binary string

            // Calculate and print the result for the current test case
            System.out.println(countOperations(S));
        }

        scanner.close();
    }
}