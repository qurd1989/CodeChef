package begginerLvevelSecondHalf;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CardSwipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int max = 0;
            Set<Integer> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int id = sc.nextInt();
                if (hs.contains(id)) {
                    hs.remove(id);
                } else {
                    hs.add(id);
                    max = Math.max(max, hs.size());
                }
            }
            System.out.println(max);
        }
    }
    public static void
    maxAndMin(int arr[]) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x < minValue) {
                minValue = x;
            }
            if (x > maxValue) {
                maxValue = x;
            }
        }
        System.out.println("Max value is :" + maxValue + " Min value is :" + minValue);
    }

    public static void printUnorderPairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }
}
