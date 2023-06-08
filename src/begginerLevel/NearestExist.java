package begginerLevel;

import java.util.Scanner;

public class NearestExist {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt();

        while (t-- > 0){

            int x = sc.nextInt();

            if (x >= 50) {
                System.out.println("Right");
            }else
                System.out.println("Left");
        }
    }
}
