package begginerLevel;

import java.util.Scanner;

public class Genes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            char x=sc.next().charAt(0);
            char y=sc.next().charAt(0);
            if(x=='R' || y=='R'){
                System.out.println('R');
            }else if(x=='B' || y=='B'){
                System.out.println('B');
            }else{
                System.out.println('G');
            }
        }
    }
