package begginerLevel;

import java.util.Scanner;

public class CarAndBus {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > y) {
                System.out.println("Car");

            }else if(x < y){
                System.out.println("Bike");
            }else
                System.out.println("Same");

        }
    }
}
