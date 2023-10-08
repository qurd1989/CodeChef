package begginerLevel;

import java.util.Scanner;

public class ChefAndPriceControl {

    public static void main(String[] args) {


        Scanner sc  = new Scanner(System.in);
        int t =  sc.nextInt();
        while (t--> 0) {
            int n =sc.nextInt();
            int k =sc.nextInt();

            int price= sovle(sc, n,k);
            System.out.println(price);
        }
    }
    public  static  int sovle(Scanner sc, int n, int k){
        int lostRevenue = 0;
        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            if (price > k) {
                lostRevenue += (price - k);

            }
        }
        return lostRevenue;
    }
}
