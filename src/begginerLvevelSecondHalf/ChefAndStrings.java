package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int str[] = new int[n];
            for (int i = 0; i < n; i++){
                str[i] = sc.nextInt();
            }

            long count = 0;
            for (int i = 0; i<n-1; i++){

                if(str[i] != 0){
                    count  += Math.abs(str[i]-str[i+1]);

                }
            }
            System.out.println(count- n+1);
        }
    }
}
