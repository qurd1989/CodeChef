package begginerLvevelSecondHalf;

import java.util.*;

public class RemoveBadElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n =sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            Map<Integer, Integer> hs = new HashMap<>();
            for (int i = 0; i < n; i++){
                if (hs.containsKey(arr[i])) {
                    hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
                }else
                    hs.put(arr[i], 1);
            }
            int maxFrequency = 0;

            for (Map.Entry<Integer,Integer> entry : hs.entrySet()) {
                if (entry.getValue() > maxFrequency){
                    maxFrequency = entry.getValue();
                }
            }
            System.out.println(n-maxFrequency);
        }
    }
}
