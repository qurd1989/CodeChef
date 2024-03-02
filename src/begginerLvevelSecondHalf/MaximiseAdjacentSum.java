package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class MaximiseAdjacentSum {

    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int size = sc.nextInt();
            int sum = 0;

            int[] A = new int[size];
            for(int i=0; i<size; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
            }

            sum *= 2;
            Arrays.sort(A);
            int maxSum = sum - (A[0] + A[1]);
            System.out.println(maxSum);
        }
    }
}
