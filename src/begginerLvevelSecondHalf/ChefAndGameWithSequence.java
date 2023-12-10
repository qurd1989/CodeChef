package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndGameWithSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int count =0;
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if (a[i] % 2 != 0){
                    count++;
                }
            }
            if (count % 2 != 0 && n > 1){
                System.out.println(2);
            }else
                System.out.println(1);
        }
    }
}
