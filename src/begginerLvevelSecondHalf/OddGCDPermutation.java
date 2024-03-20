package begginerLvevelSecondHalf;

import java.util.Scanner;

public class OddGCDPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            if (n % 2 != 0) {
                System.out.println(-1);
            }else
                while (n != 0){
                    System.out.print(n+ " ");
                    n--;
                }
            System.out.println();
        }
    }
}
