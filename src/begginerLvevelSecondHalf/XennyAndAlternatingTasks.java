package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class XennyAndAlternatingTasks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int x[] = new int[n];
            int y[] = new int[n];
            int  xEven = 0, xOdd = 0;
            int  yEven = 0, yOdd =0;
            for (int i = 0; i < n; i++){
                  x[i] = sc.nextInt();
                  if (i % 2 == 0) {
                      xEven += x[i];
                  }else
                      xOdd += x[i];

            }
            for (int i = 0; i < n; i++){
                y[i] = sc.nextInt();
                if (i % 2 == 0){
                    yEven += y[i];
                }else
                    yOdd += y[i];

            }
            int result = Math.min(xEven + yOdd, xOdd + yEven);
            System.out.println(result);
        }

    }

}
