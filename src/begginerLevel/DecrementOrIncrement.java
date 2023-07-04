package begginerLevel;

import java.util.Scanner;

public class DecrementOrIncrement {

    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);


           int n = read.nextInt();

            if (n % 4 == 0) {
                n++;
            }else
                n--;
            System.out.println(n);


    }
}
