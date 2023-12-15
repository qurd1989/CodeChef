package begginerLvevelSecondHalf;

import java.util.Scanner;

public class CountingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->t){
            int n = sc.nextInt();
           // int arr[] = new int[n];

            StringBuilder sb = new StringBuilder();

            int i =0;
            while (n > 0){
               int rem = n % 2;
                sb.insert(0,rem);
                n/=2;

            }
            System.out.println(sb);
        }
    }
}