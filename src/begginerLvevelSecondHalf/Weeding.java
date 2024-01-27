package begginerLvevelSecondHalf;

import java.util.Scanner;

public class Weeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int newWeeds[] = new int[n];

            for (int i = 0; i < n; i++){
                newWeeds[i] = sc.nextInt();

            }
            int temp = newWeeds[n-1];
            if ((temp + k <= m+1)){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
