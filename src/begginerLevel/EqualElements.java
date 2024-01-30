package begginerLevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int maxFreq = 0;
            Map<Integer, Integer> hs = new HashMap<>();
            for (int i = 0; i < n; i++) {
                    hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
                    if (hs.get(arr[i])> maxFreq){
                        maxFreq = hs.get(arr[i]);
                    }
            }
            int result = n - maxFreq;
            System.out.println(result);
        }
    }
}

