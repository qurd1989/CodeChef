package begginerLvevelSecondHalf;

import java.util.Scanner;

public class JourneyOfTheKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int four[] = new int[4];
            for (int i = 0; i < 4; i++){
                four[i] = sc.nextInt();
            }

            if ((four[0] + four[1]) % 2 == 0 && (four[2] + four[3]) % 2 ==0
            || (four[0] + four[1]) % 2 !=0 && (four[2] + four[3]) % 2 !=0 ){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
