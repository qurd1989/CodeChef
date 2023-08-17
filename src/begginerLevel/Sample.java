package begginerLevel;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            String n = sc.next();

            boolean ans = solve6(n);
            System.out.println(ans);
          /*  int ans[] = solve4(n);
            for (int nums : ans) {
                System.out.print(nums + " ");
            }*/

           /* String ans = solve1(sc);
            System.out.println(ans);*/

            /*int aliceScore = solve(sc);
            int bobScore = solve(sc);

            if (aliceScore > bobScore) {
                System.out.println("Alice");
            } else if (aliceScore < bobScore) {
                System.out.println("Bob");
            } else {
                System.out.println("Tie");
            }*/
        }
    }

    public static int solve(Scanner sc) {

        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + arr[1]);
        return arr[1] + arr[2];
    }


    // Find common elements in two given Arrays

    public static int[] solve(int a[]) {

        return new int[0];
    }

    public static String solve1(Scanner sc) {
        String first = sc.next();
        String second = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < first.length(); k++) {

            if (first.charAt(k) == second.charAt(k)) {
                sb.append("G");
            } else
                sb.append("B");
        }
        return sb.toString();
    }

    // Converting String to Integer
    public static int[] solve4(String str) {

        int n = str.length();
        int digitsum[] = new int[n];

        for (int i = 0; i < str.length(); i++) {

            digitsum[i] = (str.charAt(i) - '0');


        }
        return digitsum;
    }

  // Finding given number as String is divisible by 4 or not
    public static boolean solve5(String str) {

        int n = str.length();

        if (n == 0) {
            return false;
        }

        if (n == 1) {

            int k = Integer.parseInt(str);

            return k % 4 == 0;
        }

        String lastTwoDigits = str.substring(n - 2);
        if (Integer.parseInt(lastTwoDigits) % 4 == 0){
            return true;
    }else
            return false;
     }

     // Find if String(Number) divisible by 6 or not.
     public static  boolean solve6(String str) {
        int n = str.length();

        if (n == 0) {
            return false;
        }
        if (n == 1) {

            return Integer.parseInt(str) % 6 == 0;
        }

        if ((str.charAt(n-1) - '0') % 2 != 0) {

          return false;
         }

        int sumDigits = 0;

        for (int i = 0; i < n; i++){

            sumDigits += str.charAt(i) - '0';


        }

        if (sumDigits % 3 == 0) {
            return true;
        }else
            return false;

     }
    }



