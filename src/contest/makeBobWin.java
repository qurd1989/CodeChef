package contest;

import java.util.Scanner;

public class makeBobWin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            String s = sc.next();
            if (n == 1){
                if (s.charAt(0) == '1'){
                    System.out.println(0);
                }else {
                    System.out.println(1);
                }
            }else {
                int count = 0;
                if (s.charAt(0) =='0'){
                    count++;
                }
                if (s.charAt(n - 1) == '0'){
                    count++;
                }
                System.out.println(count);
            }

        }
    }
}
