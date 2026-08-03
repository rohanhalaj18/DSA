
import java.util.*;

public class Stock_Buy_And_Sell {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        
         //bruteforce

        // int max_profit = 0;
        // for (int i = 0; i < arr.length; i++) {

        //     for (int j = i + 1; j < arr.length; j++) {
        //         int profit = arr[j] - arr[i];
        //         max_profit = Math.max(max_profit, profit);
        //     }

        // }
        // System.out.println(max_profit);

        int min = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int value : arr) {
            if (value < min) {
                min = value;
            } else {
                max_profit = Math.max(max_profit, value - min);
            }
        }
        System.out.println(max_profit);
        
    }
}
