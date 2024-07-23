package arrays;

import java.util.Map;
import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n * 2];
            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
            }
            if (isSplitable(a, n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    public static boolean isSplitable(int arr[], int n) {
        Map<Integer, Integer> hash = new java.util.HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])) {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            } else {
                hash.put(arr[i], 1);
            }
            if (hash.get(arr[i]) > 2) {
                return false;
            }
        }
        return true;
    }
}