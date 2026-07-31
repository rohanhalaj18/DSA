import java.util.*;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
        int left = 0;
        int right = arr.length - 1;
        int target = 12;
        int flag = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("found");
                
                flag = 1;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (flag==0) {
            System.out.println("not found");
        }
    }
}
