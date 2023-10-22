package begginerLevel;

import javax.imageio.plugins.tiff.TIFFDirectory;
import java.util.Scanner;

public class ChefAndCookOff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {


            int arr[] = new int[5];
            int sum = 0;
            for (int i = 0; i < 5; i++){
                int ele = sc.nextInt();
                arr[i] = ele;

            }
            for (int i =0; i < 5; i++){
                if (arr[i] == 1) {
                    sum++;

                }
            }
            if (sum == 0) {
                System.out.println("Beginner");
            }else if (sum == 2){
                System.out.println("Middle Developer");
            }else if (sum == 1){
                System.out.println("Junior Developer");
            }else if (sum == 5) {
                System.out.println("Jeff Dean");
            }else if (sum == 3){
                System.out.println("Senior Developer");
            }else if(sum ==4)
                System.out.println("Hacker");
        }
    }
}
