package begginerLevel;

import java.util.Scanner;

public class MinimumNumberOfOnes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = "";
            int res = 0;

            for (int i = 0; i < n; i++) {

                if (i % 2 == 0) {

                    s = "1";
                    res++;
                }else
                    s = "0";

            }
           if (n % 2 == 0) {

               System.out.println(res);
           }else
               System.out.println(res -1);
        }


    }
}
