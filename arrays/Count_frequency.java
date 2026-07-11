import java.util.*;
public class Count_frequency {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 8, 2, 10, 10, 5, 8 };
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(" "+arr[i]+" -> "+count);
        }
    }
}






