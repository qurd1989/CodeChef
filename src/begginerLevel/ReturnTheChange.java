package begginerLevel;

import javax.imageio.plugins.tiff.TIFFDirectory;
import java.util.Scanner;

public class ReturnTheChange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int a = 100 - n;


            if (a % 10 == 0 ) {
                System.out.println(a);
            }else if (a % 10 <= 5) {
                System.out.println(a -(a % 10));
            }else
                System.out.println(a + 10 - (a % 10));

        }
    }
}
