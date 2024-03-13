package begginerDSA;

import java.util.Scanner;

public class ReviewProblem2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            String s = sc.next();
            String ans = "Yes";
            for (int j = 0; j < s.length(); j=+2) {
                Character c1 = s.charAt(j);
                Character c2 = s.charAt(j+1);
                if (c1.equals(c2)){
                    ans = "NO";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
