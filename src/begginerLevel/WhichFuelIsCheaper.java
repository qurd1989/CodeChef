package begginerLevel;

import java.util.Scanner;

public class WhichFuelIsCheaper {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int x = s.nextInt(); //current price of petrol
            int y = s.nextInt(); //current price of diesel
            int a = s.nextInt();// petrol  increase price
            int b = s.nextInt(); // diesel increase price
            float k = s.nextInt(); // months

            float petrol  = x + k *a;
            float diesle  = y + k  *b;

            if (petrol < diesle) {
                System.out.println("PETROL");
            }else if ( petrol >  diesle){
                System.out.println("DIESEL");
            }else
                System.out.println("Same Price");

        }
    }
}
