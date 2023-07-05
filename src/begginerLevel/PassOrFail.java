package begginerLevel;

import java.util.Arrays;
import java.util.Scanner;

public class PassOrFail {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();   //  N is number questions
            int x = sc.nextInt();   //  X is Correct question
            int p = sc.nextInt();   // Chef need to score  P marks to pass the exam


            int  marksForCorrectQuestions = x * 3;
            int marksForWrongQuestions = (n - x) * 1;

            if (marksForCorrectQuestions - marksForWrongQuestions >= p) {

                System.out.println("Pass");
            }else
                System.out.println("Fail");


        }
    }
}
