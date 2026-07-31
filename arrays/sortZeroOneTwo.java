
import java.util.*;

public class sortZeroOneTwo {
     
    public static void main(String[] args) {
        //Dutch National Flag algo
        int[] nums = { 0, 2, 1, 2, 0, 1 };
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (mid <= end) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;
                start++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
    
}
