package begginerLvevelSecondHalf;

import java.util.Scanner;

public class RandomPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = sc.nextInt();
        for (int i= 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(targetElement(arr, k));

    }

    public static boolean targetElement(int arr[], int k) {
        int str = 0;
        int end = arr.length-1;
        while (str < end){
            if (arr[str] + arr[end] == k) {
                return true;
            }
            str++;
            end--;
        }
        return false;
    }
}
