package arrays;

import java.util.*;
import java.util.Scanner;

public class CountOfMaxium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            int freq = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (!map.containsKey(arr[i])) {
                    map.put(arr[i], 1);
                } else {
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
            }
            for (int value : map.keySet()) {
                if (map.get(value) > freq) {
                    freq = map.get(value);
                }
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int key : map.keySet()) {
                if (map.get(key) == freq) {
                    list.add(key);
                }
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < min) {
                    min = list.get(i);
                }
            }
                System.out.println(min + " " + freq);

        }
    }
}

