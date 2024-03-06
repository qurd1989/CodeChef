package begginerLvevelSecondHalf;

import java.util.Scanner;

public class StrangeOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t--> 0){
          int n = sc.nextInt();
          int k =sc.nextInt();
          int arr[] = new int[n+k];
          int sum = 0;
          for (int i = 0; i < n; i++){
              arr[i] = sc.nextInt();
              sum += arr[i];
          }

          for (int i = n; i < n+k; i++){
              arr[i] = sum +1;
              sum += arr[i];
          }

          if (arr[n+k-1]%2 == 0){
              System.out.println("Even");
          }else
              System.out.println("Odd");
        }
    }
}
