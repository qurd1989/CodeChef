package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MaximiseXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
            int zeroes = 0,ones = 0;
            for (int i = 0; i < a.length(); i++){
                if (a.charAt(i) == '1'){
                    ones++;
                }else {
                    zeroes++;
                }
            }
            for (int i = 0; i < a.length(); i++){
                if (b.charAt(i) == '1'){
                    ones++;
                }else {
                    zeroes++;
                }
            }
            StringBuilder sb = new StringBuilder();
            int temp = Math.min(zeroes, ones);
            for (int i = 0; i < temp; i++){
                sb.append("1");
            }
            for (int i = temp; temp < a.length(); temp++){
                sb.append("0");
            }

            System.out.println(sb.toString());
        }
    }
}
