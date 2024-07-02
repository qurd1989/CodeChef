package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            String A = sc.next();
            String B = sc.next();
            Boolean b[] = new Boolean[26];
            Boolean a[] = new Boolean[26];
            boolean flag = false;
            for (int i = 0; i < A.length(); i++){
                a[A.charAt(i) - 'a'] = true;
            }
            for (int i = 0; i < B.length(); i++){
                b[B.charAt(i) - 'a'] = true;
            }

            for (int i = 0; i< 26; i++){
                if (a[i] && b[i]){
                    flag =true;
                    break;
                }
            }
            if (flag){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
