package begginerLvevelSecondHalf;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int A[] = new int[n];
            int B[] = new int[n];
            int size = A.length;

            int max = 0;
            for (int i = 0; i < size; i++){
                A[i] =sc.nextInt();
            }for (int i = 0; i < size; i++){
                B[i] =sc.nextInt();
            }
            for (int i = 0; i< size; i++){
                int result = ((A[i] * 20) - ((B[i])*10));
                if (result > max){
                    max =result;
                }
            }
            System.out.println(max);

        }
    }
}
