package begginerLvevelSecondHalf;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Scanner;

public class BinaryStingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            String s = sc.next();
            int zeros = 0;
            int ones = 0;
            char c[] = s.toCharArray();
           for (int i = 0; i < s.length(); i++){
               if (c[i] == '1'){
                   ones++;
               }else
                   zeros++;
           }
           if (zeros == 0 || ones == 0){
               System.out.println(0);
           }else
               System.out.println(x > y ? x :y);
        }

    }
}
