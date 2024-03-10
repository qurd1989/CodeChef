package begginerDSA;

import java.util.Scanner;

public class PracticeProblem_DifferentConsecutiveChars {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            int n = read.nextInt();
            String s = read.next();
            // Update the code below to solve the problem
            int countConsecutive = 0;
            for (int j = 0 ; j < s.length()-1; j++) {
                if (s.charAt(j) == s.charAt(j+1)){
                    countConsecutive++;
                }
            }
            System.out.println(countConsecutive);
        }
    }
}
