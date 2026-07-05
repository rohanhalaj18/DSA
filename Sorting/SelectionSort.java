import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 25, 5, 32, 2, 1 };
        int n = arr.length;
        for (int i = 0; i < (n - 1); i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
