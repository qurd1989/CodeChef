package begginerLevel;

import java.util.Scanner;

public class SmallestNumberOfNotes {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        int x = solve(sc);
        System.out.println(x);
       /* while(t-->0){
            int n=sc.nextInt();
            int a =n%100;
            int b= a%50;
            int c= b%10;
            int d= c%5;
            int e= d%2;

            System.out.println((n/100)+(a/50)+(b/10)+(c/5)+(d/2)+e);*/

        }
        public static  int solve(Scanner sc) {

        int denominations[] = {100, 50, 20, 5, 2,1};

        int n = sc.nextInt();
        int output = 0;

        for (int i = 0; i < denominations.length; i++) {
            if ( n >= denominations[i]) {

                output += n / denominations[i];
                n %= denominations[i];

            }
        }
            return output;
    }
}