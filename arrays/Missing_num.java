import java.util.*;

public class Missing_num {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int n = arr[arr.length - 1];
        int Excepted_sum = (n * (n + 1)) / 2;
        int Real_sum=0;
        for (int i = 0; i < arr.length; i++) {
            Real_sum += arr[i];
        }
        System.out.println(Excepted_sum-Real_sum);
    }
}
