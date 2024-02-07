package begginerLvevelSecondHalf;

import java.util.Scanner;

public class WorldRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            float k1 = sc.nextFloat();
            float k2 = sc.nextFloat();
            float k3 = sc.nextFloat();
            float v = sc.nextFloat();
             k1 = k1 * k2 * k3 *v;
             k1 = 100/k1;
            if(k1 < 9.575){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}
