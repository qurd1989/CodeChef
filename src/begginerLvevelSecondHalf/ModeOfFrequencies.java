package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModeOfFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }
            Map<Integer, Integer> map1 = new HashMap<>();

        }
    }
    public static int longestSubarrayWithSumK(int []a, long k) {
        long sum = 0;
        int len = 0;
        int n = a.length;
        for(int i = 0; i < n; i++ ){
            for(int j = i; j < n; j++){


                for(int m = i; m < j; m++){
                    sum += a[m];
                }
                if(sum == k){
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
}

