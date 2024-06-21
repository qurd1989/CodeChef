package begginerLvevelSecondHalf;

import java.util.Scanner;

public class AnotherCardGameProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--> 0){
            int pc = sc.nextInt();
            int pr  = sc.nextInt();

            int pcPower = (pc + 8)/9;
            int prPower = (pr + 8)/9;

            if (pcPower > prPower){
                System.out.println("1" + " " + prPower);
            }else if (pcPower < prPower){
                System.out.println("0" + " " + pcPower);
            } else if (pcPower == prPower) {
                System.out.println("1" + " " + pcPower);
            }
//            System.out.println(calcGCD(pc,pr));
        }
    }
    public static int calcGCD1(int n, int m){
        if (n== 0){
            return m;
        }
        return calcGCD(m% n, n);
      }
    public static int calcGCD(int n, int m){
        while (n != 0){
            int nValue = m % n;
              m = n;
            n = nValue;
        }
        return m;
    }
}
