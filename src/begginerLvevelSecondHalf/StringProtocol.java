package begginerLvevelSecondHalf;

import java.util.Scanner;

public class StringProtocol {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            String str = sc.next();
            char c[]  = str.toCharArray();
            int count = 0;
            int doubleCount = 0;
            for (int i =0; i<n; i++){
                if (c[i] == c[i + 1]){

                    doubleCount = 2;

                } else if (c[i] != c[i + 1]) {
                    count++;
                }else
                    continue;

            }

            System.out.println(count +doubleCount);
        }
    }
}
