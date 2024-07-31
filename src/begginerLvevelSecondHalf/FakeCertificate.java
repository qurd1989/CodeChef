package begginerLvevelSecondHalf;

import java.util.Scanner;

public class FakeCertificate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            String s = sc.next();
            int countOnes = 0;
            int countZeros = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1'){
                    countOnes++;
                    countZeros= 0;
                }else {
                    countZeros++;
                    max = Math.max(max, countZeros);

                }
            }

            System.out.println(max + countOnes);
        }
    }
}
