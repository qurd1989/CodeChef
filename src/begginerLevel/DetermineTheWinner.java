package begginerLevel;

import java.util.Scanner;

public class DetermineTheWinner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt();

        while (t--> 0) {

            int pa = sc.nextInt(); // a
            int pb = sc.nextInt(); // and b problems in contest
            int qa= sc.nextInt(); // p
            int qb = sc.nextInt(); // and q  participators  in contest

            int p = Math.max(pa, pb);
            int q = Math.max(qa, qb);

            if (p > q) {
                System.out.println("P");
            }else if(p < q) {
                System.out.println("q");

            }else
                System.out.println("TIE");


        }
    }
}
