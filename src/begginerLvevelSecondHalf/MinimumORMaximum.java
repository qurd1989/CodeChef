package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MinimumORMaximum {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0 ) {
            int n = sc.nextInt();
            int A[] = new int[n];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <n; i++){
                A[i] = sc.nextInt();
            }
            boolean flag = true;
            for (int i = 0; i < n; i++){
                if (A[i] > max){
                    max = A[i];
                }
                if (A[i] < min){
                    min =A[i];
                }
                if (A[i] != max && A[i] != min){
                    flag = false;
                }
            }
            if (flag){
                System.out.println("Yes");
            }else
                System.out.println("NO");
        }

    }
}

