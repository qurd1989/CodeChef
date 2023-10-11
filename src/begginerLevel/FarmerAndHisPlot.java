package begginerLevel;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class FarmerAndHisPlot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int gcd = gcd(n,m);

            int  plotArea = gcd * gcd;
            int minPlots = (n * m) /plotArea;
            System.out.println(minPlots);
        }
    }
    public  static int gcd(int n, int m){
        if (m == 0) {
            return n;
        }
        return gcd(m, n% m);
    }
}
