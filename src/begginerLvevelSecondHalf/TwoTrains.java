package begginerLvevelSecondHalf;

import java.util.Scanner;

public class TwoTrains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int sp = 0, sm = 0;
            for (int i = 0; i < n-1; i++){
                int c = sc.nextInt();
                sp += c;
                sm = Math.max(sm, c);
            }
            System.out.println(sp + sm);
        }
    }
    public static int[] generateFibonacciNumbers(int n) {
      if (n == 0){
          return new int[0];
      }
      int arr[] = new int[n];
      if (n >= 1){
          arr[0] = 0;
      }
      if (n >= 2){
          arr[1] = 1;
      }
      for (int i = 2; i < n; i++){
          arr[i] = arr[i -1] + arr[i - 2];
      }
      return arr;
    }
}
