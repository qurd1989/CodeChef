package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DominantElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t --> 0){
            int n =sc .nextInt();
            int elements[] = new int[n];
            for (int i = 0; i < n; i++){
                elements[i] =sc.nextInt();
            }
            Map<Integer,Integer> hs = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (hs.containsKey(elements[i])) {
                    hs.put(elements[i], hs.getOrDefault(elements[i], 0) + 1);
                }else
                    hs.put(elements[i], 1);
            }
            int count = 0;
            int maxFreq = 0;
          for (int value : hs.values()){
              if (value > maxFreq){
                  maxFreq = value;
              }
          }
          for (int max : hs.values()){
              if (max == maxFreq){
                  count++;
              }
          }
            if (count > 1){
                System.out.println("No");
            }else
                System.out.println("Yes");
        }
    }

}
