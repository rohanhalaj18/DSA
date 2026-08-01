
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 2,2,1,1,1,2,2 };
        int ans = 0;
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ans = arr[i];

            }
            if (ans == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(ans);
    }
}
