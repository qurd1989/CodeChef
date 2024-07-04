package DSAPreparetion1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        System.out.println(isPalindrome(s));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(rotateMatrix(matrix));
    }
    private static boolean isPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    private static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - i - 1][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - j];
                matrix[j][n - 1 - j] = temp;
            }
        }
        return matrix;
    }

}
