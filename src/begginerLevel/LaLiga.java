package begginerLevel;

import java.util.Scanner;

public class LaLiga {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            for (int j=0; j<4; j++){
                String s= sc.next();
                int n = sc.nextInt();
                if (s.equals("Barcelona"))
                    a=n;
                else if (s.equals("Malaga"))
                    c=n;
                else if (s.equals("RealMadrid"))
                    d=n;
                else if (s.equals("Eibar"))
                    b=n;
            }
            if (c>d && a>b){
                System.out.println("Barcelona");
            }
            else{
                System.out.println("RealMadrid");
            }

            t--;

        }
    }
}
