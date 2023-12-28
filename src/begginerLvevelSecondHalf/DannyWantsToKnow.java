package begginerLvevelSecondHalf;
import java.util.Scanner;
public class DannyWantsToKnow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int a [] = new int[n];
        int b [] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i< n; i++){
            b[i] = sc.nextInt();
        }


        for(int i = 0; i < q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int length = 0;
            for(int j = l-1; j < r-1; j++){
                length = length + (a[j]*b[j]);
            }
            System.out.println(length);
        }

    }
}
