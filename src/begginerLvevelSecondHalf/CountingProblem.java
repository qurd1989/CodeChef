package begginerLvevelSecondHalf;

import java.util.Scanner;

public class CountingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new  int[n];
            int count =0;
            for (int i =  0; i < n; i++){
                arr[i] = sc.nextInt();

            }
            for (int i =  0; i < n; i++) {

                if ((arr[i] & 1) != 0) {
                    count++;
                }
            }

                if ((count & 1) != 0 || count == 0) {
                    System.out.println("NO");
                } else
                    System.out.println("Yes");

            }
    }
}