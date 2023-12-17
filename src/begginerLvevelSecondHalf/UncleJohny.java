package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class UncleJohny {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i< n; i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int UncleJohnsLength = arr[k-1];
            Arrays.sort(arr);
            int index = 0;
            int start= 0;
            int end  = arr.length-1;
            while (start<= end) {

                int mid = start + (end -start) /2;

                if (arr[mid] == UncleJohnsLength) {
                    index = mid;
                    break;
                }else if (arr[mid] > UncleJohnsLength) {
                    end = mid -1;
                }else if (arr[mid] < UncleJohnsLength) {
                    start = mid+1;
                }
                }
            System.out.println(index + 1);
        }

    }
}
