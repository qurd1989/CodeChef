package begginerDSA;

import java.util.Scanner;

public class ReviewProblem4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            String a = read.next();
            // Update your code below to solve this problem
            String b = "";
            for (int j = 0; j < a.length(); j++){
                char opp = (char)('z' - (a.charAt(j)-'a'));
                b += opp;
            }
            System.out.println(b);
        }
    }
}
