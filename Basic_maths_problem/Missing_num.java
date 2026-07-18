
import java.util.*;
public class Missing_num {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 ,3,7};
        int n = arr[arr.length - 1];

        int xorall = 0;
        for (int i = 0; i <= n; i++) {
            xorall = xorall ^ i;
        }
        int xorarr = 0;
        for (int i = 0; i < arr.length; i++) {
            xorarr = xorarr ^ arr[i];
        }
        int missing = xorall ^ xorarr;
        System.out.println(missing);
    }
}
