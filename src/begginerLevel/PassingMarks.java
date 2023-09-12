package begginerLevel;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PassingMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 1; i<=T; i++){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int A[] = new int[N];
            for(int j = 0; j<N; j++){
                A[j] = sc.nextInt();
            }
            Arrays.sort(A);
            System.out.println(A[N - X] -1);
        }
    }
}