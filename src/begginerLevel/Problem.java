package begginerLevel;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        for(int i=0;i<t;i++) {
            int n = read.nextInt();
            int m = read.nextInt();
            int d = Math.abs((n -m));

            if (d % 2== 0) {
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
