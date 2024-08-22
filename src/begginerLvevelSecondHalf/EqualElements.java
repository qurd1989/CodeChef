package begginerLvevelSecondHalf;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int maxValue = Arrays.stream(arr).max().orElse(0);
            int count[] = new int[maxValue + 1];
            for (int i = 0; i < n; i++){
                count[arr[i]]++;
            }
            int max = 0;
            for (int i = 0; i <= maxValue; i++){
                max = Math.max(max, count[i]);
            }
            System.out.println(n - max);
        }
    }
}
