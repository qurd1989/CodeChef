package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ProcessingAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            String s = sc.next();
            int sum = 0;
            char[] ch = s.toCharArray();
            for (int i =0; i < ch.length; i++){
                if (Character.isDigit(ch[i])){
                    sum += Character.getNumericValue(ch[i]);
                }
            }
            System.out.println(sum);
        }
    }
}
