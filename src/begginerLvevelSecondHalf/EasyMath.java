package begginerLvevelSecondHalf;

import java.util.Scanner;

public class EasyMath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i =0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int max = -1;
            for (int i = 0; i <n;i++){
                for(int j =i+1; j < n; j++){
                    int result = arr[i] * arr[j];
                    int ans = solve(result);
                    max = Math.max(ans, max);
                }
            }
            System.out.println(max);
        }
    }
    public static int solve(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
