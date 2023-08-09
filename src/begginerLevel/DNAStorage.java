package begginerLevel;

import java.util.Scanner;

public class DNAStorage {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder sb = new StringBuilder();

            for (int i =0; i < n; i += 2) {

                String pair = s.substring(i, i +2);

                String encodedChar = solve(pair);

                sb.append(encodedChar);

            }

            System.out.println(sb);

        }
    }
    public  static String solve(String pair) {

        if (pair.equals("00")){
            return "A";
        }else if (pair.equals("01")){
            return "T";
        }else if (pair.equals("10")){
            return "C";
        }else if (pair.equals("11")) {
            return "G";
        }else
            return "";
    }

}
