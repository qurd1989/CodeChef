package begginerLevel;

import java.util.Scanner;

public class BombTheBase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n =sc.nextInt();
            int x = sc.nextInt();
            int max = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if (arr[i] < x) {
                    max = Math.max(i, max);
                }
            }
            System.out.println(max);
        }
    }
}
