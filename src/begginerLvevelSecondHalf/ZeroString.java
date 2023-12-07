package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZeroString {

    private static int checkOperations(String s,int n)
    {
        int no0=0,no1=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='0')
                no0++;
            else
                no1++;
        }
        if(no0==0)
            return 1;
        if(no1==0)
            return 0;
        if(no0<no1)
            return no0+1;

        return no1;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int T= scan.nextInt();
        while(T-->0)
        {
            int n= scan.nextInt();
            String s= scan.next();
            int ans= checkOperations(s,n);
            System.out.println(ans);
        }
    }
}
