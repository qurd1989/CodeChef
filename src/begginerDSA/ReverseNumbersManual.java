package begginerDSA;

import java.util.Scanner;

public class ReverseNumbersManual {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int  b = read.nextInt();

        int reveredB = 0;
        int tempB = b;
        while (tempB > 0){
            int digit = tempB % 10;
            reveredB = reveredB * 10 +digit;
            tempB/=10;
        }

        if (reveredB == a){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}
