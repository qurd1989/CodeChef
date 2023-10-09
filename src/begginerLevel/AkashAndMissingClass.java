package begginerLevel;

import java.util.Scanner;

public class AkashAndMissingClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while( t-- > 0 ){
            int n = sc.nextInt();

            if( n < 6 ){
                System.out.println(0);
            }
            else{
                System.out.println( n / 7 + ( n % 7 >= 6 ? 1 : 0 ) );
            }
        }
    }
}
