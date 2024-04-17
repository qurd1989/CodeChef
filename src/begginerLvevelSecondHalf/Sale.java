package begginerLvevelSecondHalf;

import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int salesDays[] = new int[n];

            for (int i =0; i< n; i++){
                salesDays[i] = sc.nextInt();
            }
            long maxSales = 0;
            long  sumSales = 0;
            for (int i = 0 ; i < n; i++){
                sumSales = sumSales + (2*salesDays[i]);
                if (maxSales < sumSales){
                    maxSales = sumSales;
                    sumSales = sumSales - salesDays[i];
                }else {
                    sumSales = sumSales - salesDays[i];
                }
            }

            System.out.println(sumSales);
        }
    }
}
