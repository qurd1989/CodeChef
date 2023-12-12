package begginerLvevelSecondHalf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ChnageIt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i =0; i<n; i++){
                arr[i]  = sc.nextInt();
            }
            HashMap<Integer, Integer> hs = new HashMap<>();
            for (int e: arr){
                hs.put(e,hs.getOrDefault(e,0)+1);
            }
            int  max = Collections.max(hs.values());
            System.out.println(n -max);
        }
    }
}
