package begginerLvevelSecondHalf;

import java.util.Scanner;

public class GoodJoke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            String s = "123";
            System.out.println(fibonacci(n));
            enterLimit_Price(s);
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return (fibonacci(n - 1)+ fibonacci(n - 2));
    }


    public static void enterLimit_Price(String limit){
        int limitprice = Integer.valueOf(limit);
        double lastPrice = 123.45;
        double price = (limitprice * lastPrice)/ 100;
        //double limitPrice = Math.round(price * 10.0) /10.0;
       // long finalPrice = Math.round(limitPrice * 100);
        String  updatedPrice = String.valueOf(price);
        System.out.println(updatedPrice);

    }


}
