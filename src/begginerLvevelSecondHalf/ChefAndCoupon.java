package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndCoupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int d =sc.nextInt();
            int c = sc.nextInt();
            int a[] = new int[3];
            int b[] = new int[3];
            int aSUm = 0;
            int bSum = 0;
            for (int i = 0; i < 3; i++){
                a[i] = sc.nextInt();
                aSUm += a[i];
            }
            for (int i = 0; i <3; i++){
                b[i] = sc.nextInt();
                bSum += b[i];
            }
            int day1BillWithDelivery = aSUm + d;
            int day2BillWithDelivery = bSum + d;
            int totalBillWithoutCoupon = day1BillWithDelivery + day2BillWithDelivery;
            int x = (aSUm < 150) ? day1BillWithDelivery : aSUm;
            int y = (bSum < 150) ? day2BillWithDelivery : bSum;

            int totalBillWithCoupon = x + y + c;

            if(totalBillWithCoupon >= totalBillWithoutCoupon)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
