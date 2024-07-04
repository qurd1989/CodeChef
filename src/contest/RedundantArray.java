package contest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RedundantArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++){
                map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
            }
            int mostFreq = 0;
            int maxCount =0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                int ele = entry.getKey();
                int count = entry.getValue();
                if (count > maxCount){
                    mostFreq = ele;
                    maxCount= count;
                }
            }
            int totalCost = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int element = entry.getKey();
                int cost = element * (maxCount - entry.getValue());
                totalCost += cost;
            }
            System.out.println();
        }
        }
    }
