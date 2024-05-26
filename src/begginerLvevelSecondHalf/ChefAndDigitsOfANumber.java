package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            String s = sc.next();
            int countZeroes = 0;
            int countOnes = 0;
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i)== '0'){
                    countZeroes++;
                }else
                    countOnes++;
            }

            if (countOnes ==1 || countZeroes ==1){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
