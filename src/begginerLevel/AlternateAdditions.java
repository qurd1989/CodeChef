package begginerLevel;

import java.util.Scanner;

public class AlternateAdditions {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int t= ss.nextInt();
        while(t-->0)
        {
            int a = ss.nextInt();
            int b = ss.nextInt();
            if((b-a)%3 == 2)
            {
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}
