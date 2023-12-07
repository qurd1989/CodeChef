package begginerLvevelSecondHalf;

import java.util.Scanner;

public class OddPairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            long n = sc.nextInt();
            System.out.println((n*n)/2);
        }
    }
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int num1 = (int)Math.sqrt(num);

        for(int i = 2;  i<= num1; i++){
            if(num % i ==0){
                if(num/i != i){
                    sum += i;
                    sum += num/i;
                }else{
                    sum +=i;
                }
            }

        }
        return sum == num;
    }
}

