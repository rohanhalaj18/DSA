
import java.util.*;
public class Apperars_once {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1,1,3 };
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        System.out.println(xor);
    }
}
