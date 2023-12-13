package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MaskPolicy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int min = Math.min(a, (n - a));
            System.out.println(min);
        }
    }
}
