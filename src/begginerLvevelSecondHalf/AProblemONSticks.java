package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AProblemONSticks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int maxValue = 0;
            int count = 0;
            for (int i = 0; i < n; i++){
                if (arr[i]> maxValue){
                    count++;
                    maxValue = arr[i];
                }
            }
            System.out.println(count);
        }
    }
}
