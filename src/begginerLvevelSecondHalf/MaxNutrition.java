package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MaxNutrition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int typeFruits[] = new int[n];
            int nutritionValues[] = new int[n];
            for(int i = 0; i < n; i++){
                typeFruits[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                nutritionValues[i] = sc.nextInt();
            }
            System.out.println(maxNutrition(typeFruits, nutritionValues));

        }
    }
    public static int maxNutrition(int typeFruits[], int nutritionValues[]){
        int n = typeFruits.length;
        int maxNutrition = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int type  = typeFruits[i];
            int nutrition = nutritionValues[i];
            if(!map.containsKey(type) || map.get(type) < nutrition){
                map.put(type, nutrition);
            }
        }
        for(int value : map.values()) {
            if (value > 0) {
                maxNutrition += value;
            }
        }
        return maxNutrition;
    }

}
