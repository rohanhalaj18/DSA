import java.util.*;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9,9, 15, 19};  // Sorted array
        int x = 9; // Target value
        int low = 0; //start index
        int high = arr.length - 1; //end index
        int ans = arr.length; //default value if not found
        

        while (low <= high) {
            int mid = low + (high-low) / 2;

            if (arr[mid] >x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
