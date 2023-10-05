package begginerLevel;
import java.util.*;
import javax.swing.plaf.synth.SynthDesktopIconUI;

public class ShoeFit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a != b || a !=c || b !=c) {
                System.out.println(1);
            }else
                System.out.println(0);
        }
    }
}
