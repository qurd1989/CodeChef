package begginerLvevelSecondHalf;

import java.util.Scanner;

public class FromHeavenToEarth {

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n -1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

            for (int i = 0; i < n-1; i++){
                if (arr[i] > arr[i + 1]){
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("NO");
            }else
                System.out.println("Yes");
        }
    }
}
