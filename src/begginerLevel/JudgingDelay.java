package begginerLevel;

import java.util.Scanner;

public class JudgingDelay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++){
                int s = sc.nextInt();
                int j = sc.nextInt();

                if ((Math.abs(s- j) > 5)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
