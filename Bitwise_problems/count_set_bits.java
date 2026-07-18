
import java.util.*;

public class count_set_bits {
    public static void main(String[] args) {
        int n = 11;
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        System.out.println(count);

        //   Method 2: Brian Kernighan’s Algorithm
        int n2 = 29;
        int count2 = 0;
        while (n2 > 0) {
            n2 = n2 & (n2 - 1);
            count2++;
        }
        System.out.println(count2);
    }
}
