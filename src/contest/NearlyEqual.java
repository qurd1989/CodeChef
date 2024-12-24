package contest;

import java.util.Scanner;

public class NearlyEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            int minDistance = N;
            for (int i = 0; i <= N - M; i++) {
                int distance = calculateHammingDistance(A.substring(i, i + M), B);
                minDistance = Math.min(minDistance, distance);
            }
            System.out.println(minDistance);
        }
        sc.close();
    }
    public static int calculateHammingDistance(String str1, String str2) {
        int distance = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }
}