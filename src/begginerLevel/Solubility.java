package begginerLevel;

import java.util.Scanner;

public class Solubility {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0)
        {
            int x= sc.nextInt();
            int a= sc.nextInt();
            int b= sc.nextInt();
            System.out.println((a+(100-x)*b)*10);
        }
        sc.close();
    }
}
