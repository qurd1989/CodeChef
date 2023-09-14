package DSAPreparetion1;

import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int countPower = 0;
        for (int i = 0 ; i < t; i++) {
            long n =sc.nextInt();

            while (n % 2 == 0) {
                    n/=2;
                    countPower++;
                }
            }

            if (countPower % 2 == 0){
                System.out.println(1);
            }else
                System.out.println(0);
        }

    }

