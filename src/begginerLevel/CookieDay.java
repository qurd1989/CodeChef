package begginerLevel;

import java.util.Scanner;

public class CookieDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int k =sc.nextInt();
            //Mother has n cookie jars
            // Each jars contains different types of cookies
            //K is number of kids
            int cookies[] = new int[n];
            int cookieLeft = Integer.MAX_VALUE;
            for (int i = 0; i<n;i++){
                cookies[i] = sc.nextInt();
                if (k > cookies[i]){
                    continue;
                }else
                    cookieLeft = Math.min(cookieLeft, cookies[i]%k);
            }
            if (cookieLeft == Integer.MAX_VALUE){
                System.out.println(-1);
            }else
                System.out.println(cookieLeft);
        }
    }
}
