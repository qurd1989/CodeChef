package begginerDSA;

import java.util.Scanner;

public class ReviewProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            double chefSalary =  Math.pow(2, x);
            while (n --> 0) {
                chefSalary = chefSalary- (0.5 * chefSalary);
            }
            System.out.println((int)chefSalary);
        }
    }
}
