package begginerLevel;

import java.util.Scanner;

public class PuppyANdSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int d = sc.nextInt();
            int n = sc.nextInt();

            int nas = sumOfSum(d,n);
            System.out.println(nas);
        }
    }
    public static int sumOfSum(int d, int n){
        int sum = n;
        for (int i =0; i < d; i++){
           n =  n *(n +1)/2;
        }
        return n;
    }

}
