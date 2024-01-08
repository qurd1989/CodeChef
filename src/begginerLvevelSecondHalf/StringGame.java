package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            //We need to find each character of the String is even or odd
            // N is Integer and length of String
            // A is Alice and B is Bob
            Map<Character, Integer> hs = new HashMap<>();
            char c[] = s.toCharArray();
            for (int i = 0; i < n; i++) {
                char ch = c[i];
                hs.put(ch, hs.getOrDefault(ch, 0) + 1);
            }
                boolean flag = true;
                for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
                    if (entry.getValue() % 2 != 0) {
                        flag = false;
                        break;
                    }
                }
                System.out.println(flag ? "YES" : "NO");

        }

    }
}