package begginerLevel;

import java.util.Scanner;

public class MarioAndBullet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){

            int x = sc.nextInt(); // X is speed of Bullet per frame
            int y = sc.nextInt();// Y is goomba standing pixels away from him
            int z = sc.nextInt(); // Z is minimum seconds will take to goomba

            int ans = z- (y/x);

            if(ans <=0) {
                System.out.println(0);
            }else
                System.out.println(ans);


        }
    }
}
