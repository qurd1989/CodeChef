package begginerLvevelSecondHalf;

import java.util.Scanner;

public class AirLineRestrictions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
//            int arr[] = new int[3];
//            for (int i = 0; i < 3; i++){
//                arr[i] = sc.nextInt();
//
//            }
            if ((a + b) <= d && c <= e || (a + c) <= d && b <= e
                    || (b + c) <= d && a <= e) {
                System.out.println("YES");
            } else
                System.out.println("No");
        }
    }
}