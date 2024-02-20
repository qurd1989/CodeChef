package begginerLvevelSecondHalf;

import java.util.Scanner;

public class DistinctOppositeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s =sc.next();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '@'){
                    count++;
                }
                if (i < s.length()-1&& s.charAt(i) == '*' && s.charAt(i+1) == '*'){
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
