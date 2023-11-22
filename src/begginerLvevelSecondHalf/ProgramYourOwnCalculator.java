package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ProgramYourOwnCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            char c = sc.next().charAt(0);
            System.out.println(solve(a, b ,c));
        }

    public  static double solve(double x, double y, char c) {

        double ans = 0.0;

        switch (c){
            case '+':
                ans = x + y;
                break;
            case '-':
                ans = x - y;
                break;
            case '*':
                ans = x * y;
                break;
            case '/':
                ans = x / y;
                break;
            default:
        }
        return ans;
    }

}
