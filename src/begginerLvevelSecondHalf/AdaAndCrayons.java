package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.Scanner;

public class AdaAndCrayons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n =sc.nextInt();
            String s = sc.next();
            HashMap<Integer, Integer> hs = new HashMap<>();
            int count =0;
            for (int i = 0; i < n-1; i++) {

                if (s.charAt(i) != s.charAt(i + 1)) {
                    count++;
                }
            }
            System.out.println((count + 1)/2);
        }
    }
}
