package begginerLvevelSecondHalf;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChefAndCookOffContests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {

            int n = sc.nextInt();
            String [] arr = new String [n];
            for(int j=0;j<n;j++){
                arr[j]= sc.next();
            }
            int s = 0;
            int c=0;
            int e =0;
            int em =0;
            int m =0;
            int mh = 0;
            int h =0;
            for(int j=0;j<n;j++){
                if(arr[j].equals("cakewalk")){
                    c++;
                }
                else if(arr[j].equals("simple")){
                    s++;
                }
                else if(arr[j].equals("easy")){
                    e++;
                } else if(arr[j].equals("easy-medium")){
                    em++;
                }else if(arr[j].equals("medium")){
                    m++;
                }else if(arr[j].equals("medium-hard")){
                    mh++;
                }else if(arr[j].equals("hard")){
                    h++;
                }
            }
            int count=0;
            if( c>=1 && s>=1 && e>=1){
                count++;
            }
            if(em>=1 || m>=1){
                count++;
            }
            if(mh>=1 || h>=1){
                count++;
            }

            if(count==3){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
