package begginerLvevelSecondHalf;

import java.util.Scanner;

public class GoodJoke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
             int a[] = new int[n];
             int b[] = new int[n];
             for (int i = 0; i < n; i++){
                 a[i] =  sc.nextInt();
                 b[i] = sc.nextInt();
             }
             int res = 0;
             for (int i = 1; i <=n; i++){
                 res ^= i;
             }
            System.out.println(res);
        }

    }
    public static void enterLimit_Price(String limit){

    }


}
