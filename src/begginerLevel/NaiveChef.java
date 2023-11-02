package begginerLevel;

import java.util.Scanner;

public class NaiveChef {

    public static void main(String[] args) {

        Scanner sc  =new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n =sc.nextInt();
            int a =sc.nextInt();
            int b =sc.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            double probA = calPorbalities(arr, a);
            double probB = calPorbalities(arr, b);

            double ans = probA * probB;

            System.out.printf("%.6f\n", ans);

        }

    }
    public  static double calPorbalities(int dieNumbers[], int target){

        int count = 0;
        for(int num : dieNumbers){
            if (num == target) {
                count++;
            }

        }
        return (double) count/dieNumbers.length;
    }
}
