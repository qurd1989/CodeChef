package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class ThatIsMyScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                int p = sc.nextInt();
                int s = sc.nextInt();
                if (p < 9){
                    if (arr[p-1] < s){
                        arr[p-1] = s;
                    }
                }
            }
            Arrays.sort(arr);
            int sum = 0;
            for (int i = 0; i < 8; i++){
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
