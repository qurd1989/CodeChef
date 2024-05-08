package begginerLvevelSecondHalf;

import java.util.Scanner;

public class RetrieveTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            long[] bArr = new long[N];

            long sumB = 0, sumA = 0;

            for(int i=0; i<N; i++){
                bArr[i] = sc.nextLong();
                sumB += bArr[i];
            }
            sumA = sumB / (N+1);
            for(int i=0; i<N; i++){
                System.out.print((bArr[i] - sumA)+" ");
            }
            System.out.println();
            T--;
        }
    }
}