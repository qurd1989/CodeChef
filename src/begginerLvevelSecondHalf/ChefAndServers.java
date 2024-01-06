package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndServers {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t--> 0) {
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int k = sc.nextInt();
        int s = p1 + p2;
        int s1 = (s%(k*2));
        if (s1 <k){
            System.out.println("CHEF");
        }else
            System.out.println("COOK");
    }
    }
}
