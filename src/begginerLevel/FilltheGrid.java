package begginerLevel;

import java.util.Arrays;
import java.util.Scanner;

public class FilltheGrid {
    int largestNumber;
    int index;
    public FilltheGrid(int largestN, int indexN){
        this.largestNumber= largestN;
        this.index = indexN;

    }
    public static void main(String[] args) {


         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();

         while (t--> 0) {
             int  n = sc.nextInt();
             int arr[] = new int[n];
             for (int i= 0; i<n; i++){
                 arr[i] = sc.nextInt();
             }
             FilltheGrid re = solve(arr);
             System.out.println(re.largestNumber);
             System.out.println(re.index);

         }
    }

    public static FilltheGrid solve(int arr[]){

        int n = arr.length;
        int large = -100;
        int index = 0;
        for (int i = 0; i< n; i++) {
            if (arr[i] > large){
                large = arr[i];
                index = i;
            }
        }

        return new FilltheGrid(large, index);
    }
}
