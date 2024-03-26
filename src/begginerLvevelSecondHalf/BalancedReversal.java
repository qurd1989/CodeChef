package begginerLvevelSecondHalf;

import java.util.Scanner;

public class BalancedReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            String binaryString = sc.next();
            String onesAndZerosAfterReversion = "";
            int countZeros = 0;
            int countOnes = 0;
            for (int i = 0; i < n; i++){
                if (binaryString.charAt(i) == '1') {
                    countOnes++;
                }else
                    countZeros++;
            }
            while (countZeros != 0){
                onesAndZerosAfterReversion +="0";
                countZeros--;
            }
            while (countOnes != 0){
                onesAndZerosAfterReversion +="1";
                countOnes--;
            }

            System.out.println(onesAndZerosAfterReversion);
        }

    }
}

