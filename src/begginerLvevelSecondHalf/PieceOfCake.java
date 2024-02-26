package begginerLvevelSecondHalf;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            String s = sc.next();

            Map<Character, Integer> hs = new HashMap<>();
            for (int i = 0; i < s.length(); i++){
                char currentChar = s.charAt(i);
                if (hs.containsKey(currentChar)){
                    hs.put(currentChar, hs.get(currentChar)+1);
                }else
                    hs.put(currentChar, 1);

                }

              int maxFreq = Integer.MIN_VALUE;
            for (char key : hs.keySet()){
                if (hs.get(key) > maxFreq){
                    maxFreq = hs.get(key);
                }
            }
            if (s.length() - maxFreq == maxFreq){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}
