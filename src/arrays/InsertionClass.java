package arrays;

public class InsertionClass {
    public static void main(String[] args) {
        int arr[] = new int[100];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        int n = 4;
        int newPosition = 2;
        int newValue = 5;
        for (int i = n; i > newPosition; i--) {
            System.out.println("i: " + i);
            arr[i] = arr[i - 1];
        }

        System.out.println("Before Insertion");
        arr[newPosition] = newValue;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        n++;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nAfter Insertion");
    }
}
