package begginerLevel;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BytelandianGoldCoins {

    static Map<Long, Long> dp;

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()) {
            dp = new HashMap<>();
            Long n = sc.nextLong();

            System.out.println(getMaxDollars(n));
        }
    }

    static long getMaxDollars(long n) {
        if (n == 0) {
            return 0;
        }

        if (dp.containsKey(n)) {
            return dp.get(n);
        }

        long maxDollars = Math.max(n, getMaxDollars(n/2) + getMaxDollars(n/3) + getMaxDollars(n/4));
        dp.put(n, maxDollars);

        return maxDollars;
    }
}
