package begginerLevel;

import java.util.Scanner;

public class FourHundredMRace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t -- > 0) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int alice = 400 /x;
            int bob   = 400 / y;
            int charlie = 400 / z;

            System.out.println(alice);
            System.out.println(bob);
            System.out.println(charlie);


            if(alice > bob || alice > charlie) {

                System.out.println("Alice");
            }else if (bob > alice ||  bob > charlie) {
                System.out.println("Bob");
            }else{
                System.out.println("Charlie");
            }
        }
    }
}
