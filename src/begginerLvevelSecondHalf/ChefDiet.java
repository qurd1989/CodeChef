package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefDiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
           int n = sc.nextInt();
           int k = sc.nextInt();
           int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
           int s = 0, index =0;
           boolean flag = true;
           for (int i = 0; i < n; i++) {
               s = s + arr[i];
               if (s >= k) {
                 s = s - k;
               }else {
                   index = i;
                   flag = false;
                   break;
               }
           }
           if (flag) {
               System.out.println("Yes");
           }else
               System.out.println("NO " + (index + 1));
        }
    }
}
