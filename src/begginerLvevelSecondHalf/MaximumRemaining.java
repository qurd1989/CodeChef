package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumRemaining {;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          int n = sc.nextInt();
          int arr[] = new int[n];
          for (int i = 0; i < n; i++){
              arr[i]= sc.nextInt();
          }
            Arrays.sort(arr);

//          int max = Integer.MIN_VALUE;
//          int mod = arr[n-1];
//          for (int i = 1; i < n; i++){
//              int j = arr[i] % mod;
//                  max = Math.max(max, j);
//              }

            System.out.println(secondLargestElement(arr));

    }
    public static int secondLargestElement(int arr[]){
        int n = arr.length;

        int  max = 0;
        int secondLargest = 0;
        for (int i = 0 ; i < n-1; i++){
            if (arr[i] > arr[i+1]){
                max = arr[i];
                secondLargest = max;
            }
        }
        return secondLargest;
    }
}
