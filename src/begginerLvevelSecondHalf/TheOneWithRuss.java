package begginerLvevelSecondHalf;

import java.util.Scanner;

public class TheOneWithRuss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
                for (int i = 0; i < n; i++){
                    b[i] = sc.nextInt();
                }
                int count = 0;
                for (int i = 0; i < n; i++){
                    int min = Math.abs(a[i]-b[i]);
                    if (min <= k){
                        count++;
                    }
                }

                if (count >= x){
                    System.out.println("Yes");
                }else
                    System.out.println("NO");
        }
    }
}
