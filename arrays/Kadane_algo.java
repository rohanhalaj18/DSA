
import java.util.*;
public class Kadane_algo {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, -8, 5, 8, -1, 5 };
        int current = 0;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            current += num;
            max = Math.max(max, current);
            if (current < 0) {
                current = 0;
            }
        }
        System.out.println(max);
    }
}
