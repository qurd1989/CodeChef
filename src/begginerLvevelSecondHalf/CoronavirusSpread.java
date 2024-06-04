package begginerLvevelSecondHalf;

import java.util.Scanner;

public class CoronavirusSpread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int min = Integer.MAX_VALUE;
            int max = 1;
            int count = 1;
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++){
                if (arr[i+1] - arr[i] <= 2) {
                    count++;
                }else{
                    max = Math.max(max, count);
                    min = Math.min(min, count);
                    count =1;
                }
            }
            max = Math.max(max, count);
            min = Math.min(min, count);
            System.out.println(min + " " + max);
            System.out.println("Sen");
        }
    }
}
