package begginerLevel;

import java.util.Scanner;

public class MileageMatters {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt(); // Restaurant is N km away
            int x = sc.nextInt(); // X is cost of petrol
            int y = sc.nextInt(); //  Y is cost Diesel
            int a = sc.nextInt(); // One litter petrol required to travel A km`s
            int b = sc.nextInt(); // One litter Diesel required to travel B km`s

            int costOfPetrol = (n / a) *x;
            int costOfDiesel = (n / b) * y;

            if (costOfDiesel > costOfPetrol) {
                System.out.println("PETROL");
            } else if (costOfDiesel < costOfPetrol) {
                System.out.println("DIESEL");
            }else
                System.out.println("ANY");

        }
    }
}
