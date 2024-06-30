package begginerLvevelSecondHalf;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            Set<String> set = new HashSet<>();
            for (int i = 0; i < s.length()-1; i++){
                String subString = s.substring(i, i+2);
                set.add(subString);
            }
            System.out.println(set.size());
        }
    }
    public static String stringConcatenation(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger s = a.add(b);
        return s.toString();
}
    public static String stringConcatenation1(String num1, String num2) {
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder sb = new StringBuilder();
        while ((i >= 0) || (j >= 0) || carry != 0){
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 +carry;
            carry = sum/10;
            sb.append(sum % 10);
            i--;
            j--;

        }
        return sb.reverse().toString();
    }
}
