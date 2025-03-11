package arrays;

public class DeletionArray {
    public static void main(String[] args) {

        int[] arr = new int[100];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        int n = 5;
        int positionToDelete = 2;

        for (int i = positionToDelete; i < n; i++) {
            System.out.println("i: " + i);
            arr[i] = arr[i + 1];
        }
        n--;
        for (int i = positionToDelete; i < n; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
