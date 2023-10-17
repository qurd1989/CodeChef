package begginerLevel;

import java.util.Scanner;

public class REarrangeingDigitsToGetAMultipleOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
             boolean flag = false;
            for (int i = 0; i < n; i++) {
               if (s.charAt(i) == '5' || s.charAt(i) == '0') {
                   flag = true;
               }
            }
            if (flag){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
