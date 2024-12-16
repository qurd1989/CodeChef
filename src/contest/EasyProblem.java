package contest;

import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int count = 0;
            for(int i =1; i* i <= n; i++) {
                if (n % i ==0) {
                    if (i * i == n) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
