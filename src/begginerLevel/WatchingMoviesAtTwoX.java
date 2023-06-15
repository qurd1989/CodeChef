package begginerLevel;

import java.util.Scanner;

public class WatchingMoviesAtTwoX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int firstYmins =  x - (y/2);
        System.out.println(firstYmins);
    }
}
