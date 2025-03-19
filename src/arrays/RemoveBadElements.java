package arrays;

import java.util.Scanner;

public class RemoveBadElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(removeBadElements(arr, n));

    }
    public static int removeBadElements(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] >= 0){
                arr[count++] = arr[i];
            }
        }
        return count;
    }
}
