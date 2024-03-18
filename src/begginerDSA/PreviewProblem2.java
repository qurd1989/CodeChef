package begginerDSA;

import java.util.Scanner;

public class PreviewProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int s = ((k*(k+1)) /2);

            if (s<=n){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
