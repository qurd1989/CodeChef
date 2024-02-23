package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndEmploymentTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n =sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int median = (n + k)/2;
            System.out.println(arr[median]);
        }
    }
}
