package begginerLvevelSecondHalf;

import java.util.Scanner;

public class OddEvenBinaryString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int  result = 0;
            for (int i = 0; i< n; i++){
                arr[i] =sc.nextInt();
                result += arr[i];
            }
           if ((n - result) % 2 ==0){
               System.out.println("YES");
           }else
               System.out.println("NO");
        }
    }
}
