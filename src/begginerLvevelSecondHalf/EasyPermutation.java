package begginerLvevelSecondHalf;

import java.util.Scanner;

public class EasyPermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            for (int i = n; i > 0; i--) {
                System.out.println(i);
            }
        }
    }
}
