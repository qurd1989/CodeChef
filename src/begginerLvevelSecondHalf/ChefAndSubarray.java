package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int lastZero = n+1;
        for (int i = n; i > 0; i--){
            if (arr[i] != 0){
                lastZero =i;
                count = Math.max(count, lastZero -i);
            }

        }
        System.out.println(count);
    }
}
