package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfPileVersion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    count++;
                }
            }
            Arrays.sort(arr);
            if (arr[0] == 1){
                System.out.println("CHEF");
            }else if (count % 2 == 0){
                System.out.println("CHEFINA");
            }else
                System.out.println("CHEF");
        }
    }
}
