package begginerDSA;

import java.util.Scanner;

public class PracticeProblemMarioAndTheBrokenString {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            int n = read.nextInt();
            String s = read.next();
            String s1 = "", s2 = "";
            for (int j = 0; j < n/2; j++){
                s1 += s.charAt(j);
            }
            for (int j = n/2; j < n; j++){
                s2+= s.charAt(j);
            }
            if (s1.equals(s2)){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}