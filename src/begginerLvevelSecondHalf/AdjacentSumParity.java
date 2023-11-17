package begginerLvevelSecondHalf;

import java.util.Scanner;

public class AdjacentSumParity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int  oneCount =0, zeroCount = 0;
            for (int i =0; i < a.length; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    oneCount++;
                }

            }
            if (oneCount % 2 ==0){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
