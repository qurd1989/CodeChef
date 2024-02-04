package begginerLvevelSecondHalf;

import java.util.Scanner;

public class DevuAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        for (int i = 0; i < q; i++){
            int t =sc.nextInt();
            if (t <= max && t >= min){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
