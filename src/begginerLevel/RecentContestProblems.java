package begginerLevel;

import java.util.Scanner;

public class RecentContestProblems {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();

            sc.nextLine();
            String arr[] = sc.nextLine().split(" ");


            int count1 = 0;
            int count2 = 0;

            for (int k = 0; k < n; k++) {

                if (arr[k].contains("START38")){

                    count1++;
                }else
                    count2++;
            }

            System.out.println(count2 + " " + count1);
        }

    }
}
