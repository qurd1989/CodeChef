package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChefAndColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            String s  =sc.next();
            HashMap<Character, Integer> hs = new HashMap<>();
            for (int i = 0; i < n; i++){
                char c = s.charAt(i);
                if (hs.get(c) != null) {
                    hs.put(c, hs.get(c) + 1);
                }else
                    hs.put(c,1);
            }

            int maxFreq = Integer.MIN_VALUE;
            for (Map.Entry<Character, Integer> mp : hs.entrySet()){
                if (mp.getValue() > maxFreq){
                    maxFreq = mp.getValue();
                }
            }
            System.out.println(n - maxFreq);
        }
    }
}
