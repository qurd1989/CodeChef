package begginerLevel;

import java.util.Scanner;

public class GrossSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int salary = sc.nextInt();

            double lessSalary = salary + ((0.1 * salary) + (0.9 * salary));
            double moreSalary = salary + (500 + (0.98 * salary));

            if (salary > 1500) {
                System.out.println(lessSalary);
            }else
                System.out.println(moreSalary);
        }
    }
}
