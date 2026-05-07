
import java.util.Arrays;

public class Reversearray {
    public static void Reverse(int a[]) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 6, 4 };
        Reverse(a);
    }
}
