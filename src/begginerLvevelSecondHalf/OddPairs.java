package begginerLvevelSecondHalf;

import java.util.Scanner;

public class OddPairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            long n = sc.nextInt();
            System.out.println((n*n)/2);
        }
    }
}
