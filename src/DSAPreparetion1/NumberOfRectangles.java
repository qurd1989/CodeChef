package DSAPreparetion1;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class NumberOfRectangles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int arr[] = solve(n);

           for (int i =arr.length-1; i >0; i--) {

               System.out.print(arr[i]);
           }
        }
    }

    public static int[] solve(int n)
    {
        int res_num = 0;
        int binaryArray[] = new int[32];
         int i = 0;
        while (n != 0){

            res_num = n % 2;
            binaryArray[i] = res_num;
            n/=2;
            i++;
        }    int[] reversedBinaryArray = new int[i];
        for (int j = i - 1; j >= 0; j--) {
            reversedBinaryArray[i - j - 1] = binaryArray[j];
        }
        return  binaryArray;

    }
}
