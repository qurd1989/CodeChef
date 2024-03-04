package begginerLvevelSecondHalf;

import java.util.Scanner;

public class FarmerFeb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int n = x + y;
            int count = 0;
            int c = 0;
            int m = 0;
            while (count == 0){
                c = 0;
                n++;
                if (n % 2 == 0){
                    continue;
                }else {
                    for (int i = 0; i <= n/2; i++){
                        if (n%i == 0) {
                            c++;
                        }
                    }
                    if (c==1){
                        m = n;
                        count++;
                    }
                }
            }
            System.out.println(m-x-y);
        }
    }
}
