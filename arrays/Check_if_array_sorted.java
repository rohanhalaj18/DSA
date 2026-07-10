import java.util.*;
public class Check_if_array_sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5, 6 };
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("false");
                return;
            }
        }
        return ;
    }

}

