package begginerLvevelSecondHalf;

import java.util.Scanner;

public class FoodChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int e = sc.nextInt();
            int k = sc.nextInt();
            int temp = 0;
            int count = 1;
            while (e>=k) {
                e = e / k;
                count++;
            }
            System.out.println(count);
        }
    }
}
