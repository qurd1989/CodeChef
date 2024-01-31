package begginerLevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxNutrition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int fruits[] = new int[n];
            int nutirions[] = new int[n];
            int max = 0;
            Map<Integer, Integer> hs = new HashMap<>();

            for (int i = 0; i < n; i++){
                fruits[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++){
                nutirions[i] = sc.nextInt();
            }

        }
    }
}
