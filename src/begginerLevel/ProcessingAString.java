package begginerLevel;

import java.util.Scanner;

public class ProcessingAString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(isDigit2(s));
        }
    }
//    public static int isDigit(String s) {
//        int digitSum = 0;
//        for (int i = 0; i < s.length(); i++){
//            if (Character.isDigit(s.charAt(i))){
//
//                digitSum += Character.getNumericValue(s.charAt(i));
//            }
//        }
//        return digitSum;
//
//    }

    public static int isDigit2(String s) {
        int digitSum = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9');{
                int digit = ch - '0';
                digitSum += digit;
            }
        }
        return digitSum;

    }
}
