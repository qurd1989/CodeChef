package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BuyOneGetOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0 ){
             String s = sc.next();
             int n = s.length();
             Map<Character, Integer> hs = new HashMap<>();
             for (int i = 0; i < n; i++) {
                 char c = s.charAt(i);
                 if (!hs.containsKey(c)) {
                     hs.put(c, 1);
                 } else {
                     hs.put(c, hs.get(c) + 1);
                 }
             }
             int getSecondFree = 0;
             for (char jewel : hs.keySet()){
                 if (hs.get(jewel) % 2 == 0){
                     getSecondFree = getSecondFree + (hs.get(jewel) /2);
                 }else
                     getSecondFree = getSecondFree + ((hs.get(jewel) /2) +1);

             }
            System.out.println(getSecondFree);
        }
    }
}
