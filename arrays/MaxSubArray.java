
import java.util.*;
public class MaxSubArray {
    public static void main(String[] args) {
        //Kadane's Algorithm 


//  Golden Rule

// If your running sum becomes negative,

// throw it away.

// Start a new subarray.

// That's the entire algorithm.

        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : arr) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
