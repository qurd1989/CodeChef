package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int positiveNum = 0;
            int negativeNum = 0;
            for (int i = 0; i < n; i++){
                if (arr[i] == 0){
                    continue;
                }
                if (arr[i] > 0){
                    negativeNum++;
                }else {
                    positiveNum++;
                }

            }
            System.out.println(((negativeNum*(negativeNum -1))/2) + (positiveNum*(positiveNum -1)/2));

//            int result[] = reversed(arr);
//            for (int value : result){
//                System.out.print(value + " ");
//            }
        }
    }
    public  static int[] reversed(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

}
