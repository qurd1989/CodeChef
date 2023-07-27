package begginerLevel;

import java.util.Scanner;

public class BuyLamps {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt(); // N numbers Lamps will be bought
            int k = sc.nextInt();
            int x = sc.nextInt(); // Red Lamp cost for X r
            int y = sc.nextInt(); // Blue lamp cost  for Y r
            if(x>y){
                System.out.println((k*x) + ((n-k)*y));
            }
            else{
                System.out.println(n*x);
            }
        }
    }
}
