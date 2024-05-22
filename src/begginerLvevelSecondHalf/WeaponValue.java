package begginerLvevelSecondHalf;

import java.util.Scanner;

public class WeaponValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            String firstString= sc.next();
            String rest;
            int count = 0;
            for (int i = 1; i < n; i++){
                rest = sc.next();
                char result[] = new char[10];
                for (int j = 0; j < 10; j++){
                    if (firstString.charAt(j) != rest.charAt(j)){
                        result[j] = '1';
                    }else {
                        result[j] = '0';
                    }
                }
                firstString = new String(result);
            }
            for (int i = 0; i < 10; i++){
                if (firstString.charAt(i) == '1'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}