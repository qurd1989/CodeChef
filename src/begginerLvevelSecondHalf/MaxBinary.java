package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MaxBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if (i == 0 && s.charAt(i) == '0'){
                   sb.append(1);
                   k--;
                }else
                    sb.append(c);
            }
            while (k> 0) {
                sb.append(0);
                k--;
            }
            System.out.println(sb.toString());
            }
        }
    }

