import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 52, 55, 8, 5, 2, 1 };
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int track=0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    track = 1;
                }
            }
            if (track!=1) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
