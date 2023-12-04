package begginerLvevelSecondHalf;

import java.time.Year;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CardRemoval {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean flag = false;

            if (n % 2 == 0) {
                HashMap<Character, Integer> hm = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    Character ch = s.charAt(i);
                    if (hm.get(ch) == null) {
                        hm.put(ch, 1);
                    } else
                        hm.put(ch, hm.get(ch) + 1);
                }
                for (Map.Entry<Character, Integer> mp : hm.entrySet()) {
                    if (mp.getValue() % 2 != 0) {
                        flag = true;
                    }
                }
                if (flag) {
                    System.out.println("NO");
                } else
                    System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
