package begginerLevel;

import java.util.Scanner;

public class ProcessingAString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            String s = sc.next();
            int digitSum = 0;
            for (int i = 0; i < s.length(); i++){
                if (Character.isDigit(s.charAt(i))){

                    digitSum += Character.getNumericValue(s.charAt(i));
                }
            }
            System.out.println(digitSum);
        }
    }
}
