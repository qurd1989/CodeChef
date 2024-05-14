package begginerLvevelSecondHalf;

import java.util.Scanner;

public class TraceOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) { // Ensure the matrix processing happens for each test case
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int l = i, m = j, sum = 0;
                    while (l < n && m < n) {
                        sum += matrix[l][m];
                        l++;
                        m++;
                        ans = Math.max(sum, ans); // Update maximum trace found after adding each element
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
