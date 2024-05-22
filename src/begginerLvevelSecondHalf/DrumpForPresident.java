package begginerLvevelSecondHalf;

import java.util.Scanner;

public class DrumpForPresident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            int count[] = new int[n + 1];
            int goodCounts = 0;
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                count[arr[i]]++;
            }
            for (int i = 0; i < n; i++){
                if (count[i +1]>= k && arr[i] != (i+1)){
                    goodCounts++;
                }

            }
            System.out.println(goodCounts);
        }
    }
}
