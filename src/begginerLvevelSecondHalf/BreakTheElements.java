package begginerLvevelSecondHalf;

import java.util.Scanner;

public class BreakTheElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int countEven = 0;
            for (int i = 0; i < n; i++){
                if (arr[i] % 2 == 0){
                    countEven++;
                }
            }
            if (countEven == n || countEven == 0){
                System.out.println(0);
            }else {
                System.out.println(countEven);
            }
        }
    }
}
