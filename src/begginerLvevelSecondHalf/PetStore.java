package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetStore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i =0; i<n; i++){
                arr[i] =sc.nextInt();
            }
            int count[] = new int[101];
            for (int i =0; i < n; i++){
                count[arr[i]]++;
            }
            boolean flag = true;
            for (int type = 0; type <= 100; type++){
                if (count[type] % 2 != 0) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}