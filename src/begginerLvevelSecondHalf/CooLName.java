package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class CooLName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int sum = 0;
            char c[] = s.toCharArray();
            Arrays.sort(c);
            for (int i = 0; i < s.length(); i++){
                sum = (i + 1) * (c[i] - 96);
            }
            System.out.println(sum);
        }
    }

    public static int solve(int arr[]) {
        int n = arr.length;
        int leftSum, rightSum;
        for (int i = 0; i < n; i++) {
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            rightSum = 0;
            for (int j = i + 1; j < n - 1; j++) {
                rightSum += arr[j];
            }
            if (rightSum == leftSum) {
                return arr[i];

            }
        }
        return -1;
    }

    public static int prefixSolve(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = 0;
        int totalSum = 0;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            int leftSum = prefix[i] - arr[i];
            int rightSum = totalSum - prefix[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static int prefixWithOptimizedCode(int arr[]) {
        int n = arr.length;
        int leftSum = 0;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;
            }
            leftSum = leftSum + arr[i];
        }
        return -1;
    }
    public int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum += A[i];
                int length = j - i+1;
                if ((length % 2 == 0 && B > length) ||(length % 2 != 0 && B < length)){
                    count++;
                }
            }
        }
        return count;
    }
}
