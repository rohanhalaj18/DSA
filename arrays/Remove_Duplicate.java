
import java.util.*;
public class Remove_Duplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3, 4, 4,5 };

        //brute force
        // HashSet<Integer> newset=new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        //     newset.add(arr[i]);
        // }
        // System.out.println(newset);

        //optimal(method 1 using new arr)
        // int left=0;
        // int right=1;

        // int[] newarr = new int[arr.length];
        // int i=1;
        // newarr[0]=arr[0];
        // while (right < arr.length) {
        //     if (arr[left] == arr[right]) {
        //         right++;
        //     } else {
        //         newarr[i] = arr[right];
        //         i++;
        //         left = right;
        //         right++;
        //     }
        // }
        // System.out.println(i);
        // for (int j = 0; j < newarr.length; j++) {
        //     System.out.println(newarr[j]);
        // }

        //method 2(without using new arr)
        int i = 0;
        if (arr.length == 0)
            System.out.println(0);
        
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i+1);
    
    }
}
