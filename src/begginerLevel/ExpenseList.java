package begginerLevel;

import java.util.Scanner;

public class ExpenseList {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0; i<t; i++){
            int n = read.nextInt();
            int x = read.nextInt();
            double y = Math.pow(2, x);
            double z=0;
            for(int j=1; j<=n; j++){
                z = y * 0.5;
                y = y - z;
            }
            System.out.println((int)y);
        }
    }
}
