package begginerLevel;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


            int n = sc.nextInt();

           /* BigInteger fact = new BigInteger("1");
            for(int i = 2; i <= n; i++)
                fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println(fact);*/

        if(n == 0)
            System.out.println(1);
        int i = n, fact = 1;
        while (n / i != n) {
            fact = fact * i;
            i--;
        }
        System.out.println(fact);
    }
    }

