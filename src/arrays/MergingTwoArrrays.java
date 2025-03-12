package arrays;

public class MergingTwoArrrays {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6}; // First array
        int size1 = 3;

        int[] arr2 = {8, 10, 12, 14}; // Second array
        int size2 = 4;
  //      mergeTwoArray(arr1, arr2, size1, size2);
        addElement();

    }
    public static void mergeTwoArray(int[] arr1, int [] arr2, int n, int m){

        int [] arr3 = new int[n + m];

        for(int i = 0; i < n; i++){
            arr3[i] = arr1[i];
        }
        for(int i = 0; i < m; i++){
            arr3[n + i] = arr2[i];
        }

        for(int i =0; i < n + m; i++){
            System.out.println(arr3[i]);
        }
    }
    public static void addElement() {
        int arr[] = new int[100];
        int length  =  0;
        for (int i = 0; i < 6; i++) {
            arr[length] = i;
            System.out.println(arr[length]);
            length++;
        }
    }

}
