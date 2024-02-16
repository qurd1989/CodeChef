package begginerLevel;

import java.util.Scanner;

public class EasyMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n =sc.nextInt();

        }
    }


    public static int solve(int A[], int B) {

        int n = A.length;

        int result = 0;

        for (int i = 0; i < B; i++) {
            result += A[i];
        }

        int sum = result;

        for (int i = 0; i < B; i++) {
            sum -= A[B - 1 - i];
            sum += A[n - 1 - i];

            result = Math.max(result, sum);
        }

        return result;

    }
}
