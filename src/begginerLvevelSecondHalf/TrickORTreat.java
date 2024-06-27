package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class TrickORTreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int candy : a){
                int reminder = candy % m;
                map.put(reminder, map.getOrDefault(reminder, 0) + 1);
            }
            int validCombination = 0;

            for (int chocolate : b){
                int reminder1 = (m - ( chocolate % m)) % m;
                validCombination += map.getOrDefault(reminder1, 0);
            }

            System.out.println(validCombination);
        }
    }
}
