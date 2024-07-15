package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ConvertStringToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            String s = sc.next();
            int num = 0;
            for (int i = 0; i < s.length(); i++){
                int digit = s.charAt(i) - '0';
                num *= 10 + digit;
            }
            System.out.println(num);
        }
    }


}
