package begginerLevel;

import javax.print.attribute.Size2DSyntax;
import java.util.Scanner;

public class QualifyTheRound {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int easyProblem = a * 1;
            int hardProblem = b * 2;

            if(easyProblem + hardProblem > x) {
                System.out.println("Qualify");


            }else

                System.out.println("NotQualify");
        }
    }
}
