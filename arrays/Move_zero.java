
import java.util.*;
public class Move_zero {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 5, 8, 1, 0, 1 };
        int left=0;
        int right = 0;
        int temp;
        while (right < arr.length) {
            if (arr[right] != 0) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;

            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
