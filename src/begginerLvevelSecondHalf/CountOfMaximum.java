package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (!hm.containsKey(arr[j])) {
                    hm.put(arr[j], 1);
                } else {
                    hm.put(arr[j], hm.get(arr[j]) + 1);
                }
            }
            int max = Integer.MIN_VALUE;
            for (int key : hm.keySet()) {
                if (hm.get(key) > max) {
                    max = hm.get(key);
                }
            }
            ArrayList<Integer> al = new ArrayList<>();
            for (int key : hm.keySet()) {
                if (hm.get(key) == max) {
                    al.add(key);
                }
            }
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < al.size(); j++) {
                if (al.get(j) < min) {
                    min = al.get(j);
                }
            }
            System.out.println(min + " " + max);
        }
    }
}

