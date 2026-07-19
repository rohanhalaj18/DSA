
import java.util.*;
public class Two_unique_numbers {
    public static void main(String[] args) {
        int arr[] = { 1,1, 2, 2, 3, 4, 4,5 };
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }

        int RightMostSetBit =xor & -xor;

        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & RightMostSetBit) != 0) {
                num1 ^= arr[i];
            } else {
                num2 ^= arr[i];
            }
        }
        System.out.println(num1+" "+num2);
    }
}
