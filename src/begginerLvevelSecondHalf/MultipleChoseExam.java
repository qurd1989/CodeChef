package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MultipleChoseExam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
        int n = sc.nextInt();
        String answer = sc.next();
        String chefAnswers = sc.next();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (answer.charAt(i) == chefAnswers.charAt(i)) {
                ans++;
            } else if (chefAnswers.charAt(i) == 'N') {
                continue;
            } else
                i++;
        }
            System.out.println(ans);
        }
    }
}
