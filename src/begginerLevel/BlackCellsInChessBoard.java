package begginerLevel;

import java.util.Scanner;

public class BlackCellsInChessBoard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int blackCells  =  (int) Math.pow(n, 2) / 2;

        System.out.println(blackCells);


    }
}
